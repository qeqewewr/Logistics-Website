package fxc.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import fxc.entity.Role;

/**
 * 角色crud
 * 
 * @author fxc
 * 
 */
public interface RoleDao extends PagingAndSortingRepository<Role, Long> {

}
