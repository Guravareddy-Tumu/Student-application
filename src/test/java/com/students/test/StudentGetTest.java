package com.students.test;

import org.junit.*;

import com.base.test.TestBase;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import static org.hamcrest.Matchers.*;

import static com.jayway.restassured.RestAssured.*;

public class StudentGetTest extends TestBase {

	@Test
	public void getAllStudentInformation() {

		Response response = given().when().get("/list");

		// System.out.println(response.body().prettyPrint());

		// validate the status code

		given().when().get("/list").then().statusCode(200);

	}

	@Test

	public void getStudent() {

		Response response1 = given().when().get("/list?programme=Financial Anaysis&limit=2");

		System.out.println(response1.prettyPeek());

		Response response2 = given().param("programme", "Financial Analysis").param("limit", 2).when().get("/list");

		System.out.println(response2.prettyPeek());

		System.out.println("Success");
	}

}
