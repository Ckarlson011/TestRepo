package jpa.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jpa.entitymodels.Student;
import jpa.entitymodels.StudentCourse;
import jpa.entitymodels.Course;

public class StudentDAO {

	public List<Student> getAllStudents() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		String hql = "SELECT s FROM Student s";
		TypedQuery<Student> query = session.createQuery(hql, Student.class);
		List<Student> result = query.getResultList();
		
		t.commit();
		factory.close();
		session.close();
		return result;
	}

	public Student getStudentByEmail(String sEmail) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		String hql = "SELECT s FROM Student s WHERE s.sEmail = :email";
		TypedQuery<Student> query = session.createQuery(hql, Student.class);
		query.setParameter("email", sEmail);
		Student result = query.getSingleResult();
		
		t.commit();
		factory.close();
		session.close();
		return result;
	}

	public boolean validateStudent(String sEmail, String sPassword) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		String hql = "SELECT s FROM Student s WHERE s.sEmail = :email";
		TypedQuery<Student> query = session.createQuery(hql, Student.class);
		query.setParameter("email", sEmail);
		Student result = query.getSingleResult();
		
		boolean returnValue = false;
		if (sPassword.equals(result.getSPass())) returnValue=true;
		
		t.commit();
		factory.close();
		session.close();
		return returnValue;
	}

	public void registerStudentToCourse(String sEmail, int cId) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		StudentCourse newRegistration = new StudentCourse();
		newRegistration.setStudent_email(sEmail);
		newRegistration.setCourse_id(cId);
		session.save(newRegistration);
		
		t.commit();
		factory.close();
		session.close();
		return;
	}

	public List<Course> getStudentCourses(String sEmail) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		String hql = "SELECT c FROM Course c, StudentCourse sc WHERE sc.student_email = :email AND sc.course_id = c.id";
		TypedQuery<Course> query = session.createQuery(hql, Course.class);
		query.setParameter("email", sEmail);
		List<Course> result = query.getResultList();
		
		t.commit();
		factory.close();
		session.close();
		return result;
	}

}
