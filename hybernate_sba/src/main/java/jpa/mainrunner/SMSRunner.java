package jpa.mainrunner;

import java.util.Scanner;
import java.util.List;

import jpa.dao.CourseDAO;
import jpa.dao.StudentDAO;
import jpa.entitymodels.*;

public class SMSRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDAO studentDAO = new StudentDAO();
		CourseDAO courseDAO = new CourseDAO();
		Scanner scnr = new Scanner(System.in);
		while(true) {
			System.out.println("Are you a(n)");
			System.out.println();
			System.out.println("  1. Student");
			System.out.println("  2. quit");
			System.out.println();
			System.out.println("Please, enter 1 or 2.");
			int selection;
			if (scnr.hasNextInt()) selection = scnr.nextInt();
			else selection = 3;
			scnr.nextLine();
			if (selection == 1) {
				System.out.println("Enter Your Email:");
				String email = scnr.nextLine();
				System.out.println("Enter Your Password");
				String pword = scnr.nextLine();
				if(studentDAO.validateStudent(email, pword)) {
					System.out.println("MY COURSES:");
					List<Course> myCourses = studentDAO.getStudentCourses(email);
					for (Course thisCourse : myCourses) {
						System.out.println(thisCourse.getCId() + " | " + thisCourse.getCInstructorName() + " | " + thisCourse.getCName());
					}
					System.out.println();
					System.out.println("Would you like to:");
					System.out.println("  1. Register to Class");
					System.out.println("  2. Logout");
					while(true) {
						if (scnr.hasNextInt()) selection = scnr.nextInt();
						else selection = 3;
						scnr.nextLine();
						if (selection == 1 || selection == 2) break;
						else System.out.println("Try Again");
					}
					if (selection == 1) {
						System.out.println("ALL COURSES:");
						List<Course> allCourses = courseDAO.getAllCourses();
						for (Course thisCourse : allCourses) {
							System.out.println(thisCourse.getCId() + " | " + thisCourse.getCInstructorName() + " | " + thisCourse.getCName());
						}
						System.out.println("\nWhich course would you like to register for")//TODO
					}
					else {
						System.out.println("Goodbye!");
						break;
					}
				}
				else {
					System.out.println("Invalid Entries\nGoodbye!");
					break;
				}
			}
			else if (selection == 2) {
				System.out.println("Goodbye!");
				break;
			}
			else {
				System.out.println("Incorrect selection, please try again.\n");
			}
		}

		scnr.close();
	}

}
