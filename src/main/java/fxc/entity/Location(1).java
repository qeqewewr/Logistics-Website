package fxc.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the wl_location database table.
 * 
 */
@Entity
@Table(name = "wl_location")
@NamedQuery(name = "Location.findAll", query = "SELECT l FROM Location l")
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long id;

	@Column(length = 255)
	private String city;

	private float distance;

	// bi-directional many-to-one association to Goodsprice
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "wlLocation")
	private List<Goodsprice> wlGoodsprices;

	// bi-directional many-to-one association to Waybillstatus
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "wlLocation")
	private List<Waybillstatus> wlWaybillstatuses;

	public Location() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public float getDistance() {
		return this.distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	public List<Goodsprice> getWlGoodsprices() {
		return this.wlGoodsprices;
	}

	public void setWlGoodsprices(List<Goodsprice> wlGoodsprices) {
		this.wlGoodsprices = wlGoodsprices;
	}

	public Goodsprice addWlGoodsprice(Goodsprice wlGoodsprice) {
		getWlGoodsprices().add(wlGoodsprice);
		wlGoodsprice.setWlLocation(this);

		return wlGoodsprice;
	}

	public Goodsprice removeWlGoodsprice(Goodsprice wlGoodsprice) {
		getWlGoodsprices().remove(wlGoodsprice);
		wlGoodsprice.setWlLocation(null);

		return wlGoodsprice;
	}

	public List<Waybillstatus> getWlWaybillstatuses() {
		return this.wlWaybillstatuses;
	}

	public void setWlWaybillstatuses(List<Waybillstatus> wlWaybillstatuses) {
		this.wlWaybillstatuses = wlWaybillstatuses;
	}

	public Waybillstatus addWlWaybillstatus(Waybillstatus wlWaybillstatus) {
		getWlWaybillstatuses().add(wlWaybillstatus);
		wlWaybillstatus.setWlLocation(this);

		return wlWaybillstatus;
	}

	public Waybillstatus removeWlWaybillstatus(Waybillstatus wlWaybillstatus) {
		getWlWaybillstatuses().remove(wlWaybillstatus);
		wlWaybillstatus.setWlLocation(null);

		return wlWaybillstatus;
	}

}