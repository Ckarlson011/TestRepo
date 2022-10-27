package com.test.hib.controller;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.test.hib.model.Orders;

public class GetOrders {
	public Orders byOrderNumber(Integer on) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Orders o = session.load(Orders.class, on);

		tx.commit();
		factory.close();
		session.close();

		return o;
	}
}
