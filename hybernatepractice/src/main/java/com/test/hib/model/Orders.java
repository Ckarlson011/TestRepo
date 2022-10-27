package com.test.hib.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Orders {

	//@Column determines the name of the column the field maps to
	//if the field name is the same as the column name
	//the annotation is not required
	@Column(name = "orderNumber")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderNumber;
	
	//@Temporal(TemporalType.DATE)
	private Date orderDate;
	
	//@Temporal(TemporalType.DATE)
	private Date requiredDate;
	
	//@Temporal(TemporalType.DATE)
	
	private Date shippedDate;
	
	private String status;
	
	@Column(name = "comments", columnDefinition = "TEXT")
	private String comments;
	
	private Integer customerNumber;

	public Orders() {
		
	}
	
	public Orders(Date orderDate, Date requiredDate, Date shippedDate, String status,
			String comments, Integer customerNumber) {
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		this.requiredDate = requiredDate;
		this.shippedDate = shippedDate;
		this.status = status;
		this.comments = comments;
		this.customerNumber = customerNumber;
	}

	public Integer getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getRequiredDate() {
		return requiredDate;
	}

	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}

	public Date getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(Integer customerNumber) {
		this.customerNumber = customerNumber;
	}

}
