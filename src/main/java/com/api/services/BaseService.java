package com.api.services;

import com.api.filters.LoggingFilter;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
	private static final String BASE_URI = "http://64.227.160.186:8080";
	protected RequestSpecification requestSpec;

	static {
		RestAssured.filters(new LoggingFilter());
	}

	public BaseService() {
		this.requestSpec = RestAssured.given().baseUri(BASE_URI);
	}

	protected void setAuthToken(String token) {
		requestSpec.header("Authorization", "Bearer " + token);
	}

	public Response postRequest(Object payload, String endPoint) {
		return requestSpec.contentType(ContentType.JSON).body(payload).post(BASE_URI + endPoint);
	}

	public Response getRequest(String endPoint) {
		return requestSpec.get(endPoint);
	}

	public Response putRequest(Object payload, String endPoint) {
		return requestSpec.contentType(ContentType.JSON).body(payload).put(BASE_URI + endPoint);
	}

}
