package fxc.web.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fxc.entity.Location;
import fxc.entity.Owner;
import fxc.entity.Vehicle;
import fxc.service.Localtion.LocaltionService;
import fxc.service.Owner.OwnerService;
import fxc.service.Vehicle.VehicleService;

@Controller
@RequestMapping(value = "/admin")
public class AdminLocationController {

	@Autowired
	private LocaltionService locationService;

	@Autowired
	private VehicleService vehicleService;

	@Autowired
	private OwnerService ownerService;

	@RequestMapping(value = "/localtionlist", method = RequestMethod.GET)
	public String getList(Model model) {
		List<Location> locationList = locationService.getAllLocation();
		model.addAttribute("locations", locationList);
		return "admin/locationlist";
	}

	@RequestMapping(value = "location/add", method = RequestMethod.GET)
	public String getLocationAdd() {
		return "admin/addLocation";
	}

	@RequestMapping(value = "addlocation", method = RequestMethod.POST)
	public String addLocation(Location loction, RedirectAttributes redirectAttributes) {
		locationService.editLocation(loction);
		redirectAttributes.addFlashAttribute("message", "添加地区成功");
		return "redirect:/admin/localtionlist";
	}

	@RequestMapping(value = "location/delete/{id}", method = RequestMethod.GET)
	public String deleteLocation(@PathVariable("id") long id, RedirectAttributes redirectAttributes) {
		locationService.deleteLocation(id);
		redirectAttributes.addFlashAttribute("message", "删除地区成功");
		return "redirect:/admin/localtionlist";
	}

	/*
	 * 运力相关
	 */
	@RequestMapping(value = "/vehlst", method = RequestMethod.GET)
	public String adminList(Model model) {
		List<Vehicle> vehicles = vehicleService.getAll();
		model.addAttribute("vehicles", vehicles);
		return "admin/vehiclelst";
	}

	@RequestMapping(value = "/addvehicles", method = RequestMethod.GET)
	public String addvehicle(Model model) {
		List<Owner> owners = ownerService.getAll();
		model.addAttribute("owners", owners);
		return "admin/addvehicle";
	}

	@RequestMapping(value = "vehicle/add", method = RequestMethod.POST)
	public String addvehicleForm(long owner, Vehicle vehicle, RedirectAttributes redirectAttributes) {
		Owner own = ownerService.getOwner(owner);
		vehicle.setWlOwner(own);
		vehicleService.addVehicle(vehicle);
		redirectAttributes.addFlashAttribute("message", "添加运力成功");
		return "redirect:/admin/vehlst";
	}

	@RequestMapping(value = "vehicle/delete/{id}", method = RequestMethod.GET)
	public String deleteVehicle(@PathVariable("id") long id, RedirectAttributes redirectAttributes) {
		vehicleService.deleteVeicle(id);
		redirectAttributes.addFlashAttribute("message", "删除运力成功");
		return "redirect:/admin/vehlst";
	}

	@RequestMapping(value = "vehicle/update/{id}", method = RequestMethod.GET)
	public String updateVehicle(@PathVariable("id") long id, Model model) {
		Vehicle vehicle = vehicleService.getVehicle(id);
		model.addAttribute("vehicle", vehicle);
		List<Owner> owners = ownerService.getAll();
		model.addAttribute("owners", owners);
		return "admin/editVehicle";
	}

	@RequestMapping(value = "vehicle/update", method = RequestMethod.POST)
	public String updatevehicleForm(long owner, Vehicle vehicle, RedirectAttributes redirectAttributes) {
		Owner own = ownerService.getOwner(owner);
		vehicle.setWlOwner(own);
		vehicleService.addVehicle(vehicle);
		redirectAttributes.addFlashAttribute("message", "更新运力成功");
		return "redirect:/admin/vehlst";
	}

	/**
	 * ajax 校验地区
	 */

	@RequestMapping(value = "checkcity")
	@ResponseBody
	public String checkCity(@RequestParam("city") String city) {
		if (locationService.getByCity(city) == null) {
			return "true";
		} else {
			return "false";
		}
	}

	@RequestMapping(value = "checkvehicle")
	@ResponseBody
	public String checkvehicle(@RequestParam("number") String number) {
		if (vehicleService.getVehicleByNumber(number) == null) {
			return "true";
		} else {
			return "false";
		}
	}

}
