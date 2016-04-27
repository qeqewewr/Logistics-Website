package fxc.repository;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springside.modules.test.spring.SpringTransactionalTestCase;

import fxc.entity.User;

@ContextConfiguration(locations = { "/applicationContext.xml" })
public class UserDaoTest extends SpringTransactionalTestCase {

	@Autowired
	private UserDao userDao;

	@Test
	public void findUser() throws Exception {
		// Page<Task> tasks = taskDao.findByUserId(2L, new PageRequest(0, 100, Direction.ASC, "id"));
		// assertEquals(5, tasks.getContent().size());
		// assertEquals(new Long(1), tasks.getContent().get(0).getId());
		//
		// tasks = taskDao.findByUserId(99999L, new PageRequest(0, 100, Direction.ASC, "id"));
		// assertEquals(0, tasks.getContent().size());
		// List<User> user_lst=(List<User>)userDao.findAll();

		User user = userDao.findByLoginName("admin");
		assertEquals("Admin", user.getName());
		assertEquals(1, user.getId());
	}

}
