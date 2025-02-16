package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.request.models.LoginRequestModel;
import com.api.request.models.ProfileRequestModel;
import com.api.response.models.LoginResponse;
import com.api.response.models.UserProfileResponse;
import com.api.services.AuthenticationService;
import com.api.services.UserProfileManagementService;

import io.restassured.response.Response;

@Listeners(com.api.listerners.TestListener.class)
public class UserManagementTests {

	@Test
	public void UpdateProfileTest() {
		AuthenticationService authenticationService = new AuthenticationService ();
		Response response = authenticationService.loginRequest(new LoginRequestModel("Bala1234", "Bala1234"));
		LoginResponse loginResponse = response.as(LoginResponse.class);

		System.out.println("------------------------------------------------------------");

		UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
		response = userProfileManagementService.getProfile(loginResponse.getToken());
		UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);
		Assert.assertEquals(userProfileResponse.getUsername(), "Bala1234");

		System.out.println("------------------------------------------------------------");
		ProfileRequestModel profileRequest = new ProfileRequestModel.ProfileRequestBuilder().firstName("Jithan").lastName("Ramesh")
				.email("Jramesh1234@gmail.com").mobileNumber(7777777771l).buildProfileRequest();

		response = userProfileManagementService.updateProfile(loginResponse.getToken(), profileRequest);
	}
}
