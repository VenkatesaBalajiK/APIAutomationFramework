package com.api.services;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
	private static final String BASE_URI = "http://64.227.160.186:8080";
	protected RequestSpecification requestSpec;

	public BaseService() {
		this.requestSpec = RestAssured.given().baseUri(BASE_URI);
	}

	public Response postRequest(Object payload, String endPoint) {
		return requestSpec.contentType(ContentType.JSON).body(payload).post(BASE_URI + endPoint);
	}
	
}
