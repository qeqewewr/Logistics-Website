package fxc.service.Good;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import fxc.entity.Good;
import fxc.repository.GoodDAO;

/**
 * 货物管理
 * 
 * @author Lenovo
 * 
 */
@Component
@Transactional
public class GoodService {

	public static final String HASH_ALGORITHM = "SHA-1";
	public static final int HASH_INTERATIONS = 1024;
	private static final int SALT_SIZE = 8;

	private static Logger logger = LoggerFactory.getLogger(GoodService.class);

	private GoodDAO goodDao;

	/**
	 * 得到所有的货物
	 * 
	 * @return
	 */
	public List<Good> getGoods() {
		return (List<Good>) goodDao.findAll();
	}

	/**
	 * 根据得到货物信息
	 * 
	 * @param id
	 * @return
	 */
	public Good getGood(long id) {
		return goodDao.findOne(id);
	}

	/**
	 * 增加或修改货物信息
	 * 
	 * @param good
	 */
	public void editGood(Good good) {
		goodDao.save(good);
	}

	public void addGood(Good good) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		good.setNumber(dateFormat.format(new Date()));
		goodDao.save(good);
	}

	/**
	 * 删除货物信息
	 * 
	 * @param id
	 */
	public void deleteGood(long id) {
		goodDao.delete(id);
	}

	/**
	 * 根据货物单号删除货物信息
	 * 
	 * @param number
	 */
	public void deleteGood(String number) {

		Good good = goodDao.findByNumber(number);
		goodDao.delete(good);
	}

	@Autowired
	public void setGoodDao(GoodDAO goodDao) {
		this.goodDao = goodDao;
	}

}
