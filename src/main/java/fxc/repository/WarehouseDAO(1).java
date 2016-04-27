package fxc.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import fxc.entity.Warehouse;

/**
 * 
 * 仓库crud
 * 
 * @author Lenovo
 * 
 */
public interface WarehouseDAO extends PagingAndSortingRepository<Warehouse, Long> {

}
