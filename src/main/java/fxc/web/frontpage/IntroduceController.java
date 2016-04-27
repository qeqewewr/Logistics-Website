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
@SessionAttributes("introduce")

public class IntroduceController {
	@Autowired
	private ConfigService configService;
	
	@RequestMapping(value = "/frontpage1/introduce", method = RequestMethod.GET)
	public String introduce(Model model) {
		WlConfig introduce = configService.findById(1);
		model.addAttribute("introduce", introduce);
		return "config/introduce";
		
	}
	

	 
	
}	
