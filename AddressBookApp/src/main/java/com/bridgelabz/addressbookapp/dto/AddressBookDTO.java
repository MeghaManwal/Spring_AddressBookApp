package com.bridgelabz.addressbookapp.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.Data;

public @Data class AddressBookDTO {


	@Pattern(regexp = "^[A-Z]{1}[a-z A-Z\\s]{2,}$", message = "Person FirstName Invalid")
	@NotEmpty(message = "FirstName cannot be null")
	public String firstName;
	

	@Pattern(regexp = "^[A-Z]{1}[a-z A-Z\\s]{2,}$", message = "Person LastName Invalid")
	@NotEmpty(message = "LastName cannot be null")
	public String lastName;
	
	@NotBlank(message = "Address cannot be null")
	public String address;
	
	public AddressBookDTO() { }

	public AddressBookDTO(String firstName, String lastName, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
		
}
