/**
 * 
 */
package fxc.service.account;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import fxc.entity.Administer;
import fxc.repository.AdminDao;

/**
 * @author fxc
 * 
 */

@Component
@Transactional
public class AdminService {

	public static final String HASH_ALGORITHM = "SHA-1";
	public static final int HASH_INTERATIONS = 1024;
	private static final int SALT_SIZE = 8;

	private static Logger logger = LoggerFactory.getLogger(AdminService.class);

	private AdminDao adminDao;

	/**
	 * 查找所有用户
	 * 
	 * @return
	 */
	public List<Administer> getAllAdmins() {
		return (List<Administer>) adminDao.findAll();
	}

	/***
	 * 得到详细信息
	 * 
	 * @param id
	 * @return
	 */
	public Administer getAdmin(long id) {
		return adminDao.findOne(id);
	}

	/**
	 * 根据登陆名得到用户
	 * 
	 * @param username
	 * @return
	 */
	public Administer getAdmin(String username) {
		return adminDao.findByUsername(username);
	}

	/**
	 * 编辑信息
	 * 
	 * @param admin
	 */
	public void editAdmin(Administer admin) {
		adminDao.save(admin);
	}

	/**
	 * 删除管理员
	 * 
	 * @param id
	 */
	public Administer deleteAdmin(Long id) {
		Administer admin = adminDao.findOne(id);
		adminDao.delete(id);
		return admin;
	}

	/**
	 * 根据管理员登陆名得到管理员
	 * 
	 * @param username
	 * @return
	 */
	public Administer findUserByName(String username) {
		return adminDao.findByUsername(username);

	}

	/**
	 * @param adminDao the adminDao to set
	 */
	@Autowired
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

}
