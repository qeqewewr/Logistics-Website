package fxc.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import fxc.entity.Message;

public interface MessageDao extends PagingAndSortingRepository<Message, Long> {

}
