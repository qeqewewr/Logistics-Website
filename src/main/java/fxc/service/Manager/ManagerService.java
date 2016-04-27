package fxc.service.Manager;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import fxc.entity.Manager;
import fxc.entity.Contro;
import fxc.entity.User;
import fxc.repository.ManagerDAO;



@Component
@Transactional
public class ManagerService {
	
	private ManagerDAO ManagerDao; 
	
	/**
	 * 按当前用户查找主管实体
	 * 
	 * @param controller
	 * @return
	 */
	public Manager getManagerByUser(User user) {
		return ManagerDao.findByWlUser(user);
	}
	
	

	@Autowired
	public void setManagerDAO(ManagerDAO managerDao) {
		ManagerDao = managerDao;
	}
	
	


}
