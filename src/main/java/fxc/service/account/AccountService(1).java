package fxc.service.account;

import java.sql.Timestamp;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springside.modules.security.utils.Digests;
import org.springside.modules.utils.DateProvider;
import org.springside.modules.utils.Encodes;

import fxc.entity.Contro;
import fxc.entity.Customer;
import fxc.entity.Manager;
import fxc.entity.Owner;
import fxc.entity.User;
import fxc.repository.ControllerDAO;
import fxc.repository.CustomerDAO;
import fxc.repository.ManagerDAO;
import fxc.repository.OwnerDAO;
import fxc.repository.UserDao;
import fxc.service.ServiceException;
import fxc.service.account.ShiroDbRealm.ShiroUser;

/**
 * 用户管理类.
 * 
 * @author calvin
 * 
 *         changed by fxc
 */
// Spring Service Bean的标识.
@Component
@Transactional
public class AccountService {

	public static final String HASH_ALGORITHM = "SHA-1";
	public static final int HASH_INTERATIONS = 1024;
	private static final int SALT_SIZE = 8;

	private static Logger logger = LoggerFactory.getLogger(AccountService.class);

	private UserDao userDao;
	private ManagerDAO managerDAO;
	private ControllerDAO controllerDAO;
	private CustomerDAO customerDAO;
	private OwnerDAO ownerDAO;

	private DateProvider dateProvider = DateProvider.DEFAULT;

	/**
	 * 返回user表中的所有用户
	 * 
	 * @return
	 */
	public List<User> getAllUser() {
		return (List<User>) userDao.findAll();
	}

	/**
	 * 根据用户主键id查找user
	 * 
	 * @param id
	 * @return
	 */
	public User getUser(Long id) {
		return userDao.findOne(id);
	}

	/**
	 * 根据登陆用户名查找用户
	 * 
	 * @param loginName
	 * @return
	 */
	public User findUserByLoginName(String loginName) {
		return userDao.findByLoginName(loginName);
	}

	/**
	 * 用户注册
	 * 
	 * @param user
	 */
	public void registerUser(User user) {
		if (StringUtils.isNotBlank(user.getPlainPassword())) {
			entryptPassword(user);
		}
		user.setRegisterDate(new Timestamp(dateProvider.getDate().getTime()));

		userDao.save(user);
	}

	/**
	 * 查找所有经理
	 * 
	 * @return
	 */
	public List<Manager> findAllManager() {
		return (List<Manager>) managerDAO.findAll();
	}

	/**
	 * 根据总经理id查找总经理
	 * 
	 * @param id
	 * @return
	 */
	public Manager getManager(Long id) {
		return managerDAO.findOne(id);
	}

	/**
	 * 根据用户id查找经理
	 * 
	 * @param userid
	 * @return
	 */
	public Manager findManagerByUser(long userid) {
		User user = userDao.findOne(userid);
		return managerDAO.findByWlUser(user);
	}

	/**
	 * 添加经理
	 * 
	 * @param manager
	 */
	public void addManager(Manager manager) {
		User user = manager.getWlUser();
		if (StringUtils.isNotBlank(user.getPlainPassword())) {
			entryptPassword(user);
		}
		user.setRegisterDate(new Timestamp(dateProvider.getDate().getTime()));
		manager.setWlUser(user);
		manager.setNumber(Long.toString(dateProvider.getDate().getTime()));
		managerDAO.save(manager);
	}

	/**
	 * 更新总经理信息
	 * 
	 * @param manager
	 */
	public void updateManager(Manager manager) {
		User user = manager.getWlUser();
		if (StringUtils.isNotBlank(user.getPlainPassword())) {
			entryptPassword(user);
		}
		manager.setWlUser(user);
		userDao.save(user);
		managerDAO.save(manager);
	}

	/**
	 * 删除总经理
	 * 
	 * @param id
	 */
	public void deleteManager(long id) {
		managerDAO.delete(id);
	}

	/**
	 * 查找所有主管
	 * 
	 * @return
	 */
	public List<Contro> findAllController() {
		return (List<Contro>) controllerDAO.findAll();
	}

	/**
	 * 查找主管
	 * 
	 * 
	 */
	public Contro getController(Long id) {
		return controllerDAO.findOne(id);
	}

	/**
	 * 根据用户id查找主管
	 * 
	 * @param userid
	 * @return
	 */
	public Contro findControByUserid(long userid) {
		User user = userDao.findOne(userid);
		return controllerDAO.findByWlUser(user);
	}

	/**
	 * 添加主管
	 * 
	 * 自动生成number
	 * 
	 * @param controller
	 */
	public void addController(Contro controller) {
		User user = controller.getWlUser();
		if (StringUtils.isNotBlank(user.getPlainPassword())) {
			entryptPassword(user);
		}
		user.setRegisterDate(new Timestamp(dateProvider.getDate().getTime()));
		controller.setNumber(Long.toString(dateProvider.getDate().getTime()));
		controller.setWlUser(user);
		controllerDAO.save(controller);
	}

	/**
	 * 更新主管信息
	 * 
	 * @param controller
	 */
	public void updateController(Contro controller) {
		User user = controller.getWlUser();
		if (StringUtils.isNotBlank(user.getPlainPassword())) {
			entryptPassword(user);
		}
		controller.setWlUser(user);
		controllerDAO.save(controller);
	}

	/**
	 * 删除主管
	 * 
	 * @param l
	 */
	public void deleteController(long l) {
		controllerDAO.delete(l);
	}

	/**
	 * 根据id得到车主
	 * 
	 * @param id
	 * @return
	 */
	public Owner getOwner(Long id) {
		return ownerDAO.findOne(id);
	}
	
