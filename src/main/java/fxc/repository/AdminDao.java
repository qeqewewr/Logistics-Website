package fxc.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import fxc.entity.Administer;

/*
 * 管理员管理
 * 
 */
public interface AdminDao extends PagingAndSortingRepository<Administer, Long> {
	Administer findByUsername(String username);
}
