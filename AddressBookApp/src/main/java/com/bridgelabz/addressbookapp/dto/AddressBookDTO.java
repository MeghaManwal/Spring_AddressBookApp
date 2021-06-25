package com.bridgelabz.addressbookapp.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.Data;

public @Data class AddressBookDTO {


	@Pattern(regexp = "^[A-Z]{1}[a-z A-Z\\s]{2,}$", message = "Employee Name Invalid")
	@NotEmpty(message = "Employee name cannot be null")
	public String firstName;
	

	@Pattern(regexp = "^[A-Z]{1}[a-z A-Z\\s]{2,}$", message = "Employee Name Invalid")
	@NotEmpty(message = "Employee name cannot be null")
	public String lastName;
	
	@NotEmpty(message = "Employee name cannot be null")
	public String address;
	
	public AddressBookDTO() { }

	public AddressBookDTO(String firstName, String lastName, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
		
}
