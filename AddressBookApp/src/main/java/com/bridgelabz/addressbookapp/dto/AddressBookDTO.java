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
	
	public String city;
	
	public String state;
	
	public Number zipcode;
	
	@Pattern(regexp = "^[+][0-9]{1,}\\s[1-9]{1}[0-9]{9}$", message = "PhoneNumber Invalid")
	public String phonenumber;
			
}
