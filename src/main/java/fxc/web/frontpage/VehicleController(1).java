package fxc.web.frontpage;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fxc.entity.Contro;
import fxc.entity.Owner;
import fxc.entity.User;
import fxc.entity.Vehicle;
import fxc.service.Owner.OwnerService;
import fxc.service.Vehicle.VehicleService;
import fxc.service.account.AccountService;
import fxc.service.account.ShiroDbRealm.ShiroUser;

@Controller
@SessionAttributes("vehicle")
@RequestMapping(value = "/story/vehicle")

public class VehicleController {
	@Autowired
	private VehicleService vehicleService;
	
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private OwnerService ownerService;
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list(Model model) {
		ShiroUser shirouser = (ShiroUser)SecurityUtils.getSubject().getPrincipal();
		User user = accountService.findUserByLoginName(shirouser.loginName);
		Owner owner = ownerService.getOwnerByUser(user);
		List <Vehicle> vehicles = vehicleService.getVehicles(owner);
		model.addAttribute("vehicles", vehicles);
		return "vehicle/vehicleList";
	}
	
	
	
	@RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
	public String deleteNews(@PathVariable("id") int id, RedirectAttributes redirectAttributes) {
		vehicleService.deleteVeicle(id);
		redirectAttributes.addFlashAttribute("message", "删除运力成功");
		return "redirect:/story/vehicle/list";
	}
	
	@RequestMapping(value = "update/{id}", method = RequestMethod.GET)
	public String updateVehicle(@PathVariable("id") long id, Model model) {
		Vehicle vehicle = vehicleService.getVehicle(id);
		ShiroUser shirouser = (ShiroUser)SecurityUtils.getSubject().getPrincipal();
		User user = accountService.findUserByLoginName(shirouser.loginName);
		Owner owner = ownerService.getOwnerByUser(user);
		model.addAttribute("owner",owner);
		model.addAttribute("vehicle", vehicle);
		return "vehicle/editVehicle";
	}

	@RequestMapping(value = "updatevehicle", method = RequestMethod.POST)
	public String updatevehicleForm(long ownerID, Vehicle vehicle, RedirectAttributes redirectAttributes) {
		Owner owner = ownerService.getOwner(ownerID);
		vehicle.setWlOwner(owner);
		vehicleService.addVehicle(vehicle);
		redirectAttributes.addFlashAttribute("message", "更新运力成功");
		return "redirect:/story/vehicle/list";
	}
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String addVehicle(Model model) {
		ShiroUser shirouser = (ShiroUser)SecurityUtils.getSubject().getPrincipal();
		User user = accountService.findUserByLoginName(shirouser.loginName);
		Owner owner = ownerService.getOwnerByUser(user);
		model.addAttribute("owner",owner);
		return "vehicle/addVehicle";
	}
	
	@RequestMapping(value = "addvehicle", method = RequestMethod.POST)
	public String addVehicleForm(long ownerID, String number, String type , float volume, RedirectAttributes redirectAttributes) {
		Owner owner = ownerService.getOwner(ownerID);
		Vehicle vehicle = new Vehicle();
		
		vehicle.setNumber(number);
		vehicle.setType(type);
		vehicle.setVolume(volume);
		vehicle.setWlOwner(owner);
		
		vehicleService.addVehicle(vehicle);
		
		redirectAttributes.addFlashAttribute("message", "添加运力成功");
		return "redirect:/story/vehicle/list";
	}
	
	
	

	 
	
}	
