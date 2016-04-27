package fxc.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fxc.entity.WlConfig;
import fxc.service.Config.ConfigService;

@Controller
@RequestMapping(value = "/admin/config")
public class CompanyController {

	@Autowired
	private ConfigService configService;

	@RequestMapping(value = "company/edit", method = RequestMethod.GET)
	public String adminGetCompany(Model model) {
		WlConfig config = configService.findById(1);
		model.addAttribute("content", config.getContent());
		return "config/company";
	}

	/**
	 * 
	 * 
	 * @return
	 */
	@RequestMapping(value = "company/edit", method = RequestMethod.POST)
	public String adminSetCompany(String editorValue) {
		configService.saveConfig(1, editorValue);
		return "account/index";
	}

	@RequestMapping(value = "profile/edit", method = RequestMethod.GET)
	public String adminGetProfile(Model model) {
		WlConfig config = configService.findById(2);
		model.addAttribute("content", config.getContent());
		return "config/profile";
	}

	@RequestMapping(value = "profile/edit", method = RequestMethod.POST)
	public String adminSetProfile(String editorValue) {
		configService.saveConfig(2, editorValue);
		return "account/index";
	}
}
