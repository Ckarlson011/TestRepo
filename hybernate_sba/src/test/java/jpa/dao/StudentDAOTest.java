package jpa.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class StudentDAOTest {

	private static StudentDAO studentDAO;
	
	@BeforeAll
	public static void setUp() {
		studentDAO = new StudentDAO();
	}
	
	@Test
	public void testValidateStudent() {
		boolean expected1 = true;
		boolean expected2 = true;
		boolean expected3 = false;
		boolean expected4 = false;
		
		String email1 = "aiannitti7@is.gd";
		String email2 = "cstartin3@flickr.com";
		String password1= "TWP4hf5j";
		String password2= "XYHzJ1S";
		
		boolean result1 = studentDAO.validateStudent(email1, password1);
		boolean result2 = studentDAO.validateStudent(email2, password2);
		boolean result3 = studentDAO.validateStudent(email1, password2);
		boolean result4 = studentDAO.validateStudent(email2, password1);
		
		Assertions.assertEquals(expected1, result1);
		Assertions.assertEquals(expected2, result2);
		Assertions.assertEquals(expected3, result3);
		Assertions.assertEquals(expected4, result4);
	}
}
