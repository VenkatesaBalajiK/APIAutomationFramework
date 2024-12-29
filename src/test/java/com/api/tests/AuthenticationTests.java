package com.api.tests;

import org.testng.annotations.Test;

import com.api.services.AuthenticationService;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;

public class AuthenticationTests {

	@Test(description = "Login test")
	public void loginRequestTest() {
		AuthenticationService authenticationService = new AuthenticationService();
		Response response = authenticationService.loginRequest("uday1234", "uday1234");
		System.out.println(response.asPrettyString());
	}

}
