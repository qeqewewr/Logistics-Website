package fxc.web.waybil;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fxc.entity.Contro;
import fxc.entity.Customer;
import fxc.entity.Good;
import fxc.entity.Goodsprice;
import fxc.entity.Location;
import fxc.entity.User;
import fxc.entity.Vehicle;
import fxc.entity.Waybill;
import fxc.entity.Waybillstatus;
import fxc.service.Bill.WaybillService;
import fxc.service.Bill.WaybillstatusService;
import fxc.service.Good.GoodService;
import fxc.service.Localtion.LocaltionService;
import fxc.service.Vehicle.VehicleService;
import fxc.service.account.AccountService;
import fxc.service.account.ShiroDbRealm.ShiroUser;
import fxc.service.customer.CustomerService;

/**
 * 订单的Controller.
 * 
 * @author calvin
 * 
 *         changed by xy
 */
@Controller
@SessionAttributes("waybill")
public class WaybillController {

	@Autowired
	private WaybillService waybillService;

	@Autowired
	private WaybillstatusService waybillstatusService;

	@Autowired
	private AccountService accountService;

	@Autowired
	private CustomerService customerService;

	@Autowired
	private GoodService goodService;

	@Autowired
	private VehicleService vehicleService;

	@Autowired
	private LocaltionService locationService;

