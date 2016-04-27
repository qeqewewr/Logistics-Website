package fxc.service.Vehicle;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import fxc.entity.Contro;
import fxc.entity.Owner;
import fxc.entity.Vehicle;
import fxc.repository.VehicleDAO;

/**
 * 运力管理服务
 * 
 * @author Lenovo
 * 
 */
@Component
@Transactional
public class VehicleService {

	public static final String HASH_ALGORITHM = "SHA-1";
	public static final int HASH_INTERATIONS = 1024;
	private static final int SALT_SIZE = 8;

	private static Logger logger = LoggerFactory.getLogger(VehicleService.class);

	private VehicleDAO vehicleDao;

	/**
	 * 根据类型查找所有运力
	 * 
	 * @param i
	 *            i=0 车运
	 *            i=1 船运
	 * @return
	 */
	public List<Vehicle> getVehicles(int i) {
		String vehicle_type = new String();
		if (i == 0) {
			vehicle_type = "Wagon";
			// return vehiclceDao.findByType(vehicle_type);
		} else if (i == 1) {
			vehicle_type = "boat";
		}
		return vehicleDao.findByType(vehicle_type);
	}

	public List<Vehicle> getVehiclesByContro(Contro ctr) {
		return vehicleDao.findBywlOwner_wlController(ctr);

	}

	/**
	 * 得到所有的运力
	 * 
	 * @return
	 */
	public List<Vehicle> getAll() {
		return (List<Vehicle>) vehicleDao.findAll();
	}

	/**
	 * 根据车主个人查找运力
	 * 
	 * @param owner 车主
	 * @return
	 */
	public List<Vehicle> getVehicles(Owner owner) {
		return vehicleDao.findByWlOwner(owner);
	}

	/**
	 * 根据车主个人与运力类型查找运力
	 * 
	 * @param i 车船代码
	 *            i=0 车运
	 *            i=1 船运
	 * @param owner 车主
	 * @return
	 */
	public List<Vehicle> getVehicles(int i, Owner owner) {
		String vehicle_type = new String();
		if (i == 0) {
			vehicle_type = "Wagon";
		} else if (i == 1) {
			vehicle_type = "boat";
		}
		return vehicleDao.findByTypeAndWlOwner(vehicle_type, owner);
	}

	/**
	 * 根据id查看车辆信息
	 * 
	 * @param id
	 * @return
	 */
	public Vehicle getVehicle(long id) {
		return vehicleDao.findOne(id);
	}

	/**
	 * 根据车牌号查找车辆
	 * 
	 * @param number
	 * @return
	 */
	public Vehicle getVehicleByNumber(String number) {
		return vehicleDao.findByNumber(number);
	}

	/**
	 * 增加或修改运力基本信息
	 * 
	 * @param vehicle
	 */
	public void addVehicle(Vehicle vehicle) {
		vehicleDao.save(vehicle);
	}

	/**
	 * 删除车辆信息
	 * 
	 * @param id
	 */
	public void deleteVeicle(long id) {
		vehicleDao.delete(id);
	}

	/**
	 * 批量删除
	 * 
	 * @param veicles
	 */
	public void deleteVeicle_lst(List<Vehicle> veicles) {
		vehicleDao.delete(veicles);
	}

	@Autowired
	public void setVehicleDao(VehicleDAO vehicleDao) {
		this.vehicleDao = vehicleDao;
	}

}
