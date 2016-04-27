package fxc.service.Owner;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import fxc.entity.Owner;
import fxc.entity.User;
import fxc.repository.OwnerDAO;
import fxc.service.Vehicle.VehicleService;

@Component
@Transactional
public class OwnerService {

	public static final String HASH_ALGORITHM = "SHA-1";
	public static final int HASH_INTERATIONS = 1024;
	private static final int SALT_SIZE = 8;

	private static Logger logger = LoggerFactory.getLogger(VehicleService.class);

	private OwnerDAO OwnerDao;

	public List<Owner> getAll() {
		return (List<Owner>) OwnerDao.findAll();
	}

	/**
	 * 根据id查找车主
	 * 
	 * @param id
	 * @return
	 */
	public Owner getOwner(long id) {
		return OwnerDao.findOne(id);
	}

	/**
	 * 按当前用户查找车主实体
	 * 
	 * @param owner
	 * @return
	 */
	public Owner getOwnerByUser(User user) {
		return OwnerDao.findByWlUser(user);
	}

	@Autowired
	public void setOwnerDao(OwnerDAO ownerDao) {
		OwnerDao = ownerDao;
	}
}
