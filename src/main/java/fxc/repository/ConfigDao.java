package fxc.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import fxc.entity.WlConfig;

public interface ConfigDao extends PagingAndSortingRepository<WlConfig, Long> {

}
