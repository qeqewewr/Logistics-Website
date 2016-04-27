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
 * The persistent class for the wl_owner database table.
 * 
 */
@Entity
@Table(name = "wl_owner")
@NamedQuery(name = "Owner.findAll", query = "SELECT o FROM Owner o")
public class Owner implements Serializable {
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

	// bi-directional many-to-one association to Controller
	@ManyToOne
	@JoinColumn(name = "ConID")
	private Contro wlController;

	// bi-directional many-to-one association to Vehicle
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "wlOwner")
	private List<Vehicle> wlVehicles;

	// uni-directional one-to-one association to User
	@OneToOne
	@JoinColumn(name = "UseID")
	private User wlUser;

	public Owner() {
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

	public Contro getWlController() {
		return this.wlController;
	}

	public void setWlController(Contro wlController) {
		this.wlController = wlController;
	}

	public List<Vehicle> getWlVehicles() {
		return this.wlVehicles;
	}

	public void setWlVehicles(List<Vehicle> wlVehicles) {
		this.wlVehicles = wlVehicles;
	}

	public Vehicle addWlVehicle(Vehicle wlVehicle) {
		getWlVehicles().add(wlVehicle);
		wlVehicle.setWlOwner(this);

		return wlVehicle;
	}

	public Vehicle removeWlVehicle(Vehicle wlVehicle) {
		getWlVehicles().remove(wlVehicle);
		wlVehicle.setWlOwner(null);

		return wlVehicle;
	}

	public User getWlUser() {
		return this.wlUser;
	}

	public void setWlUser(User wlUser) {
		this.wlUser = wlUser;
	}

}