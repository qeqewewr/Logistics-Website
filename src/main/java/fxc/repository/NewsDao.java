package fxc.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import fxc.entity.WlNew;

public interface NewsDao extends PagingAndSortingRepository<WlNew, Long> {

}
