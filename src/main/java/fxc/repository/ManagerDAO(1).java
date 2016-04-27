package fxc.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import fxc.entity.Manager;
import fxc.entity.User;

/**
 * 
 * 总经理管理
 * 
 * @author fxc
 * 
 */
public interface ManagerDAO extends PagingAndSortingRepository<Manager, Long> {

	Manager findByWlUser(User wlUser);
}
