/**
 * 
 */
package fxc.service.Bill;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springside.modules.utils.DateProvider;

import fxc.entity.Contro;
import fxc.entity.Customer;
import fxc.entity.Waybill;
import fxc.repository.WaybillDAO;

/**
 * @author fxc
 * 
 */

@Component
@Transactional
public class WaybillService {

	public static final String HASH_ALGORITHM = "SHA-1";
	public static final int HASH_INTERATIONS = 1024;
	private static final int SALT_SIZE = 8;

	private static Logger logger = LoggerFactory.getLogger(WaybillService.class);

	private WaybillDAO waybillDao;

	private DateProvider dateProvider = DateProvider.DEFAULT;

	/**
	 * 根据id获得订单
	 * 
	 * @param id
	 * @return
	 */
	public Waybill getWaybillByid(long id) {
		return waybillDao.findOne(id);
	}

	/**
	 * 查看所有订单
	 * 
	 * @return
	 */
	public List<Waybill> getAllWaybill() {
		return (List<Waybill>) waybillDao.findAll();
	}

	/**
	 * 按客户查询
	 * 
	 * @param customer
	 * @return
	 */
	public List<Waybill> getWaybillByCst(Customer customer) {
		return waybillDao.findBywlCustomer(customer);
	}

	public List<Waybill> getWaybillByCtr(Contro ctr) {
		List<Waybill> bilst = new ArrayList<Waybill>();
		for (Customer cst : ctr.getWlCustomers()) {
			List<Waybill> tmp = getWaybillByCst(cst);
			bilst.addAll(tmp);
		}
		return bilst;
	}

	/**
	 * 按发件人查询，用于返程车船
	 * 
	 * @param sender
	 * @return
	 */
	public List<Waybill> getWaybillBySender(String sender) {
		return waybillDao.findBySender(sender);
	}

	/**
	 * 按收件人查询
	 * 
	 * @param receiver
	 * @return
	 */
	public List<Waybill> getWaybillByReceiver(String receiver) {
		return waybillDao.findByReceiver(receiver);
	}

	/**
	 * 根据订单号查找订单
	 * 
	 * @param number
	 * @return
	 */
	public Waybill getWaybill(String number) {
		return waybillDao.findByNumber(number);
	}

	/**
	 * 添加订单
	 * 货单编号以0开头加当前日期的组合字段
	 * 
	 * @param waybill
	 */
	public void addWaybill(Waybill waybill) {
		// Timestamp tmp = new Timestamp(dateProvider.getDate().getTime());
		// waybill.setNumber("0" + tmp.toString());

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		waybill.setNumber("0" + dateFormat.format(new Date()));

		waybillDao.save(waybill);
	}

	/**
	 * 修改订单
	 * 
	 * @param waybill
	 */
	public void editWaybill(Waybill waybill) {
		waybillDao.save(waybill);
	}

	/**
	 * 根据id删除托运单
	 * 
	 * @param id
	 */
	public void deleteWaybill(long id) {
		waybillDao.delete(id);
	}

	/**
	 * @param waybillDao the waybillDao to set
	 */
	@Autowired
	public void setWaybillDao(WaybillDAO waybillDao) {
		this.waybillDao = waybillDao;
	}

	public void setDateProvider(DateProvider dateProvider) {
		this.dateProvider = dateProvider;
	}
}
