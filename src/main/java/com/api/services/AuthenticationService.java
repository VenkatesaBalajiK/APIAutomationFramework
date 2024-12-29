package com.api.services;

import io.restassured.response.Response;

public class AuthenticationService extends BaseService {
	private static final String BASE_PATH = "/api/auth/";

	public Response loginRequest(String userName, String password) {
		String payload = "{\"username\": " + userName + ",\"password\": " + password + "}";
		return postRequest(payload, BASE_PATH);
	}

}
