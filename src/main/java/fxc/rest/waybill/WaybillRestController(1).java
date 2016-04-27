package fxc.rest.waybill;

import java.util.ArrayList;
import java.util.Collections;
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
import fxc.entity.Waybill;
import fxc.entity.Waybillstatus;
import fxc.service.Bill.WaybillService;
import fxc.service.Bill.WaybillstatusService;
import fxc.service.Vehicle.VehicleService;
import fxc.service.account.AccountService;

@Controller
@RequestMapping(value="/api/waybill")
public class WaybillRestController {
	
	@Autowired
	private WaybillService waybillService;
	
	@Autowired 
	private WaybillstatusService waybillstatusService;
	
	@Autowired
	private VehicleService vehicleService;
	
	@Autowired
	private AccountService accountService;

	@RequestMapping(value="getList/{id}",method=RequestMethod.GET)
	@ResponseBody
	public List<Map<String,Object>> getListByUsername(@PathVariable("id") String username){
		Owner owner=accountService.findOwnerByUsername(username);
		List<Vehicle> vehicles=vehicleService.getVehicles(owner);
		
		List<Waybillstatus> waybills=waybillstatusService.getWaybillstatusByOwner(vehicles);
		List<Waybill> waybill=new ArrayList<Waybill>();
		List<Map<String,Object>> resList=new ArrayList<Map<String,Object>>();
		for(Waybillstatus waybillstatus:waybills){
			if(waybill.contains(waybillstatus.getWlWaybill())){}
			else
			{waybill.add(waybillstatus.getWlWaybill());}
		}
		for(Waybill tmp:waybill){
			List<Waybillstatus> tmp_waystatus=tmp.getWlWaybillstatuses();
		Map<String,Object> maps=new HashMap<String, Object>();
		maps.put("status",tmp_waystatus.get(tmp_waystatus.size()-1).getStatus());
		maps.put("number", tmp_waystatus.get(tmp_waystatus.size()-1).getWlVehicle().getNumber());
		maps.put("send_add", tmp_waystatus.get(tmp_waystatus.size()-1).getWlWaybill().getSendaddress());
		maps.put("receive_add", tmp_waystatus.get(tmp_waystatus.size()-1).getWlWaybill().getReceiveaddress());
		resList.add(maps);
		}
		Collections.reverse(resList);
		return resList;
	}
	

}
