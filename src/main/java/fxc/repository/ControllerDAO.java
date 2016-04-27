package fxc.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import fxc.entity.Contro;
import fxc.entity.Customer;
import fxc.entity.Manager;
import fxc.entity.User;

/**
 * 主管管理DAO
 * 
 * @author fxc
 * 
 */
public interface ControllerDAO extends PagingAndSortingRepository<Contro, Long> {

	Contro findByWlUser(User wlUser);


	/**
	 * 按ID查询
	 * 
	 * @param contro
	 * @return
	 */
	Contro findById(long id);
	
	/**
	 * 按所属经理查询
	 * 
	 * @param contro
	 * @return
	 */
	List <Contro> findBywlManager(Manager manager);
}
