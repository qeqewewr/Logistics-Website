package fxc.service.Config;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import fxc.entity.WlConfig;
import fxc.repository.ConfigDao;

@Component
@Transactional
public class ConfigService {
	public static final String HASH_ALGORITHM = "SHA-1";
	public static final int HASH_INTERATIONS = 1024;
	private static final int SALT_SIZE = 8;

	private ConfigDao configDao;
	private static Logger logger = LoggerFactory.getLogger(ConfigService.class);

	/**
	 * 筛选出公司简介和联系方式
	 * 
	 * @return
	 */
	public List<WlConfig> findAll() {
		return (List<WlConfig>) configDao.findAll();
	}

	/**
	 * 根据id查找配置信息
	 * 
	 * 
	 * @param id
	 * 
	 *            1: 公司简介
	 *            2: 联系我们
	 * @return
	 */
	public WlConfig findById(long id) {
		return configDao.findOne(id);
	}

	/**
	 * 编辑公司简介、联系我们
	 * 
	 * @param id
	 *            1：公司简介
	 *            2：联系我们
	 * @param content
	 */
	public void saveConfig(long id, String content) {
		// WlConfig config = new WlConfig();
		// config.setId(id);
		WlConfig config = configDao.findOne(id);
		config.setContent(content);
		configDao.save(config);
	}

	/**
	 * @param configDao the configDao to set
	 */
	@Autowired
	public void setConfigDao(ConfigDao configDao) {
		this.configDao = configDao;
	}

}
