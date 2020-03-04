package com.students.test;

import java.util.*;

import org.junit.*;

import com.base.test.TestBase;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import static org.hamcrest.Matchers.*;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.student.model.Student;

public class StudentPut extends TestBase {


	
	
	
	@Test
	public void updateStudent() {

		ArrayList<String> courses = new ArrayList<String>();

		courses.add("Java");

		courses.add("Selenium");
		
		courses.add("Oracle");

		Student s = new Student();

		s.setFirstName("Gurava Reddy");
		s.setLastName("T");

		s.setEmail("guravareddy786@gmail.com");

		s.setProgramme("Computer Science");

		s.setCourses(courses);

		given().contentType(ContentType.JSON).when().body(s).put("/101").then().statusCode(200);
		
		
		System.out.println("Success");

	}

}
