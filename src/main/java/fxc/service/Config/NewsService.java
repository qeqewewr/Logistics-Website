package fxc.service.Config;

import java.sql.Timestamp;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springside.modules.utils.DateProvider;

import fxc.entity.WlNew;
import fxc.repository.NewsDao;

@Component
@Transactional
public class NewsService {
	public static final String HASH_ALGORITHM = "SHA-1";
	public static final int HASH_INTERATIONS = 1024;
	private static final int SALT_SIZE = 8;

	private static Logger logger = LoggerFactory.getLogger(NewsService.class);

	public NewsDao newsDao;

	private DateProvider dateProvider = DateProvider.DEFAULT;

	/**
	 * 根据id查找新闻
	 * 
	 * @param id
	 * @return
	 */
	public WlNew findNewsByid(long id) {
		return newsDao.findOne(id);
	}

	/**
	 * 筛选所有的文章
	 * 
	 * @return
	 */
	public List<WlNew> findAll() {
		return (List<WlNew>) newsDao.findAll();
	}

	/**
	 * 编辑或添加新闻
	 * 
	 * @param news
	 */
	public void editNews(WlNew news) {
		news.setDate(new Timestamp(dateProvider.getDate().getTime()));
		newsDao.save(news);
	}

	/**
	 * 删除新闻
	 * 
	 * @param id
	 */
	public void deleteNews(long id) {
		newsDao.delete(id);
	}

	/**
	 * @param newsDao the newsDao to set
	 */
	@Autowired
	public void setNewsDao(NewsDao newsDao) {
		this.newsDao = newsDao;
	}

	/**
	 * @return the dateProvider
	 */
	public DateProvider getDateProvider() {
		return dateProvider;
	}

	/**
	 * @param dateProvider the dateProvider to set
	 */
	public void setDateProvider(DateProvider dateProvider) {
		this.dateProvider = dateProvider;
	}

}
