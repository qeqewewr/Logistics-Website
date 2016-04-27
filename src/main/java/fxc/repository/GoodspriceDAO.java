package fxc.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import fxc.entity.Goodsprice;

/**
 * 
 * 商品价格管理
 * 
 * @author fxc
 * 
 */
public interface GoodspriceDAO extends PagingAndSortingRepository<Goodsprice, Long> {

}
