package jpa.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jpa.entitymodels.Course;


public class CourseDAO {

	public List<Course> getAllCourses() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		String hql = "SELECT c FROM Course c";
		TypedQuery<Course> query = session.createQuery(hql, Course.class);
		List<Course> result = query.getResultList();
		
		t.commit();
		factory.close();
		session.close();
		return result;
	}
	
}
