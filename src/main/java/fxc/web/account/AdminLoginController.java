package fxc.web.account;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fxc.entity.Administer;
import fxc.service.account.AdminService;

@Controller
@RequestMapping(value = "/admin")
public class AdminLoginController {

	@Autowired
	private AdminService adminService;

	@RequestMapping(value = "logins", method = RequestMethod.POST)
	public String success(Administer admin, HttpServletResponse response, HttpServletRequest request) {
		String username = admin.getUsername();
		String pwd = admin.getPassword();
		HttpSession session = request.getSession();
		Administer tmp = adminService.getAdmin(username);
		if (pwd.equals(tmp.getPassword())) {
			session.setAttribute("admin", tmp);
			System.out.println(tmp.getUsername() + " " + tmp.getId());
			return "account/index";
		} else {
			request.setAttribute("error", "用户名密码错误");
			return "redirect:/admin/login";
		}
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String AdminLogin() {
		return "admin/login";
	}

	@RequestMapping(value = "logout")
	public String AdminLogout(HttpServletResponse response, HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("admin", null);
		return "admin/login";
	}

	@RequestMapping(value = "default", method = RequestMethod.GET)
	public String defult() {
		return "account/default";
	}

}
