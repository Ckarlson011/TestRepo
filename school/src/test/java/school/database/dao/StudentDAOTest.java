package school.database.dao;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import school.database.entity.Course;

public class StudentDAOTest {
	@Test
	public void testStudent() {
		Student a = new Student();
		a.setId(1);
		a.setEmail("mgabriel@perscholas.org");
		a.setfName("Mike");
		a.setlName("Gabriel");
		
		Student b = new Student();
		b.setId(1);
		b.setEmail("mgabriel@perscholas.org");
		b.setfName("Mike");
		b.setlName("Gabriel");		
		
		assertEquals(a, b);
	}
}
