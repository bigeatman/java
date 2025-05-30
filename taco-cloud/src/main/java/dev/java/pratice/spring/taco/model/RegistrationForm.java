package dev.java.pratice.spring.taco.model;

import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.Data;

@Data
public class RegistrationForm {

	private String username;
	private String password;
	private String fullname;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;

	public Users toUser(PasswordEncoder passwordEncoder) {
		return new Users(username, passwordEncoder.encode(password), fullname, street, city, state, zip, phoneNumber);
	}
}
