package fxc.rest.Vehicle;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import fxc.entity.Owner;
import fxc.entity.Vehicle;
import fxc.service.Vehicle.VehicleService;
import fxc.service.account.AccountService;

@Controller
@RequestMapping(value = "/api/Vehicle")
public class VehicleRestController {

	@Autowired
	private VehicleService vehicleService;
	@Autowired
	private AccountService accountService;

	@RequestMapping(value = "get/{id}", method = RequestMethod.GET)
	@ResponseBody
	public List<String> getVehicleByname(@PathVariable("id") String username) {

		// User user=accountService.findUserByLoginName(username);
		Owner owner = accountService.findOwnerByUsername(username);
		List<Vehicle> vehicles = vehicleService.getVehicles(owner);
		List<String> list = new ArrayList<String>();
		for (Vehicle ve : vehicles) {
			list.add(ve.getNumber());
		}

		return list;

	}

	@RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getDetail(@PathVariable("id") String number) {
		try {
			String decode_number = URLDecoder.decode(number, "utf-8");

			Map<String, Object> maps = new HashMap<String, Object>();
			Vehicle vehicle = vehicleService.getVehicleByNumber(decode_number);
			maps.put("type", vehicle.getType());
			maps.put("volume", vehicle.getVolume());

			return maps;
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping(value = "edit", method = RequestMethod.POST)
	@ResponseBody
	public String edit(String number, float volume) {
		Vehicle vehicle = vehicleService.getVehicleByNumber(number);
		vehicle.setVolume(volume);
		vehicleService.addVehicle(vehicle);
		return "success";
	}

}