	/**
	 * 用户订单查询
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "story/waybill", method = RequestMethod.GET)
	public String list(Model model) {
		ShiroUser shirouser = (ShiroUser) SecurityUtils.getSubject().getPrincipal();
		User user = accountService.findUserByLoginName(shirouser.loginName);
		Customer customer = customerService.getCustomerByUser(user);
		List<Waybill> waybills = waybillService.getWaybillByCst(customer);
		model.addAttribute("waybills", waybills);

		return "waybill/waybillList";
	}

	@RequestMapping(value = "frontpage/waybilst", method = RequestMethod.GET)
	public String getWaybilstByCtr(Model model) {
		ShiroUser shirouser = (ShiroUser) SecurityUtils.getSubject().getPrincipal();
		User user = accountService.findUserByLoginName(shirouser.loginName);
		Contro ctr = accountService.findControByUserid(user.getId());
		List<Waybill> waybills = waybillService.getWaybillByCtr(ctr);
		model.addAttribute("waybills", waybills);

		return "waybill/waybillList";
	}

	@RequestMapping(value = "frontpage/waybill/add", method = RequestMethod.GET)
	public String addWaybill(Model model) {
		ShiroUser shirouser = (ShiroUser) SecurityUtils.getSubject().getPrincipal();
		User user = accountService.findUserByLoginName(shirouser.loginName);
		Contro ctr = accountService.findControByUserid(user.getId());
		System.out.println(ctr.getWlCustomers().size() + "-------" + ctr.getWlOwners().size());
		model.addAttribute("customers", ctr.getWlCustomers());
		List<Good> goodlst = goodService.getGoods();
		model.addAttribute("goods", goodlst);
		return "waybill/addwaybill";
	}

	@RequestMapping(value = "frontpage/waybill/addbycust", method = RequestMethod.GET)
	public String addWaybillBycust(Model model) {
		ShiroUser shirouser = (ShiroUser) SecurityUtils.getSubject().getPrincipal();
		User user = accountService.findUserByLoginName(shirouser.loginName);
		// Contro ctr = accountService.findControByUserid(user.getId());
		// System.out.println(ctr.getWlCustomers().size() + "-------" + ctr.getWlOwners().size());
		// model.addAttribute("customers", ctr.getWlCustomers());

		Customer customer = customerService.getCustomerByUser(user);
		model.addAttribute("cst", customer);

		List<Good> goodlst = goodService.getGoods();
		model.addAttribute("goods", goodlst);
		return "waybill/addwaybill";
	}

	@RequestMapping(value = "frontpage/addwaybill", method = RequestMethod.POST)
	public String addWaybillForm(@RequestParam(value = "customer") long customer,
			@RequestParam(value = "good") long good, @RequestParam(value = "sendtime1") String sendtime, String sender,
			String senderphone, String sendaddress, String receiver, String receiverphone, String receiveaddress,
			String storemode, float price, String transportmode, String remark, RedirectAttributes redirectAttributes) {
		Good objGood = goodService.getGood(good);
		Customer cst = accountService.getCustomer(customer);
		Waybill waybill = new Waybill();
		waybill.setWlGood(objGood);
		waybill.setWlCustomer(cst);
		waybill.setWeight(objGood.getWeight());
		waybill.setVolume(objGood.getVolume());
		// waybill.setStatus("1");
		waybill.setSender(sender);
		waybill.setSendaddress(sendaddress);
		waybill.setSenderphone(senderphone);
		waybill.setReceiveaddress(receiveaddress);
		waybill.setReceiver(receiver);
		waybill.setReceiverphone(receiverphone);
		waybill.setStoremode(storemode);
		waybill.setPrice(price);
		waybill.setRemark(remark);

		waybill.setSendtime(java.sql.Date.valueOf(sendtime));

		waybill.setPayment(transportmode);
		Subject currentUser = SecurityUtils.getSubject();

		if (currentUser.hasRole("controller")) {
			waybill.setStatus("2");
		} else if (currentUser.hasRole("customer")) {
			waybill.setStatus("2");
		}

		waybillService.addWaybill(waybill);
		redirectAttributes.addFlashAttribute("message", "下单成功");
		
		if (currentUser.hasRole("controller")) {
			return "redirect:/frontpage/waybilst";
		} else {
			return "redirect:/story/waybill";
		}
		
	}

	@RequestMapping(value = "frontpage/waybilldetail/{id}", method = RequestMethod.GET)
	public String getWaybillDetail(@PathVariable("id") long id, Model model) {
		Waybill waybill = waybillService.getWaybillByid(id);
		model.addAttribute("waybill", waybill);
		return "waybill/waybilldetailList";
	}

	@RequestMapping(value = "frontpage/waybill/abolish/{id}", method = RequestMethod.GET)
	public String abolishWaybill(@PathVariable("id") long id, RedirectAttributes redirectAttributes) {
		Waybill waybill = waybillService.getWaybillByid(id);
		waybill.setStatus("0");
		waybillService.editWaybill(waybill);
		redirectAttributes.addFlashAttribute("message", "废单完成");
		return "redirect:/frontpage/waybilst";
	}
	
	@RequestMapping(value = "frontpage/waybill/delete/{id}", method = RequestMethod.GET)
	public String deleteWaybill(@PathVariable("id") long id, RedirectAttributes redirectAttributes) {
		
		
		waybillService.deleteWaybill(id);
		redirectAttributes.addFlashAttribute("message", "删除成功");
		return "redirect:/frontpage/waybilst";
	}

	@RequestMapping(value = "/frontpage/waybill/update/{id}", method = RequestMethod.GET)
	public String updateWaybill(@PathVariable("id") long id, Model model) {
		Waybill waybill = waybillService.getWaybillByid(id);
		model.addAttribute("waybill", waybill);
		return "waybill/editwaybill";
	}

	@RequestMapping(value = "/frontpage/waybill/updateform", method = RequestMethod.POST)
	public String updateWaybillForm(long id, String sendtime1, float price, String status,
			RedirectAttributes redirectAttributes) {
		Waybill waybill = waybillService.getWaybillByid(id);
		if (!sendtime1.isEmpty()) {
			waybill.setSendtime(java.sql.Date.valueOf(sendtime1));
		}
		waybill.setPrice(price);
		waybill.setStatus(status);
		waybillService.editWaybill(waybill);
		redirectAttributes.addAttribute("message", "修改完成");
		return "redirect:/frontpage/waybilst";
	}

	@RequestMapping(value = "frontpage/waybill/through/{id}", method = RequestMethod.GET)
	public String through(@PathVariable("id") long id, RedirectAttributes redirectAttributes) {
		Waybill waybill = waybillService.getWaybillByid(id);
		waybill.setStatus("1");
		waybillService.editWaybill(waybill);
		redirectAttributes.addFlashAttribute("message", "通过审核");
		return "redirect:/frontpage/waybilst";
	}

	@RequestMapping(value = "frontpage/waybillstatus/set/{id}", method = RequestMethod.GET)
	public String getWaybillStatusView(@PathVariable("id") long id, Model model) {
		ShiroUser shirouser = (ShiroUser) SecurityUtils.getSubject().getPrincipal();
		User user = accountService.findUserByLoginName(shirouser.loginName);
		Contro ctr = accountService.findControByUserid(user.getId());
		List<Vehicle> vehicles = vehicleService.getVehiclesByContro(ctr);
		model.addAttribute("vehicles", vehicles);
		List<Location> location = locationService.getAllLocation();
		model.addAttribute("locations", location);
		Waybill waybill = waybillService.getWaybillByid(id);
		model.addAttribute("waybill", waybill);

		return "waybill/setwaybillstatus";
	}
	
	@RequestMapping(value = "frontpage/waybillstatus/set1/{id}", method = RequestMethod.GET)
	public String getWaybillStatusView1(@PathVariable("id") long id, Model model) {
		ShiroUser shirouser = (ShiroUser) SecurityUtils.getSubject().getPrincipal();
		User user = accountService.findUserByLoginName(shirouser.loginName);
		Contro ctr = accountService.findControByUserid(user.getId());
		
		List<Location> location = locationService.getAllLocation();
		model.addAttribute("locations", location);
		Waybill waybill = waybillService.getWaybillByid(id);
		model.addAttribute("waybill", waybill);
		
		Vehicle vehicle=waybill.getWlWaybillstatuses().get(0).getWlVehicle();
		model.addAttribute("vehicle", vehicle);

		return "waybill/setwaybillstatus1";
	}

	@RequestMapping(value = "frontpage/waybillstatus/setform", method = RequestMethod.POST)
	public String setStatus(long waybillid, long location, long veh, String status,
			RedirectAttributes redirectAttributes) {
		Waybill waybill = waybillService.getWaybillByid(waybillid);
		Location loc = locationService.getLocation(location);
		Vehicle vehi = vehicleService.getVehicle(veh);
		Waybillstatus waybillstatus = new Waybillstatus();
		waybillstatus.setWlLocation(loc);
		waybillstatus.setWlVehicle(vehi);
		waybillstatus.setWlWaybill(waybill);
		waybillstatus.setStatus(status);
		waybillstatusService.addWaybillstatus(waybillstatus);
		redirectAttributes.addFlashAttribute("message", "状态改变完成");
		return "redirect:/frontpage/waybilst";
	}
	
	@RequestMapping(value = "frontpage/waybillstatus/setform1", method = RequestMethod.POST)
	public String setStatus1(long waybillid, long location, long vehicle, String status,
			RedirectAttributes redirectAttributes) {
		Waybill waybill = waybillService.getWaybillByid(waybillid);
		Location loc = locationService.getLocation(location);
		Vehicle vehi = vehicleService.getVehicle(vehicle);
		Waybillstatus waybillstatus = new Waybillstatus();
		waybillstatus.setWlLocation(loc);
		waybillstatus.setWlVehicle(vehi);
		waybillstatus.setWlWaybill(waybill);
		waybillstatus.setStatus(status);
		waybillstatusService.addWaybillstatus(waybillstatus);
		redirectAttributes.addFlashAttribute("message", "状态改变完成");
		return "redirect:/frontpage/waybilst";
	}
	

	@RequestMapping(value = "frontpage/waybill/finish/{id}", method = RequestMethod.GET)
	public String finishWaybill(@PathVariable("id") long id, RedirectAttributes redirectAttributes) {

		Waybill waybill = waybillService.getWaybillByid(id);
		Waybillstatus waybillStatus;
		if (waybill.getWlWaybillstatuses().size() != 0) {
			
			waybillStatus = waybill.getWlWaybillstatuses().get(waybill.getWlWaybillstatuses().size()-1);
			Waybillstatus way2 = new Waybillstatus();
			way2.setStatus("配送完成");
			way2.setWlLocation(waybillStatus.getWlLocation());
			way2.setWlVehicle(waybillStatus.getWlVehicle());
			way2.setWlWaybill(waybillStatus.getWlWaybill());
			waybillstatusService.addWaybillstatus(way2);
			Date retime = way2.getTime();
			waybill.setReceivetime(retime);
			waybillService.editWaybill(waybill);
		}

		redirectAttributes.addFlashAttribute("message", "完成配送");
		return "redirect:/frontpage/waybilst";
	}

	/*
	 * ajax
	 */

	@RequestMapping(value = "frontpage/waybill/jsongood/{id}")
	@ResponseBody
	public List<Map<String,Object>> getgood(@PathVariable("id") long id) {
		Good tmp = goodService.getGood(id);//根据货物id 得到货物

	List<Map<String,Object>> lst_Map=new ArrayList<Map<String, Object>>();//新间一个map链表
	
	
	
	
		
		//out.setWlGoodsprices(tmp.getWlGoodsprices());
		List<Goodsprice> goodsprice=tmp.getWlGoodsprices();//根据货物信息得到各地的货物价格
		
	
		
		for(Goodsprice tt:goodsprice){
			Map<String,Object> map=new HashMap<String, Object>();
			
			map.put("price", tt.getPrice());
			map.put("location", tt.getWlLocation().getCity());
			map.put("distance", tt.getWlLocation().getDistance());
			map.put("weight",tmp.getWeight() );
			map.put("volume", tmp.getVolume());
			map.put("source", tmp.getSource());
			map.put("number", tmp.getNumber());
			map.put("type", tmp.getType());
			lst_Map.add(map);
	
		}//完成货物价格信息链表到map的转换，生成JSON串
		
		System.out.println(lst_Map.size());

		return lst_Map;

	}

}