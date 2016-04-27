package fxc.service.Localtion;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import fxc.entity.Location;
import fxc.repository.LocationDAO;

/**
 * 地点管理
 * 
 * @author Lenovo
 * 
 */
@Component
@Transactional
public class LocaltionService {

	public static final String HASH_ALGORITHM = "SHA-1";
	public static final int HASH_INTERATIONS = 1024;
	private static final int SALT_SIZE = 8;

	private static Logger logger = LoggerFactory.getLogger(LocaltionService.class);

	private LocationDAO locationDao;

	/**
	 * 得到所有的地点
	 * 
	 * @return
	 */
	public List<Location> getAllLocation() {
		return (List<Location>) locationDao.findAll();
	}

	/**
	 * 根据id得到地点信息
	 * 
	 * @param id
	 * @return
	 */
	public Location getLocation(long id) {
		return locationDao.findOne(id);
	}

	/**
	 * 根据城市名查找城市
	 * 
	 * @param city
	 * @return
	 */
	public Location getByCity(String city) {
		return locationDao.findByCity(city);
	}

	/**
	 * 编辑地点信息
	 * 
	 * @param local
	 */
	public void editLocation(Location local) {
		locationDao.save(local);
	}

	/**
	 * 根据id删除客户信息
	 * 
	 * @param id
	 */
	public void deleteLocation(long id) {
		locationDao.delete(id);
	}

	/**
	 * 根据local对象删除
	 * 
	 * @param local
	 */
	public void deleteLocation(Location local) {
		locationDao.delete(local);
	}

	/**
	 * 批量删除地点
	 * 
	 * @param local
	 */
	public void deleteLocation(List<Location> local) {
		locationDao.delete(local);
	}

	/**
	 * @param locationDao the locationDao to set
	 */
	@Autowired
	public void setLocationDao(LocationDAO locationDao) {
		this.locationDao = locationDao;
	}

}
