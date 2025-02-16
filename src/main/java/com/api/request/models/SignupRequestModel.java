package com.api.request.models;

public class SignupRequestModel {
	private String username;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private long mobileNumber;

	private SignupRequestModel(String username, String password, String email, String firstName, String lastName,
			long mobileNumber) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Signup [username=" + username + ", password=" + password + ", email=" + email + ", firstName="
				+ firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + "]";
	}

	public static class SignupRequestBuilder {
		private String username;
		private String password;
		private String email;
		private String firstName;
		private String lastName;
		private long mobileNumber;

		public SignupRequestBuilder username(String username) {
			this.username = username;
			return this;
		}

		public SignupRequestBuilder password(String password) {
			this.password = password;
			return this;
		}

		public SignupRequestBuilder email(String email) {
			this.email = email;
			return this;
		}

		public SignupRequestBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public SignupRequestBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public SignupRequestBuilder mobileNumber(long mobileNumber) {
			this.mobileNumber = mobileNumber;
			return this;
		}

		public SignupRequestModel buildSignup() {
			return new SignupRequestModel(username, password, email, firstName, lastName, mobileNumber);
		}
	}
}
