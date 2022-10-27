package com.test.project.hybernatepractice;

import com.test.hib.controller.GetOrders;
import com.test.hib.model.Orders;

public class App {

	public static void main(String[] args) {
		GetOrders getOrders = new GetOrders();
		Integer orderNumber = new Integer(10123);
		Orders order = byOrderNumber(orderNumber);
		System.out.println(order.getOrderNumber);
		

	}

}
