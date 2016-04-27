package fxc.web.frontpage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import fxc.entity.Waybill;
import fxc.service.Bill.WaybillService;

@Controller
public class StoryController {

	
	@Autowired
	private WaybillService waybillService;
	
	@RequestMapping(value = "/story/{page}")
	public String story(@PathVariable("page") String page) {
		return "story/" + page;
	}
	
	@RequestMapping(value = "/story/waybilldetail/{number}")
	public String waybilldetail(@PathVariable("number") String number, Model model ) {
		Waybill waybill=waybillService.getWaybill(number);
		model.addAttribute("waybill", waybill);
		return "story/waybilldetail";
	}
}
