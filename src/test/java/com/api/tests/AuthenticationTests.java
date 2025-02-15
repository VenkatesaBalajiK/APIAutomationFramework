package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.request.models.LoginRequestModel;
import com.api.request.models.SignupRequestModel;
import com.api.response.models.LoginResponse;
import com.api.services.AuthenticationService;

import io.restassured.response.Response;

@Listeners(com.api.listerners.TestListener.class)
public class AuthenticationTests {

	@Test(description = "Login test")
	public void loginRequestTest() {
		AuthenticationService authenticationService = new AuthenticationService();
		LoginRequestModel loginDetails = new LoginRequestModel("Bala1234", "Bala1234");
		Response response = authenticationService.loginRequest(loginDetails);
		LoginResponse loginResponse = response.as(LoginResponse.class);
		Assert.assertTrue(loginResponse.getToken() != null);
	}

	@Test(description = "Sign up")
	public void signup() {
		AuthenticationService authenticationService = new AuthenticationService();
		SignupRequestModel SignupDetails = new SignupRequestModel.Builder().username("Bala1234").password("Bala1234")
				.email("bala@gmail.com").firstName("Bala").lastName("Kandavel").mobileNumber(1244545645l).buildSignup();
		authenticationService.signupRequest(SignupDetails);
	}

}
