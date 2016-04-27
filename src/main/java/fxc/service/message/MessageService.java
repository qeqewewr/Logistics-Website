package fxc.service.message;

import java.sql.Timestamp;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springside.modules.utils.DateProvider;

import fxc.entity.Message;
import fxc.repository.MessageDao;

@Component
@Transactional
public class MessageService {
	public static final String HASH_ALGORITHM = "SHA-1";
	public static final int HASH_INTERATIONS = 1024;

	@Autowired
	public MessageDao messageDao;

	public void saveMessage(Message message) {
		
		messageDao.save(message);
	}

}
