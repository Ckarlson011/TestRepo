package com.test.hib.model;

import javax.persistence.*;

@Entity
@Table(name = "orderdetails")
public class Orderdetails {
	private Integer orderNumber;
	private String productCode;
	private Integer quantityOrder;
	private Double priceEach;
	private Short orderLineNumber;

	public Orderdetails(Integer orderNumber, String productCode, Integer quantityOrder, Double priceEach,
			Short orderLineNumber) {
		this.orderNumber = orderNumber;
		this.productCode = productCode;
		this.quantityOrder = quantityOrder;
		this.priceEach = priceEach;
		this.orderLineNumber = orderLineNumber;
	}

	public Integer getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Integer getQuantityOrder() {
		return quantityOrder;
	}

	public void setQuantityOrder(Integer quantityOrder) {
		this.quantityOrder = quantityOrder;
	}

	public Double getPriceEach() {
		return priceEach;
	}

	public void setPriceEach(Double priceEach) {
		this.priceEach = priceEach;
	}

	public Short getOrderLineNumber() {
		return orderLineNumber;
	}

	public void setOrderLineNumber(Integer orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}

}
