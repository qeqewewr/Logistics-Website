package fxc.service.Contro;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import fxc.entity.Contro;
import fxc.entity.Customer;
import fxc.entity.Manager;
import fxc.entity.User;
import fxc.entity.Waybill;
import fxc.repository.ControllerDAO;



@Component
@Transactional
public class ControService {
	
	private ControllerDAO ControllerDao; 
	
	/**
	 * 按当前用户查找主管实体
	 * 
	 * @param controller
	 * @return
	 */
	public Contro getControllerByUser(User user) {
		return ControllerDao.findByWlUser(user);
	}
	
	/**
	 * 按ID查找主管实体
	 * 
	 * @param controller
	 * @return
	 */
	public Contro getControllerByID(long id) {
		return ControllerDao.findById(id);
	}
	
	/**
	 * 按总经理查询
	 * 
	 * @param manager
	 * @return
	 */
	public List<Contro> getControByManager(Manager manager) {
		return ControllerDao.findBywlManager(manager);
	}
	
	

	@Autowired
	public void setControllerDao(ControllerDAO controllerDao) {
		ControllerDao = controllerDao;
	}
	
	


}
