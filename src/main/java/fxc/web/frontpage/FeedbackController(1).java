package fxc.web.frontpage;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import fxc.entity.Message;
import fxc.service.message.MessageService;;



@Controller
@SessionAttributes("contactus")

public class FeedbackController {
	@Autowired
	private MessageService messageService;
	
	@RequestMapping(value = "/frontpage1/feedback", method = RequestMethod.GET)
	public String introduce() {
		
		return "config/feedback";		
	}
	
	@RequestMapping(value = "/frontpage/addfeedback", method = RequestMethod.POST)
	public String addWaybill(String name, String phone, String content) {
		Message message = new Message(); 
		message.setName(name);
		message.setPhone(phone);
		message.setContent(content);
		
		messageService.saveMessage(message);
		return "redirect:/frontpage1/feedback";
	}
	

	 
	
}	
