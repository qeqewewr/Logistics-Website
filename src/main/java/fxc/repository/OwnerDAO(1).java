package fxc.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import fxc.entity.Owner;
import fxc.entity.User;

/**
 * 
 * 车主管理
 * 
 * @author fxc
 * 
 */
public interface OwnerDAO extends PagingAndSortingRepository<Owner, Long> {

	Owner findByWlUser(User user);

}
