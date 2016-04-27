package fxc.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import fxc.entity.Customer;
import fxc.entity.Vehicle;
import fxc.entity.Waybill;
import fxc.entity.Waybillstatus;

/**
 * 订单状态crud
 * 
 * @author Lenovo
 * 
 */
public interface WaybillstatusDAO extends PagingAndSortingRepository<Waybillstatus, Long> {

	/**
	 * 根据订单查找订单状态
	 * 
	 * @param waybill
	 * @return
	 */

	List<Waybillstatus> findByWlWaybill(Waybill waybill);

	/**
	 * 根据状态查找订单
	 * 
	 * @param status
	 * @return
	 */
	List<Waybillstatus> findByStatus(String status);

	/**
	 * 根据客户查找订单
	 * 
	 * @param customer
	 * @return
	 */
	List<Waybillstatus> findByWlWaybillWlCustomer(Customer customer);

	/**
	 * 根据运力查找订单
	 * 
	 * @param vehicle
	 * @return
	 */
	List<Waybillstatus> findByWlVehicle(Vehicle vehicle);

	/**
	 * 从车主得到车辆进行查找订单
	 * 
	 * @param vehicles
	 * @return
	 */
	List<Waybillstatus> findByWlVehicleIn(List<Vehicle> vehicles);
	
	List<Waybillstatus> findByWlVehicleInAndStatus(List<Vehicle> vehicles,String status);

	/**
	 * 根据客户和状态查看订单
	 * 
	 * @param status
	 * @param customer
	 * @return
	 */
	List<Waybillstatus> findByStatusAndWlWaybillWlCustomer(String status, Customer customer);
}
