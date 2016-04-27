package fxc.service.Good;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import fxc.entity.Goodsprice;
import fxc.repository.GoodspriceDAO;

/**
 * 
 * @author fxc
 * 
 */
@Component
@Transactional
public class GoodspriceService {

	public static final String HASH_ALGORITHM = "SHA-1";
	public static final int HASH_INTERATIONS = 1024;
	private static final int SALT_SIZE = 8;

	private static Logger logger = LoggerFactory.getLogger(GoodspriceService.class);

	private GoodspriceDAO goodspriceDao;

	/**
	 * 查看所有当地价格
	 * 
	 * @return
	 */
	public List<Goodsprice> getAllGoodsprice() {
		return (List<Goodsprice>) goodspriceDao.findAll();
	}

	/**
	 * 编辑价格信息
	 * 
	 * @param goodsprice
	 */
	public void editPrice(Goodsprice goodsprice) {
		goodspriceDao.save(goodsprice);
	}

	/**
	 * 根据id得到价格信息
	 * 
	 * @param id
	 * @return
	 */
	public Goodsprice getGoodspriceById(long id) {
		return goodspriceDao.findOne(id);
	}

	/**
	 * 根据id删除价格信息
	 * 
	 * @param id
	 */
	public void deletePrice(long id) {
		goodspriceDao.delete(id);
	}

	/**
	 * @param goodspriceDao the goodspriceDao to set
	 */
	@Autowired
	public void setGoodspriceDao(GoodspriceDAO goodspriceDao) {
		this.goodspriceDao = goodspriceDao;
	}

}
