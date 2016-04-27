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
 * The persistent class for the wl_goods database table.
 * 货物详情
 * 
 */
@Entity
@Table(name = "wl_goods")
@NamedQuery(name = "Good.findAll", query = "SELECT g FROM Good g")
public class Good implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long id;

	@Column(length = 255)
	private String number;

	@Column(length = 255)
	private String source;

	@Column(length = 255)
	private String transportmode;

	@Column(length = 255)
	private String type;

	private float volume;

	private float weight;

	// bi-directional many-to-one association to Goodsprice
	@OneToMany(cascade = { CascadeType.ALL },mappedBy = "wlGood")
	private List<Goodsprice> wlGoodsprices;

	// bi-directional many-to-one association to Waybill
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "wlGood")
	private List<Waybill> wlWaybills;

	public Good() {
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

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTransportmode() {
		return this.transportmode;
	}

	public void setTransportmode(String transportmode) {
		this.transportmode = transportmode;
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

	public float getWeight() {
		return this.weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public List<Goodsprice> getWlGoodsprices() {
		return this.wlGoodsprices;
	}

	public void setWlGoodsprices(List<Goodsprice> wlGoodsprices) {
		this.wlGoodsprices = wlGoodsprices;
	}

	public Goodsprice addWlGoodsprice(Goodsprice wlGoodsprice) {
		getWlGoodsprices().add(wlGoodsprice);
		wlGoodsprice.setWlGood(this);

		return wlGoodsprice;
	}

	public Goodsprice removeWlGoodsprice(Goodsprice wlGoodsprice) {
		getWlGoodsprices().remove(wlGoodsprice);
		wlGoodsprice.setWlGood(null);

		return wlGoodsprice;
	}

	public List<Waybill> getWlWaybills() {
		return this.wlWaybills;
	}

	public void setWlWaybills(List<Waybill> wlWaybills) {
		this.wlWaybills = wlWaybills;
	}

	public Waybill addWlWaybill(Waybill wlWaybill) {
		getWlWaybills().add(wlWaybill);
		wlWaybill.setWlGood(this);

		return wlWaybill;
	}

	public Waybill removeWlWaybill(Waybill wlWaybill) {
		getWlWaybills().remove(wlWaybill);
		wlWaybill.setWlGood(null);

		return wlWaybill;
	}

}