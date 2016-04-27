package fxc.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the wl_vehicle database table.
 * 
 */
@Entity
@Table(name = "wl_vehicle")
@NamedQuery(name = "Vehicle.findAll", query = "SELECT v FROM Vehicle v")
public class Vehicle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long id;

	@Column(length = 255)
	private String number;

	@Column(length = 255)
	private String type;

	private float volume;

	// bi-directional many-to-one association to Owner
	@ManyToOne
	@JoinColumn(name = "OwnID")
	private Owner wlOwner;

	// bi-directional many-to-one association to Waybillstatus
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "wlVehicle")
	private List<Waybillstatus> wlWaybillstatuses;

	public Vehicle() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getVolume() {
		return this.volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}

	public Owner getWlOwner() {
		return this.wlOwner;
	}

	public void setWlOwner(Owner wlOwner) {
		this.wlOwner = wlOwner;
	}

	public List<Waybillstatus> getWlWaybillstatuses() {
		return this.wlWaybillstatuses;
	}

	public void setWlWaybillstatuses(List<Waybillstatus> wlWaybillstatuses) {
		this.wlWaybillstatuses = wlWaybillstatuses;
	}

	public Waybillstatus addWlWaybillstatus(Waybillstatus wlWaybillstatus) {
		getWlWaybillstatuses().add(wlWaybillstatus);
		wlWaybillstatus.setWlVehicle(this);

		return wlWaybillstatus;
	}

	public Waybillstatus removeWlWaybillstatus(Waybillstatus wlWaybillstatus) {
		getWlWaybillstatuses().remove(wlWaybillstatus);
		wlWaybillstatus.setWlVehicle(null);

		return wlWaybillstatus;
	}

}