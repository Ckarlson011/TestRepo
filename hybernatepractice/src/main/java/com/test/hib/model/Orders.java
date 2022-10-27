package com.test.hib.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity
@Table(name = "orders")
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
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

}
