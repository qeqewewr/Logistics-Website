package fxc.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the wl_waybill database table.
 * 
 */
@Entity
@Table(name = "wl_waybill")
@NamedQuery(name = "Waybill.findAll", query = "SELECT w FROM Waybill w")
public class Waybill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private long id;

	@Column(length = 255)
	private String number;

	@Column(length = 255)
	private String payment;

	private float price;

	@Column(length = 255)
	private String receiveaddress;

	@Column(length = 255)
	private String receiver;

	@Column(length = 255)
	private String receiverphone;
	

	@Temporal(TemporalType.TIMESTAMP)
	private Date receivetime;

	@Column(length = 255)
	private String remark;

	@Column(length = 255)
	private String sendaddress;

	@Column(length = 255)
	private String sender;
	
	@Column(length = 255)
	private String senderphone;


	@Temporal(TemporalType.TIMESTAMP)
	private Date sendtime;

	@Column(length = 255)
	private String storemode;

	private float volume;

	private float weight;

	private String status;

	// bi-directional many-to-one association to Good
	@ManyToOne
	@JoinColumn(name = "GooID")
	private Good wlGood;

	// bi-directional many-to-one association to Customer
	@ManyToOne
	@JoinColumn(name = "CusID")
	private Customer wlCustomer;

	// bi-directional many-to-one association to Waybillstatus
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "wlWaybill")
	private List<Waybillstatus> wlWaybillstatuses;

	public Waybill() {
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

	public String getPayment() {
		return this.payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getReceiveaddress() {
		return this.receiveaddress;
	}

	public void setReceiveaddress(String receiveaddress) {
		this.receiveaddress = receiveaddress;
	}

	public String getReceiver() {
		return this.receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getReceiverphone() {
		return this.receiverphone;
	}

	public void setReceiverphone(String receiverphone) {
		this.receiverphone = receiverphone;
	}

	public Date getReceivetime() {
		return this.receivetime;
	}

	public void setReceivetime(Date receivetime) {
		this.receivetime = receivetime;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSendaddress() {
		return this.sendaddress;
	}

	public void setSendaddress(String sendaddress) {
		this.sendaddress = sendaddress;
	}

	public String getSender() {
		return this.sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getSenderphone() {
		return this.senderphone;
	}

	public void setSenderphone(String senderphone) {
		this.senderphone = senderphone;
	}

	public Date getSendtime() {
		return this.sendtime;
	}

	public void setSendtime(Date sendtime) {
		this.sendtime = sendtime;
	}

	public String getStoremode() {
		return this.storemode;
	}

	public void setStoremode(String storemode) {
		this.storemode = storemode;
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

	public Good getWlGood() {
		return this.wlGood;
	}

	public void setWlGood(Good wlGood) {
		this.wlGood = wlGood;
	}

	public Customer getWlCustomer() {
		return this.wlCustomer;
	}

	public void setWlCustomer(Customer wlCustomer) {
		this.wlCustomer = wlCustomer;
	}

	public List<Waybillstatus> getWlWaybillstatuses() {
		return this.wlWaybillstatuses;
	}

	public void setWlWaybillstatuses(List<Waybillstatus> wlWaybillstatuses) {
		this.wlWaybillstatuses = wlWaybillstatuses;
	}

	public Waybillstatus addWlWaybillstatus(Waybillstatus wlWaybillstatus) {
		getWlWaybillstatuses().add(wlWaybillstatus);
		wlWaybillstatus.setWlWaybill(this);

		return wlWaybillstatus;
	}

	public Waybillstatus removeWlWaybillstatus(Waybillstatus wlWaybillstatus) {
		getWlWaybillstatuses().remove(wlWaybillstatus);
		wlWaybillstatus.setWlWaybill(null);

		return wlWaybillstatus;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * 0: 审核未通过
	 * 1： 同意配送
	 * 2： 未审核
	 * 
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}