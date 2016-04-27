/**
 * 
 */
package fxc.service.Bill;

import java.sql.Timestamp;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springside.modules.utils.DateProvider;

import fxc.entity.Customer;
import fxc.entity.Vehicle;
import fxc.entity.Waybill;
import fxc.entity.Waybillstatus;
import fxc.repository.WaybillstatusDAO;

/**
 * 
 * 订单状态管理
 * 
 * @author fxc
 * 
 */

@Component
@Transactional
public class WaybillstatusService {

	public static final String HASH_ALGORITHM = "SHA-1";
	public static final int HASH_INTERATIONS = 1024;
	private static final int SALT_SIZE = 8;

	private static Logger logger = LoggerFactory.getLogger(WaybillstatusService.class);

	private WaybillstatusDAO waybillstatusDao;

	private DateProvider dateProvider = DateProvider.DEFAULT;

	/**
	 * 查找所有订单状态
	 * 
	 * @return
	 */
	public List<Waybillstatus> getAllWaybillstatus() {
		return (List<Waybillstatus>) waybillstatusDao.findAll();
	}

	/**
	 * 根据订单查找订单状态
	 * 
	 * @param waybillid
	 * @return
	 */
	public List<Waybillstatus> getWaybillstatusByWaybill(Waybill waybill) {
		return waybillstatusDao.findByWlWaybill(waybill);
	}
	
	/**
	 * 根据车辆查看订单信息
	 * @param owner
	 * @return
	 */
	public List<Waybillstatus> getWaybillstatusByOwner(List<Vehicle> vehicles){
		return waybillstatusDao.findByWlVehicleIn(vehicles);	
	}
	

	/**
	 * 根据订单查找最新订单状态
	 * 
	 * @param waybillid
	 * @return
	 */
	public Waybillstatus getNewestWaybillstatusByWaybill(Waybill waybill) {
		List<Waybillstatus> waybillstatus = waybillstatusDao.findByWlWaybill(waybill);
		return waybillstatus.get(waybillstatus.size() - 1);
	}

	/**
	 * 按客户查看所有订单
	 * 
	 * @param customer
	 * @return
	 */
	public List<Waybillstatus> getWaybillstatusByCustomer(Customer customer) {
		return waybillstatusDao.findByWlWaybillWlCustomer(customer);
	}

	/**
	 * 根据id查看订单详细信息
	 * 
	 * @param id
	 * @return
	 */
	public Waybillstatus getWaybillstatus(int id) {
		return waybillstatusDao.findOne((long) id);
	}

	/**
	 * 编辑订单信息
	 * 
	 * @param waybillstatus
	 */
	public void addWaybillstatus(Waybillstatus waybillstatus) {
		waybillstatus.setTime(new Timestamp(dateProvider.getDate().getTime()));
		waybillstatusDao.save(waybillstatus);
	}
	


	/**
	 * @param waybillstatusDao the waybillstatusDao to set
	 */
	@Autowired
	public void setwaybillstatusDao(WaybillstatusDAO waybillstatusDao) {
		this.waybillstatusDao = waybillstatusDao;
	}

	public void setDateProvider(DateProvider dateProvider) {
		this.dateProvider = dateProvider;
	}
}
