package com.test.hib.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "orderdetails")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderNumber;
	
	private String productCode;
	
	private Integer quantityOrdered;
	
	@Column(columnDefinition="decimal", precision=10, scale=2)
	private Double priceEach;
	
	private Short orderLineNumber;

}