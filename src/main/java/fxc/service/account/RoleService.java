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

import fxc.entity.Role;
import fxc.repository.RoleDao;

/**
 * @author fxc
 * 
 */
@Component
@Transactional
public class RoleService {

	public static final String HASH_ALGORITHM = "SHA-1";
	public static final int HASH_INTERATIONS = 1024;
	private static final int SALT_SIZE = 8;

	private static Logger logger = LoggerFactory.getLogger(RoleService.class);

	private RoleDao roleDao;

	/**
	 * 查看角色
	 * 
	 * @return
	 */
	public List<Role> getRoles() {
		return (List<Role>) roleDao.findAll();
	}

	/**
	 * 得到角色详细信息
	 * 
	 * @param id
	 * @return
	 */
	public Role getRole(String id) {
		return roleDao.findOne(Long.parseLong(id));
	}

	/**
	 * 编辑角色
	 * 
	 * @param role
	 */
	public void editRole(Role role) {
		roleDao.save(role);
	}

	/**
	 * 删除角色
	 * 
	 * @param id
	 */
	public void deleteRole(int id) {
		roleDao.delete((long) id);
	}

	/**
	 * @param roleDao the roleDao to set
	 */
	@Autowired
	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

}
