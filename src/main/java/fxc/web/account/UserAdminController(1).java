package fxc.web.account;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fxc.entity.Administer;
import fxc.entity.Contro;
import fxc.entity.Customer;
import fxc.entity.Manager;
import fxc.entity.Owner;
import fxc.entity.Role;
import fxc.entity.User;
import fxc.service.account.AccountService;
import fxc.service.account.AdminService;
import fxc.service.account.RoleService;
//import fxc.util.*;

/**
 * 管理员管理用户的Controller.
 * 
 * @author calvin
 * 
 *         changed by fxc
 */
@Controller
@RequestMapping(value = "/admin")
@SessionAttributes("admin")
public class UserAdminController {

	@Autowired
	private AccountService accountService;

	@Autowired
	private AdminService adminService;

	@Autowired
	private RoleService roleService;

	/**
	 * 用户管理
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "user", method = RequestMethod.GET)
	public String list(Model model) {
		List<User> users = accountService.getAllUser();
		model.addAttribute("users", users);
		return "account/adminSelfList";
	}

	@RequestMapping(value = "user/update/{id}", method = RequestMethod.GET)
	public String updateForm(@PathVariable("id") Long id, Model model) {
		model.addAttribute("user", accountService.getUser(id));
		return "account/adminSelfForm";
	}

	@RequestMapping(value = "user/update", method = RequestMethod.POST)
	public String update(@Valid @ModelAttribute("user") User user, Model model) {
		accountService.updateUser(user);
		long id = user.getRole().getId();
		model.addAttribute("role", id);
		long userid = user.getId();
		model.addAttribute("userid", userid);
		List leads;
		List<Contro> cts;
		if (id == 1) {
			leads = accountService.findAllManager();
			model.addAttribute("leads", leads);
		} else if (id == 4) {
			leads = accountService.findAllController();
			model.addAttribute("leads", leads);
		}if (id == 2) {
			List<Contro> contros = accountService.findAllController();
			model.addAttribute("controller", contros);
		}
		return "/account/detailForm";
	}

	@RequestMapping(value = "user/update1", method = RequestMethod.POST)
	public String update1(HttpServletRequest request, RedirectAttributes redirectAttributes) {
		// 不允许更改用户的角色
		String roleid = request.getParameter("id");
		String sex = request.getParameter("sex");
		String phone = request.getParameter("phone");
		String age = request.getParameter("age");
		String lead = new String();
		long userid = Long.parseLong(request.getParameter("userid"));
		long id = Long.parseLong(roleid);
		if (id == 1) {
			lead = request.getParameter("lead"); // 得到上级领导
			// Contro controller = accountService.getController(userid); // 得到要更改的主管的信息
			Contro controller = accountService.findControByUserid(userid);
			controller.setSex(sex);
			controller.setAge(Integer.parseInt(age));
			controller.setPhone(phone);
			Manager tmp = accountService.getManager(Long.parseLong(lead));
			controller.setWlManager(tmp);
			accountService.updateController(controller);
			redirectAttributes.addFlashAttribute("message", "更新主管" + controller.getWlUser().getName() + "成功");
		} else if (id == 2) {
			// Customer customer = accountService.getCustomer(userid);
			String crm = request.getParameter("crm");
			Contro ctr = accountService.getController(Long.parseLong(crm));
			Customer customer = accountService.findCustomerByUser(userid);
			customer.setWlController(ctr);
			customer.setAge(Integer.parseInt(age));
			customer.setSex(sex);
			customer.setPhone(phone);
			accountService.updateCustomer(customer);
			redirectAttributes.addFlashAttribute("message", "更新客户" + customer.getWlUser().getName() + "成功");
		} else if (id == 3) {
			// Manager mag = accountService.getManager(userid);
			Manager mag = accountService.findManagerByUser(userid);
			mag.setAge(Integer.parseInt(age));
			mag.setSex(sex);
			mag.setPhone(phone);
			accountService.updateManager(mag);
			redirectAttributes.addFlashAttribute("message", "更新经理" + mag.getWlUser().getName() + "成功");
		} else if (id == 4) {
			lead = request.getParameter("lead");

			Contro ctr = accountService.getController(Long.parseLong(lead));
			// Owner owner = accountService.getOwner(userid);
			Owner owner = accountService.findOwnerByUser(userid);
			owner.setAge(Integer.parseInt(age));
			owner.setSex(sex);
			owner.setPhone(phone);
			owner.setWlController(ctr);
			accountService.updateOwner(owner);
			redirectAttributes.addFlashAttribute("message", "更新车主" + owner.getWlUser().getName() + "成功");
		}
		return "redirect:/admin/user";
	}

	@RequestMapping(value = "user/delete/{id}")
	public String delete(@PathVariable("id") Long id, RedirectAttributes redirectAttributes) {
		User user = accountService.getUser(id);
		accountService.deleteUser(id);
		redirectAttributes.addFlashAttribute("message", "删除用户" + user.getLoginName() + "成功");
		return "redirect:/admin/user";
	}

	@RequestMapping(value = "user/add", method = RequestMethod.GET)
	public String addUser() {
		return "account/addUser";
	}

	@RequestMapping(value = "user/addform", method = RequestMethod.POST)
	public String addUserForm(String type, @Valid User user, Model model) {
		Role role = roleService.getRole(type);
		user.setRole(role);
		accountService.registerUser(user);
		Long roleid = user.getRole().getId();
		model.addAttribute("roleid", roleid);
		User tmp = accountService.findUserByLoginName(user.getLoginName());
		model.addAttribute("userid", tmp.getId());
		if (roleid == 1) {
			List<Manager> managers = accountService.findAllManager();
			model.addAttribute("leads", managers);
//			Map<String,String> postmap=new HashMap<String, String>();
//			postmap.put("module", "Settings");
//			postmap.put("action", "SaveMoreInfo");
//			postmap.put("user_name", user.getLoginName());
//			postmap.put("user_password", user.getPassword());
//			postmap.put("last_name", user.getName());
//			postmap.put("email1", user.getEmail());
//			try {
//				NetUtils.doPost("/index.php", postmap);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			//postmap.put("phone_mobile",)
		} else if (roleid == 4) {
			List<Contro> controllers = accountService.findAllController();
			model.addAttribute("leads", controllers);
			
		}

		if (roleid == 2) {
			List<Contro> contros = accountService.findAllController();
			model.addAttribute("controller", contros);
		}

		return "account/addUser1";
	}

	@RequestMapping(value = "user/add1", method = RequestMethod.POST)
	public String addUser1Form(HttpServletRequest request, RedirectAttributes redirectAttributes) {
		String roleid = request.getParameter("id");
		String sex = request.getParameter("sex");
		String phone = request.getParameter("phone");
		String age = request.getParameter("age");
		String userid = request.getParameter("userid");
		String lead = new String();
		String crm = new String();
		long id = Long.parseLong(roleid);
		User user = accountService.getUser(Long.parseLong(userid));
		if (id == 1) {
			lead = request.getParameter("lead"); // 得到上级领导
			Contro controller = new Contro(); // 得到要更改的主管的信息
			controller.setSex(sex);
			controller.setAge(Integer.parseInt(age));
			controller.setPhone(phone);
			controller.setWlUser(user);
			Manager tmp = accountService.getManager(Long.parseLong(lead));
			controller.setWlManager(tmp);
			// accountService.updateController(controller);
			accountService.addController(controller);
			redirectAttributes.addFlashAttribute("message", "添加主管" + controller.getWlUser().getName() + "成功");
		} else if (id == 2) {
			crm = request.getParameter("crm");
			Contro ctr = accountService.getController(Long.parseLong(crm));
			Customer customer = new Customer();
			customer.setAge(Integer.parseInt(age));
			customer.setSex(sex);
			customer.setPhone(phone);
			customer.setWlUser(user);
			customer.setWlController(ctr);

			// accountService.updateCustomer(customer);
			accountService.addCustomer(customer);
			redirectAttributes.addFlashAttribute("message", "添加客户" + customer.getWlUser().getName() + "成功");
		} else if (id == 3) {
			Manager mag = new Manager();
			mag.setAge(Integer.parseInt(age));
			mag.setSex(sex);
			mag.setPhone(phone);
			mag.setWlUser(user);
			// accountService.updateManager(mag);
			accountService.addManager(mag);
			redirectAttributes.addFlashAttribute("message", "添加经理" + mag.getWlUser().getName() + "成功");
		} else if (id == 4) {
			lead = request.getParameter("lead");
			Contro ctr = accountService.getController(Long.parseLong(lead));
			Owner owner = new Owner();
			owner.setAge(Integer.parseInt(age));
			owner.setSex(sex);
			owner.setPhone(phone);
			owner.setWlController(ctr);
			owner.setWlUser(user);
			// accountService.updateOwner(owner);
			accountService.addOwner(owner);
			redirectAttributes.addFlashAttribute("message", "更新车主" + owner.getWlUser().getName() + "成功");
		}
		return "redirect:/admin/user";
	}

	// 管理员对管理员管理

	// 跳转管理员管理界面
	@RequestMapping(value = "admin", method = RequestMethod.GET)
	public String addAdmin(Model model) {

		List<Administer> Administers = adminService.getAllAdmins();
		// model.addAllAttributes(Administers);
		model.addAttribute("admins", Administers);
		return "account/adminUserList";
	}

	@RequestMapping(value = "admin/add")
	public String addAdmin() {
		return "account/register";
	}

	// 跳转管理员列表
	@RequestMapping(value = "admin", method = RequestMethod.POST)
	public String addAdmin(Administer administer, Model model) {
		adminService.editAdmin(administer);
		List<Administer> Administers = adminService.getAllAdmins();
		// model.addAllAttributes(Administers);
		model.addAttribute("admins", Administers);
		return "account/adminUserList";
	}

	@RequestMapping(value = "profile", method = RequestMethod.GET)
	public String changePasswordForm() {
		return "account/profile";
	}

	/**
	 * 管理员修改密码
	 * 
	 * @param admin
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "profile", method = RequestMethod.POST)
	public String changePassword(@ModelAttribute("admin") Administer admin, HttpSession session) {
		adminService.editAdmin(admin);
		session.setAttribute("admin", admin);
		return "/account/default";
	}

	/**
	 * 删除管理员
	 * 
	 * @param id
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping(value = "admin/delete/{id}")
	public String deleteAdmin(@PathVariable("id") Long id, RedirectAttributes redirectAttributes) {
		Administer admin = adminService.deleteAdmin(id);
		accountService.deleteUser(id);
		redirectAttributes.addFlashAttribute("message", "删除用户" + admin.getUsername() + "成功");
		return "redirect:/admin/admin";
	}

	@RequestMapping(value = "admin/update/{id}", method = RequestMethod.GET)
	public String updateFormAdmin(@PathVariable("id") Long id, Model model) {
		model.addAttribute("adminChange", adminService.getAdmin(id));
		return "account/adminUserForm";
	}

	@RequestMapping(value = "admin/update", method = RequestMethod.POST)
	public String updateAdmin(@Valid @ModelAttribute("adminChange") Administer admin,
			RedirectAttributes redirectAttributes) {
		// accountService.updateUser(user);
		adminService.editAdmin(admin);
		redirectAttributes.addFlashAttribute("message", "更新用户" + admin.getUsername() + "成功");
		return "redirect:/admin/admin";
	}

	/**
	 * 所有RequestMapping方法调用前的Model准备方法, 实现Struts2 Preparable二次部分绑定的效果,先根据form的id从数据库查出User对象,再把Form提交的内容绑定到该对象上。
	 * 因为仅update()方法的form中有id属性，因此仅在update时实际执行.
	 */
	@ModelAttribute
	public void getUser(@RequestParam(value = "id", defaultValue = "-1") Long id, Model model) {
		if (id != -1) {
			model.addAttribute("user", accountService.getUser(id));
		}
	}

	/**
	 * Ajax请求校验userName是否唯一。
	 */
	@RequestMapping(value = "admin/checkLoginName")
	@ResponseBody
	public String checkLoginName(@RequestParam("username") String loginName) {
		if (adminService.findUserByName(loginName) == null) {
			return "true";
		} else {
			return "false";
		}
	}

	@RequestMapping(value = "user/checkLoginName")
	@ResponseBody
	public String checkUserName(@RequestParam("loginName") String loginName) {
		if (accountService.findUserByLoginName(loginName) == null) {
			return "true";
		} else {
			return "false";
		}
	}
}
