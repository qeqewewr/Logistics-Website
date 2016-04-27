package fxc.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import fxc.entity.Location;

/**
 * 地点管理
 * 
 * @author fxc
 * 
 * 
 */

public interface LocationDAO extends PagingAndSortingRepository<Location, Long> {

	Location findByCity(String city);
}
