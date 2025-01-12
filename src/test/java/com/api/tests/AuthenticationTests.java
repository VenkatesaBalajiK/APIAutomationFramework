package com.api.tests;

import org.testng.annotations.Test;

import com.api.request.models.LoginRequest;
import com.api.services.AuthenticationService;

import io.restassured.response.Response;

public class AuthenticationTests {

	@Test(description = "Login test")
	public void loginRequestTest() {
		AuthenticationService authenticationService = new AuthenticationService();
		LoginRequest loginDetails = new LoginRequest("Bala1234", "Bala1234");
		
		Response response = authenticationService.loginRequest(loginDetails);
		System.out.println(response.asPrettyString());
	}

}
