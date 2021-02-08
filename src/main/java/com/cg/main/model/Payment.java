/**
 * 
 */
package com.cg.main.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * @author Dishani Basak
 *Payment class where all the required variables , constructors, 
 *getters and setters and toString function are declared
 */
@Entity
@Table(name="payment_table")
public class Payment{
	/**
	 * variable declaration
	 */	 
	@Id
	@GeneratedValue
	private int id;
	private String status="Successful";
	@Column(name ="card_no")
	@Size(min=16, max=16, message = "card no must be of 16 digits")
	private String cardNo;
	private int cvv;
	@Column(name = "upi_id")
	private String upiId;
	private String password;
	
	public Payment() {
		super();
	}
	public Payment(String status) {
		super();
		this.status = status;
	}
	
	public Payment(String cardNo, int cvv) {
		super();
		this.cardNo = cardNo;
		this.cvv = cvv;
	}
	
	public Payment(String upiId, String password) {
		super();
		this.upiId = upiId;
		this.password = password;
	}
	//Getters and Setters declaration
	
	/**
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 
	 * @return result
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * 
	 * @param result
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getUpiId() {
		return upiId;
	}
	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * toString() to display output
	 */
	@Override
	public String toString() {
		return "Payment [id=" + id + ", result=" + status + "]";
	}
	
}
