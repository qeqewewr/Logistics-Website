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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The persistent class for the wl_customer database table.
 * 
 */
@Entity
@Table(name = "wl_customer")
@NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long id;

	private int age;

	@Column(length = 255)
	private String email;

	@Column(length = 255)
	private String name;

	private String phone;

	@Column(length = 10)
	private String sex;



	@ManyToOne
	@JoinColumn(name = "contrID")
	private Contro wlController;


	// bi-directional many-to-one association to Waybill
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "wlCustomer")
	private List<Waybill> wlWaybills;

	// uni-directional one-to-one association to User
	@OneToOne
	@JoinColumn(name = "UseID")
	private User wlUser;

	public Customer() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Contro getWlController() {
		return wlController;
	}

	public void setWlController(Contro wlController) {
		this.wlController = wlController;
	}

	public List<Waybill> getWlWaybills() {
		return this.wlWaybills;
	}

	public void setWlWaybills(List<Waybill> wlWaybills) {
		this.wlWaybills = wlWaybills;
	}

	public Waybill addWlWaybill(Waybill wlWaybill) {
		getWlWaybills().add(wlWaybill);
		wlWaybill.setWlCustomer(this);

		return wlWaybill;
	}

	public Waybill removeWlWaybill(Waybill wlWaybill) {
		getWlWaybills().remove(wlWaybill);
		wlWaybill.setWlCustomer(null);

		return wlWaybill;
	}
	

	public User getWlUser() {
		return this.wlUser;
	}

	public void setWlUser(User wlUser) {
		this.wlUser = wlUser;
	}

}