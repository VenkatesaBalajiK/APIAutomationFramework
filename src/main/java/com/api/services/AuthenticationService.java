package com.api.services;

import com.api.request.models.LoginRequestModel;
import com.api.request.models.SignupRequestModel;

import io.restassured.response.Response;

public class AuthenticationService extends BaseService {
	private static final String BASE_PATH = "/api/auth/";

	public Response loginRequest(LoginRequestModel loginDetails) {
		return postRequest(loginDetails, BASE_PATH + "login");
	}

	public Response signupRequest(SignupRequestModel signupDetails) {
		return postRequest(signupDetails, BASE_PATH + "signup");
	}

}
