package com.api.request.models;

public class ProfileRequestModel {
	private String email;
	private String firstName;
	private String lastName;
	private String address;
	private long mobileNumber;

	public ProfileRequestModel(String email, String firstName, String lastName, String address, long mobileNumber) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "ProfileRequestModel [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", mobileNumber=" + mobileNumber + "]";
	}

	public static class ProfileRequestBuilder {
		private String email;
		private String firstName;
		private String lastName;
		private String address;
		private long mobileNumber;

		public ProfileRequestBuilder email(String email) {
			this.email = email;
			return this;
		}

		public ProfileRequestBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public ProfileRequestBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public ProfileRequestBuilder address(String address) {
			this.address = address;
			return this;
		}

		public ProfileRequestBuilder mobileNumber(long mobileNumber) {
			this.mobileNumber = mobileNumber;
			return this;
		}

		public ProfileRequestModel buildProfileRequest() {
			return new ProfileRequestModel(email, firstName, lastName, address, mobileNumber);

		}

	}

}
