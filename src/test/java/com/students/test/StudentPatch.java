package com.students.test;

import static com.jayway.restassured.RestAssured.given;

import java.util.ArrayList;

import org.junit.Test;

import com.base.test.TestBase;
import com.jayway.restassured.http.ContentType;
import com.student.model.Student;

public class StudentPatch   extends TestBase{


	
	
	
	@Test
	public void patchStudent() {

		ArrayList<String> courses = new ArrayList<String>();

		courses.add("Java");

		courses.add("Selenium");
		
		courses.add("Oracle");

		Student s = new Student();

		s.setFirstName("Gurava Reddy");
		s.setLastName("Tumu");

		s.setEmail("guravareddy786@gmail.com");

		s.setProgramme("Computer Science");

		s.setCourses(courses);

		given().contentType(ContentType.JSON).when().body(s).patch("/101").then().statusCode(200);
		
		
		System.out.println("Success");

	}

}
