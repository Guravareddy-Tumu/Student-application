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

public class StudentPostTest  extends TestBase {



	@Test
	public void createNewStudent() {

		ArrayList<String> courses = new ArrayList<String>();

		courses.add("Java");

		courses.add("Selenium");

		Student s = new Student();

		s.setFirstName("Gurava Reddy");
		s.setLastName("Tumu");

		s.setEmail("guravareddy786@gmail.com");

		s.setProgramme("Computer Science");

		s.setCourses(courses);

		given().contentType(ContentType.JSON).when().body(s).post().then().statusCode(201);
		
		
		System.out.println("Success");

	}

}
