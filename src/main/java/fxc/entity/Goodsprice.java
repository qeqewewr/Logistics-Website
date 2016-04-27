package fxc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the wl_goodsprice database table.
 * 
 */
@Entity
@Table(name = "wl_goodsprice")
@NamedQuery(name = "Goodsprice.findAll", query = "SELECT g FROM Goodsprice g")
public class Goodsprice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long id;

	private float price;

	// bi-directional many-to-one association to Good
	@ManyToOne
	@JoinColumn(name = "GooID")
	private Good wlGood;

	// bi-directional many-to-one association to Location
	@ManyToOne
	@JoinColumn(name = "LocID")
	private Location wlLocation;

	public Goodsprice() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Good getWlGood() {
		return this.wlGood;
	}

	public void setWlGood(Good wlGood) {
		this.wlGood = wlGood;
	}

	public Location getWlLocation() {
		return this.wlLocation;
	}

	public void setWlLocation(Location wlLocation) {
		this.wlLocation = wlLocation;
	}

}