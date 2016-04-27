package fxc.service.customer;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import fxc.entity.Customer;
import fxc.entity.Contro;
import fxc.entity.User;
import fxc.entity.Waybill;
import fxc.entity.WlNew;
import fxc.repository.CustomerDAO;

@Component
@Transactional
public class CustomerService {

	private CustomerDAO CustomerDao;

	
	/**
	 * 根据id查找客户
	 * 
	 * @param id
	 * @return
	 */
	public Customer findCustomerByid(long id) {
		return CustomerDao.findByid(id);
	}
	
	/**
	 * 按当前用户查找客户实体
	 * 
	 * @param customer
	 * @return
	 */
	public Customer getCustomerByUser(User user) {
		return CustomerDao.findByWlUser(user);
	}
	
	/**
	 * 按主管查询
	 * 
	 * @param customer
	 * @return
	 */
	public List<Customer> getCustomerByContro(Contro contro) {
		return CustomerDao.findBywlController(contro);
	}
	
	/**
	 * 编辑客户
	 * 
	 * @param customers
	 */
	public void SaveCustomer(Customer customer) {
		CustomerDao.save(customer);
	}

	

	@Autowired
	public void setCustomerDao(CustomerDAO customerDao) {
		CustomerDao = customerDao;
	}
	

}
