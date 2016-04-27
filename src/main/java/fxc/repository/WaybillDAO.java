package fxc.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import fxc.entity.Customer;
import fxc.entity.Good;
import fxc.entity.Waybill;

/**
 * 订单crud
 * 
 * @author Lenovo
 * 
 */
public interface WaybillDAO extends PagingAndSortingRepository<Waybill, Long> {

	/**
	 * 按订单号码查询
	 * 
	 * @param customer
	 * @return
	 */
	Waybill findByNumber(String number);

	/**
	 * 按客户查询查询
	 * 
	 * @param customer
	 * @return
	 */
	List<Waybill> findBywlCustomer(Customer customer);

	/**
	 * 按货物类型查询
	 * 
	 * @param good
	 * @return
	 */
	List<Waybill> findBywlGood(Good good);

	/**
	 * 按发货人查询（用于返程车船）
	 * 
	 * @param sender
	 * @return
	 */
	List<Waybill> findBySender(String sender);

	/**
	 * 按收货人查询
	 * 
	 * @param receiver
	 * @return
	 */
	List<Waybill> findByReceiver(String receiver);
}
