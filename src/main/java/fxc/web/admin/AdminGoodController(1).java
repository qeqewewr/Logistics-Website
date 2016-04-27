package fxc.web.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fxc.entity.Good;
import fxc.service.Good.GoodService;

@Controller
@RequestMapping("/admin")
public class AdminGoodController {

	@Autowired
	private GoodService goodService;

	@RequestMapping(value = "/goodlst", method = RequestMethod.GET)
	public String getAllGood(Model model) {
		List<Good> goods = goodService.getGoods();
		model.addAttribute("lst", goods);
		return "admin/goodlst";
	}

	@RequestMapping(value = "good/add", method = RequestMethod.GET)
	public String addGood() {
		return "admin/addgoods";
	}

	@RequestMapping(value = "addgoods", method = RequestMethod.POST)
	public String addGoodForm(Good good, RedirectAttributes redirectAttributes) {
		goodService.addGood(good);
		redirectAttributes.addFlashAttribute("message", "添加货物成功");
		return "redirect:/admin/goodlst";
	}

	@RequestMapping(value = "good/delete/{id}", method = RequestMethod.GET)
	public String deleteGoods(@PathVariable("id") long id, RedirectAttributes redirectAttributes) {
		goodService.deleteGood(id);
		redirectAttributes.addFlashAttribute("message", "删除货物成功");
		return "redirect:/admin/goodlst";
	}

	@RequestMapping(value = "good/update/{id}", method = RequestMethod.GET)
	public String updateGoods(@PathVariable("id") long id, Model model) {
		Good good = goodService.getGood(id);
		model.addAttribute("good", good);
		return "/admin/editgood";

	}

	@RequestMapping(value = "editgoods", method = RequestMethod.POST)
	public String updateGoodsForm(Good good, RedirectAttributes redirectAttributes) {
		goodService.editGood(good);
		redirectAttributes.addFlashAttribute("message", "修改货物成功");
		return "redirect:/admin/goodlst";
	}

}
