package fxc.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the wl_news database table.
 * 
 */
@Entity
@Table(name = "wl_news")
@NamedQuery(name = "WlNew.findAll", query = "SELECT w FROM WlNew w")
public class WlNew implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Lob
	private String content;

	private Timestamp date;

	private String title;

	public WlNew() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	/*public String getTime() {
		Date currentTime = this.date;
	    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	    String dateString = format.format(currentTime);
	 	return dateString;
	}*/
		
	
}