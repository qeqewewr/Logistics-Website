package fxc.web.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fxc.entity.WlNew;
import fxc.service.Config.NewsService;

@Controller
@RequestMapping(value = "/admin/news")
public class NewsController {

	@Autowired
	private NewsService newsService;

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String getNewsList(Model model) {
		List<WlNew> wlNewList = newsService.findAll();
		model.addAttribute("lst", wlNewList);
		return "config/newsList";
	}

	@RequestMapping(value = "update/{id}", method = RequestMethod.GET)
	public String updateNews(@PathVariable("id") long id, Model model) {
		WlNew wlNews = newsService.findNewsByid(id);
		model.addAttribute("news", wlNews);
		return "config/newsForm";
	}

	@RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
	public String deleteNews(@PathVariable("id") long id, RedirectAttributes redirectAttributes) {
		newsService.deleteNews(id);
		redirectAttributes.addFlashAttribute("message", "删除新闻成功");
		return "redirect:/admin/news/list";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String updateNewsForm(@RequestParam(value = "editorValue") String editorValue, long id,
			RedirectAttributes redirectAttributes) {
		WlNew news = newsService.findNewsByid(id);
		news.setContent(editorValue);

		newsService.editNews(news);
		redirectAttributes.addAttribute("message", "编辑新闻成功");
		return "redirect:/admin/news/list";
	}

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String addNews() {
		return "config/addNews";
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String addNewsForm(@RequestParam(value = "editorValue") String editorValue, WlNew wlnews,
			RedirectAttributes redirectAttributes) {
		wlnews.setContent(editorValue);
		newsService.editNews(wlnews);
		redirectAttributes.addAttribute("message", "添加新闻成功");
		return "redirect:/admin/news/list";
	}

}
