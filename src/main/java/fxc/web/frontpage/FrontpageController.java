package fxc.web.frontpage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class FrontpageController {
	
	@RequestMapping(value = "/frontpage1/{page}")
	public String frontpage1(@PathVariable("page") String page) {
		return "frontpage/" + page;
	}
	
	@RequestMapping(value = "/frontpage/{page}")
	public String frontpage(@PathVariable("page") String page) {
		return "frontpage/" + page;
	}
	
	
	
	

}
