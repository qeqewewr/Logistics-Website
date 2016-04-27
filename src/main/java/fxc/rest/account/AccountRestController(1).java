package fxc.rest.account;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import fxc.entity.Owner;
import fxc.entity.User;
import fxc.service.account.AccountService;

@Controller
@RequestMapping(value = "/api/account")
public class AccountRestController {

	private static Logger logger = LoggerFactory.getLogger(AccountRestController.class);

	@Autowired
	private AccountService accountService;

	@RequestMapping(value = "login", method = RequestMethod.POST)
	@ResponseBody
	public String login(String username, String password) {

		logger.info(username + "尝试连接");

		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		Subject currentUser = SecurityUtils.getSubject();
		try {
			currentUser.login(token);
			return "true";
		} catch (Exception e) {
			return "false";
		}

	}
	
	@RequestMapping(value="edit",method=RequestMethod.POST)
	@ResponseBody
	public String editOwner(String username,String name,String eamil,int age,String phone,String sex){
		
		Owner owner=accountService.findOwnerByUsername(username);
		owner.setName(name);
		owner.setEmail(eamil);
		owner.setAge(age);
		owner.setPhone(phone);
		owner.setSex(sex);
		logger.info(owner.getWlUser().getLoginName());
		accountService.updateOwner(owner);
		return "true";
	}

	@RequestMapping(value = "login_get", method = RequestMethod.GET)
	public String logins() {
		return "account/index";
	}

	@RequestMapping(value = "infro/{username}", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getInformation(@PathVariable("username") String username) {

		User user = accountService.findUserByLoginName(username);
		Owner owner = accountService.findOwnerByUser(user.getId());

		logger.info(username + "传值成功");

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", user.getName());
		map.put("email", user.getEmail());
		map.put("number", owner.getNumber());
		map.put("sex", owner.getSex());
		map.put("age", owner.getAge());
		map.put("phone", owner.getPhone());
		map.put("lead", owner.getWlController().getWlUser().getName());
		return map;

	}

}
