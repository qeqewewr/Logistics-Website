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
 * The persistent class for the wl_controller database table.
 * 
 */
@Entity
@Table(name = "wl_controller")
@NamedQuery(name = "Contro.findAll", query = "SELECT c FROM Contro c")
public class Contro implements Serializable {
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

	@Column(length = 255)
	private String number;

	private String phone;

	@Column(length = 10)
	private String sex;

	// bi-directional many-to-one association to Manager
	@ManyToOne
	@JoinColumn(name = "ManID")
	private Manager wlManager;

	// bi-directional many-to-one association to Owner
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "wlController")
	private List<Owner> wlOwners;

	
	// bi-directional many-to-one association to Customer
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "wlController")
	private List<Customer> wlCustomers;
	
	// uni-directional one-to-one association to User
	@OneToOne
	@JoinColumn(name = "UseID")
	private User wlUser;

	public Contro() {
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

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
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

	public Manager getWlManager() {
		return this.wlManager;
	}

	public void setWlManager(Manager wlManager) {
		this.wlManager = wlManager;
	}

	public List<Owner> getWlOwners() {
		return this.wlOwners;
	}

	public void setWlOwners(List<Owner> wlOwners) {
		this.wlOwners = wlOwners;
	}


	public Owner addWlOwner(Owner wlOwner) {
		getWlOwners().add(wlOwner);
		wlOwner.setWlController(this);

		return wlOwner;
	}

	public Owner removeWlOwner(Owner wlOwner) {
		getWlOwners().remove(wlOwner);
		wlOwner.setWlController(null);

		return wlOwner;
	}
	
	public List<Customer> getWlCustomers() {
		return this.wlCustomers;
	}

	public void setWlCustomers(List<Customer> wlCustomers) {
		this.wlCustomers = wlCustomers;
	}

	public Customer addWlCustomer(Customer wlCustomer) {
		getWlCustomers().add(wlCustomer);
		wlCustomer.setWlController(this);

		return wlCustomer;
	}

	public Customer removeWlCustomer(Customer wlCustomer) {
		getWlCustomers().remove(wlCustomer);
		wlCustomer.setWlController(null);
		return wlCustomer;
	}


	public User getWlUser() {
		return this.wlUser;
	}

	public void setWlUser(User wlUser) {
		this.wlUser = wlUser;
	}

}