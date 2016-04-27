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
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The persistent class for the wl_manager database table.
 * 
 */
@Entity
@Table(name = "wl_manager")
@NamedQuery(name = "Manager.findAll", query = "SELECT m FROM Manager m")
public class Manager implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long id;

	private Integer age;

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
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "wlManager")
	private List<Contro> wlControllers;

	// uni-directional one-to-one association to User
	@OneToOne(cascade = { CascadeType.REMOVE })
	@JoinColumn(name = "UseID")
	private User wlUser;

	public Manager() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
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

	public List<Contro> getWlControllers() {
		return this.wlControllers;
	}

	public void setWlControllers(List<Contro> wlControllers) {
		this.wlControllers = wlControllers;
	}

	public Contro addWlController(Contro wlController) {
		getWlControllers().add(wlController);
		wlController.setWlManager(this);

		return wlController;
	}

	public Contro removeWlController(Contro wlController) {
		getWlControllers().remove(wlController);
		wlController.setWlManager(null);

		return wlController;
	}

	public User getWlUser() {
		return this.wlUser;
	}

	public void setWlUser(User wlUser) {
		this.wlUser = wlUser;
	}

}