	/**
	 * 根据用户登录名查找车主
	 * @param username
	 * @return
	 */
	public Owner findOwnerByUsername(String username){
		User user=userDao.findByLoginName(username);
		return ownerDAO.findByWlUser(user);
	}

	/**
	 * 根据用户id查找车主
	 * 
	 * @param userid
	 * @return
	 */
	public Owner findOwnerByUser(long userid) {
		User user = userDao.findOne(userid);
		return ownerDAO.findByWlUser(user);
	}

	/**
	 * 添加车主
	 * 
	 * @param owner
	 */
	public void addOwner(Owner owner) {
		User user = owner.getWlUser();
		if (StringUtils.isNotBlank(user.getPlainPassword())) {
			entryptPassword(user);
		}
		user.setRegisterDate(new Timestamp(dateProvider.getDate().getTime()));
		owner.setWlUser(user);
		owner.setNumber(Long.toString(dateProvider.getDate().getTime()));
		ownerDAO.save(owner);
	}

	/**
	 * 更新车主
	 * 
	 * @param owner
	 */
	public void updateOwner(Owner owner) {
		User user = owner.getWlUser();
		if (StringUtils.isNotBlank(user.getPlainPassword())) {
			entryptPassword(user);
		}
		owner.setWlUser(user);
		ownerDAO.save(owner);
	}

	/**
	 * 删除车主
	 * 
	 * @param l
	 */
	public void deleteOwner(long l) {
		ownerDAO.delete(l);
	}

	/**
	 * 根据id查找客户
	 * 
	 * @param id
	 * @return
	 */
	public Customer getCustomer(Long id) {
		return customerDAO.findOne(id);
	}

	/**
	 * 根据用户id查找客户
	 * 
	 * @param id
	 * @return
	 */
	public Customer findCustomerByUser(long id) {
		User user = userDao.findOne(id);
		return customerDAO.findByWlUser(user);
	}

	/**
	 * 添加客户
	 * 
	 * @param customer
	 */
	public void addCustomer(Customer customer) {
		User user = customer.getWlUser();
		if (StringUtils.isNotBlank(user.getPlainPassword())) {
			entryptPassword(user);
		}
		user.setRegisterDate(new Timestamp(dateProvider.getDate().getTime()));
		customer.setWlUser(user);
		customerDAO.save(customer);
	}

	/**
	 * 更新客户信息
	 * 
	 * @param customer
	 */
	public void updateCustomer(Customer customer) {
		User user = customer.getWlUser();
		if (StringUtils.isNotBlank(user.getPlainPassword())) {
			entryptPassword(user);
		}
		customer.setWlUser(user);
		customerDAO.save(customer);
	}

	/**
	 * 删除客户信息
	 * 
	 * @param l
	 */
	public void deleteCustomer(long l) {
		customerDAO.delete(l);
	}

	/**
	 * 用户更新
	 * 
	 * @param user
	 */
	public void updateUser(User user) {
		if (StringUtils.isNotBlank(user.getPlainPassword())) {
			entryptPassword(user);
		}
		userDao.save(user);
	}

	/**
	 * 根据id删除用户
	 * 
	 * @param id
	 */
	public void deleteUser(Long id) {
		// if (isSupervisor(id)) {
		// logger.warn("操作员{}尝试删除超级管理员用户", getCurrentUserName());
		// throw new ServiceException("不能删除超级管理员用户");
		// }
		// userDao.delete(id);

		User user = getUser(id);// 得到当前用户
		long roleid = user.getRole().getId();
		switch ((int) roleid) {
		case 1:
			Contro ctr = findControByUserid(id);
			deleteController(ctr.getId());
			break;
		case 2:
			Customer cst = findCustomerByUser(id);
			deleteCustomer(cst.getId());
			break;
		case 3:
			Manager mag = findManagerByUser(id);
			deleteManager(mag.getId());
			break;
		case 4:
			Owner owner = findOwnerByUser(id);
			deleteOwner(owner.getId());
			break;
		default:
			logger.warn("级联删除失败");
			throw new ServiceException("操作失败");
		}
	}

	/**
	 * 判断是否超级管理员.
	 */
	private boolean isSupervisor(Long id) {
		return id == 1;
	}

	/**
	 * 取出Shiro中的当前用户LoginName.
	 */
	private String getCurrentUserName() {
		ShiroUser user = (ShiroUser) SecurityUtils.getSubject().getPrincipal();
		return user.loginName;
	}

	/**
	 * 设定安全的密码，生成随机的salt并经过1024次 sha-1 hash
	 */
	private void entryptPassword(User user) {
		byte[] salt = Digests.generateSalt(SALT_SIZE);
		user.setSalt(Encodes.encodeHex(salt));

		byte[] hashPassword = Digests.sha1(user.getPlainPassword().getBytes(), salt, HASH_INTERATIONS);
		user.setPassword(Encodes.encodeHex(hashPassword));
	}

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Autowired
	public void setManagerDao(ManagerDAO managerDao) {
		this.managerDAO = managerDao;
	}

	@Autowired
	public void setControllerDao(ControllerDAO controllerDao) {
		this.controllerDAO = controllerDao;
	}

	@Autowired
	public void setCustmerDao(CustomerDAO customerDao) {
		this.customerDAO = customerDao;
	}

	@Autowired
	public void setOwnerDao(OwnerDAO ownerDao) {
		this.ownerDAO = ownerDao;
	}

	public void setDateProvider(DateProvider dateProvider) {
		this.dateProvider = dateProvider;
	}
}
