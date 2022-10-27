package com.test.project.hybernatepractice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.test.hib.controller.GetOrders;
import com.test.hib.model.Orders;

public class App {

	public static void main(String[] args) {
		// GetOrders getOrders = new GetOrders();
		// Integer orderNumber = new Integer(10123);
		// Orders order = byOrderNumber(orderNumber);
		// System.out.println(order.getOrderNumber);

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Orders order = new Orders();
		System.out.println("Success!");
		tx.commit();
		factory.close();
		session.close();
	}

}
