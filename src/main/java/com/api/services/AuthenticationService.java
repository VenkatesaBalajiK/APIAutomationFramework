package com.api.services;

import com.api.request.models.LoginRequest;

import io.restassured.response.Response;

public class AuthenticationService extends BaseService {
	private static final String BASE_PATH = "/api/auth/";

	public Response loginRequest(LoginRequest loginDetails) {
		return postRequest(loginDetails, BASE_PATH + "login");
	}

}
