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
import fxc.entity.Goodsprice;
import fxc.entity.Location;
import fxc.service.Good.GoodService;
import fxc.service.Good.GoodspriceService;
import fxc.service.Localtion.LocaltionService;

@Controller
@RequestMapping(value = "/admin")
public class AdminPriceController {

	@Autowired
	private GoodspriceService goodspriceService;

	@Autowired
	private GoodService goodService;

	@Autowired
	private LocaltionService localtionService;

	@RequestMapping(value = "pricelst", method = RequestMethod.GET)
	public String getPriceLst(Model model) {
		List<Goodsprice> goodsprices = goodspriceService.getAllGoodsprice();
		model.addAttribute("lst", goodsprices);
		return "admin/pricelist";
	}

	@RequestMapping(value = "addprice", method = RequestMethod.GET)
	public String addPrice(Model model) {
		List<Good> goodlst = goodService.getGoods();
		model.addAttribute("goodlst", goodlst);
		List<Location> loclst = localtionService.getAllLocation();
		model.addAttribute("loclst", loclst);
		return "admin/addprice";
	}

	@RequestMapping(value = "price/add", method = RequestMethod.POST)
	public String addPricForm(long location, long good, float price, RedirectAttributes redirectAttributes) {
		Goodsprice goodsprice = new Goodsprice();
		goodsprice.setPrice(price);
		Location loc = localtionService.getLocation(location);
		Good go = goodService.getGood(good);
		goodsprice.setWlGood(go);
		goodsprice.setWlLocation(loc);
		goodspriceService.editPrice(goodsprice);
		redirectAttributes.addFlashAttribute("message", "添加价格行情成功");
		return "redirect:/admin/pricelst";
	}

	@RequestMapping(value = "price/delete/{id}", method = RequestMethod.GET)
	public String deleteForm(@PathVariable("id") long id, RedirectAttributes redirectAttributes) {
		goodspriceService.deletePrice(id);
		redirectAttributes.addFlashAttribute("message", "删除价格行情成功");
		return "redirect:/admin/pricelst";
	}

	@RequestMapping(value = "price/update/{id}", method = RequestMethod.GET)
	public String editPrice(@PathVariable("id") long id, Model model) {
		List<Good> goodlst = goodService.getGoods();
		model.addAttribute("goodlst", goodlst);
		List<Location> loclst = localtionService.getAllLocation();
		model.addAttribute("loclst", loclst);

		Goodsprice price = goodspriceService.getGoodspriceById(id);
		model.addAttribute("price", price);
		return "admin/editPrice";
	}

	@RequestMapping(value = "price/edit", method = RequestMethod.POST)
	public String editPriceForm(long id, float price, RedirectAttributes redirectAttributes) {
		Goodsprice tmpprice = goodspriceService.getGoodspriceById(id);
		tmpprice.setPrice(price);
		goodspriceService.editPrice(tmpprice);
		redirectAttributes.addFlashAttribute("message", "修改价格行情成功");
		return "redirect:/admin/pricelst";

	}

}
