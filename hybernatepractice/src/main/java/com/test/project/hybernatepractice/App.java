package com.test.project.hybernatepractice;

import java.util.Date;

import com.test.hib.model.Orders;
import com.test.hib.dao.dao;

public class App {

	public static void main(String[] args) {
		// GetOrders getOrders = new GetOrders();
		// Integer orderNumber = new Integer(10123);
		// Orders order = byOrderNumber(orderNumber);
		// System.out.println(order.getOrderNumber);
		dao DAO = new dao();
		Orders order = DAO.findByOrderNumber(10101);
		System.out.println(order.toString());
		
		order.setStatus("PENDING");
		order.setOrderDate(new Date());
		
		DAO.Save(order);

	}

}
