package fxc.web.frontpage;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fxc.entity.User;
import fxc.entity.Contro;
import fxc.entity.Customer;
import fxc.entity.Manager;
import fxc.entity.Waybill;
import fxc.entity.WlNew;
import fxc.service.Manager.ManagerService;
import fxc.service.Contro.ControService;
import fxc.service.account.AccountService;
import fxc.service.customer.CustomerService;
import fxc.service.account.ShiroDbRealm.ShiroUser;


@Controller
@SessionAttributes("relation")

public class RelationController {
	@Autowired
	private ManagerService managerService;
	
	@Autowired
	private ControService controService;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value = "/controllerRelation", method = RequestMethod.GET)
	public String list(Model model) {
		ShiroUser shirouser = (ShiroUser)SecurityUtils.getSubject().getPrincipal();
		User user = accountService.findUserByLoginName(shirouser.loginName);
		Contro contro = controService.getControllerByUser(user);
		List <Customer> customers = customerService.getCustomerByContro(contro);
		model.addAttribute("customers", customers);
		
		return "controller/customerRelation";		
	}
	
	
	@RequestMapping(value = "/relationManage", method = RequestMethod.GET)
	public String relationManage(Model model) {
		ShiroUser shirouser = (ShiroUser)SecurityUtils.getSubject().getPrincipal();
		User user = accountService.findUserByLoginName(shirouser.loginName);
		Manager manager = managerService.getManagerByUser(user);
		List <Contro> contros = controService.getControByManager(manager);
		model.addAttribute("contros", contros);
		return "manager/relationManage";		
	}
	

	@RequestMapping(value = "/relatedCustomer/{id}")
	public String waybilldetail(@PathVariable("id") long id, Model model ) {
		Contro contro = controService.getControllerByID(id);
		List <Customer> customers = customerService.getCustomerByContro(contro);
		model.addAttribute("customers", customers);
		model.addAttribute("controller",contro);
		return "manager/relatedCustomer";
	}
	
	@RequestMapping(value = "/relatedCustomer/delete/{coid}/{cuid}", method = RequestMethod.GET)
	public String deleteRelation(@PathVariable("coid") long coid, @PathVariable("cuid") long cuid , RedirectAttributes redirectAttributes) {
		String pageid = Long.toString(coid);
		Customer customer = customerService.findCustomerByid(cuid);
		customer.setWlController(null);
		customerService.SaveCustomer(customer);
		redirectAttributes.addFlashAttribute("message", "删除客户关系成功");
		return "redirect:/relatedCustomer/" + pageid;
	}
	
	@RequestMapping(value = "/relatedCustomer/add/{id}")
	public String addRelation(@PathVariable("id") long id, Model model) {
		Contro controller = controService.getControllerByID(id);
		model.addAttribute("controller",controller);
		return "manager/addrelation";
	}
	
	@RequestMapping(value = "/addrelation", method = RequestMethod.POST)
	public String addRelationForm(long controllerID, String name, String sex, int age, String phone , String email, RedirectAttributes redirectAttributes) {
		Contro controller = controService.getControllerByID(controllerID);
		String pageid = Long.toString(controllerID);
		Customer customer = new Customer();
		customer.setName(name);
		customer.setSex(sex);
		customer.setAge(age);
		customer.setPhone(phone);
		customer.setEmail(email);
		customer.setWlController(controller);
		customerService.SaveCustomer(customer);
		redirectAttributes.addFlashAttribute("message", "添加客户关系成功");
		return "redirect:/relatedCustomer/" + pageid;	
	}
	
	
	

	 
	
}	
