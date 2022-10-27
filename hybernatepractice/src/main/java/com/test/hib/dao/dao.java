package com.test.hib.dao;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.test.hib.model.Orders;

public class dao {

	public Orders findByOrderNumber(Integer orderNum) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		String hql = "FROM Orders o WHERE o.orderNumber = :orderNumber";
		TypedQuery<Orders> query = session.createQuery(hql, Orders.class);
		query.setParameter("orderNumber", orderNum);
		
		Orders result = query.getSingleResult();
		
		tx.commit();
		factory.close();
		session.close();
		return result;
	}
	public void Save(Orders order) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(order);
		
		tx.commit();
		factory.close();
		session.close();

	}
	
}
