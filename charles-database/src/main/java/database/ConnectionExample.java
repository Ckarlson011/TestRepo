package database;

import java.util.ArrayList;

public class ConnectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDAO employeeDAO = new EmployeeDAO();
		ArrayList<Employee> employees = employeeDAO.findByFirstName("Mary", "Patterson");
		for (Employee e: employees) {
			System.out.println(e.toString());
		}
		employees = employeeDAO.findByEmail("mpatterso@classicmodelcars.com");
		for (Employee e: employees) {
			System.out.println(e.toString());
		}
	}

}
