package com.students.test;

import static com.jayway.restassured.RestAssured.given;

import org.junit.Test;

import com.base.test.TestBase;

public class StudentDelete extends TestBase{



	@Test
	public void deleteStudent() {

		given().when().delete("/101").then().statusCode(204);

		System.out.println("Success");

	}

}
