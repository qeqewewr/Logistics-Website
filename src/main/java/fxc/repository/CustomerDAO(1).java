package fxc.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import fxc.entity.Contro;
import fxc.entity.Customer;
import fxc.entity.User;

/**
 * 
 * 客户管理
 * 
 * @author fxc
 * 
 */
public interface CustomerDAO extends PagingAndSortingRepository<Customer, Long> {

	Customer findByWlUser(User wlUser);
	
	Customer findByid(long id);
	
	/**
	 * 按客户查询查询
	 * 
	 * @param contro
	 * @return
	 */
	List<Customer> findBywlController(Contro contro);
	
	
}
