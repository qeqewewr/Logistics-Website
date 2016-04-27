package fxc.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import fxc.entity.Good;

/**
 * 商品管理
 * 
 * @author fxc
 * 
 */
public interface GoodDAO extends PagingAndSortingRepository<Good, Long> {

	/**
	 * 根据用户货物号查找货物
	 * 
	 * @param number
	 * @return
	 */
	Good findByNumber(String number);

}
