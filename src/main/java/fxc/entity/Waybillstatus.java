package fxc.entity;

import java.io.Serializable;
import java.sql.Timestamp;

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
 * The persistent class for the wl_waybillstatus database table.
 * 
 */
@Entity
@Table(name = "wl_waybillstatus")
@NamedQuery(name = "Waybillstatus.findAll", query = "SELECT w FROM Waybillstatus w")
public class Waybillstatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long id;

	@Column(length = 255)
	private String status;

	private Timestamp time;

	// bi-directional many-to-one association to Vehicle
	@ManyToOne
	@JoinColumn(name = "VehID")
	private Vehicle wlVehicle;

	// bi-directional many-to-one association to Waybill
	@ManyToOne
	@JoinColumn(name = "WaybillID")
	private Waybill wlWaybill;

	// bi-directional many-to-one association to Location
	@ManyToOne
	@JoinColumn(name = "LocID")
	private Location wlLocation;

	public Waybillstatus() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public Vehicle getWlVehicle() {
		return this.wlVehicle;
	}

	public void setWlVehicle(Vehicle wlVehicle) {
		this.wlVehicle = wlVehicle;
	}

	public Waybill getWlWaybill() {
		return this.wlWaybill;
	}

	public void setWlWaybill(Waybill wlWaybill) {
		this.wlWaybill = wlWaybill;
	}

	public Location getWlLocation() {
		return this.wlLocation;
	}

	public void setWlLocation(Location wlLocation) {
		this.wlLocation = wlLocation;
	}

}