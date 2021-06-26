package com.bridgelabz.addressbookapp.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.Data;

public @Data class AddressBookDTO {

	@Pattern(regexp = "^[A-Z]{1}[a-z A-Z\\s]{2,}$", message = "Person Name Invalid")
	@NotEmpty(message = "Name cannot be null")
	public String name;
	
	@NotBlank(message = "Address cannot be null")
	public String address;
	
	@NotBlank(message = "City cannot be null")
	public String city;
	
	@NotBlank(message = "State cannot be null")
	public String state;
	
	@NotBlank(message = "ZipCode cannot be null")
	public String zipcode;
	
	@Pattern(regexp = "^[+][0-9]{1,}\\s[1-9]{1}[0-9]{9}$", message = "PhoneNumber is Invalid")
	public String phonenumber;
			
}
