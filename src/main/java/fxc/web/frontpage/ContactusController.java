package fxc.web.frontpage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import fxc.entity.WlConfig;
import fxc.service.Config.ConfigService;


@Controller
@SessionAttributes("contactus")

public class ContactusController {
	@Autowired
	private ConfigService configService;
	
	@RequestMapping(value = "/frontpage1/contactus", method = RequestMethod.GET)
	public String introduce(Model model) {
		WlConfig contactus = configService.findById(2);
		model.addAttribute("contactus", contactus);
		return "config/contactus";		
	}
	

	 
	
}	
