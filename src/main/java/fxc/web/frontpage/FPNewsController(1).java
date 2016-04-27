package fxc.web.frontpage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import fxc.entity.Waybill;
import fxc.entity.WlNew;
import fxc.service.Config.NewsService;


@Controller
@SessionAttributes("news")

public class FPNewsController {
	@Autowired
	private NewsService newsService;
	
	@RequestMapping(value = "/frontpage/index", method = RequestMethod.GET)
	public String getNews(Model model) {
		List<WlNew> wlNews = newsService.findAll();
		WlNew[] FPNews = new WlNew[3];
		for(int i=0;i<3;i++)
		{
			FPNews[i] = wlNews.get(i); 
		}
		model.addAttribute("news", FPNews);
		return "frontpage/index";
	}
	
	@RequestMapping(value = "/frontpage1/news", method = RequestMethod.GET)
	public String list(Model model) {
		List <WlNew> news = newsService.findAll();
		model.addAttribute("news", news);
		return "config/news";		
	}
	
	@RequestMapping(value = "/config/newscontent/{number}")
	public String Newscontent(@PathVariable("number") int number, Model model ) {
		WlNew news = newsService.findNewsByid(number); 
		model.addAttribute("news", news);
		return "config/newscontent";
	}
	

	 
	
}	
