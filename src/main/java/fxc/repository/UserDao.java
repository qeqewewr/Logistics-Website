package fxc.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import fxc.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
