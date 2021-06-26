package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

import lombok.Data;

public @Data class AddressBookData {
	
	private int personId;
	private String name;
	private String address;
    public String city;
	
	public String state;
	
	public Number zipcode;
	
	public String phonenumber;
	
	public AddressBookData() { }
	
	public AddressBookData(int personId, AddressBookDTO addressbookDTO) {
		this.personId = personId;
		this.name = addressbookDTO.name;
		this.address = addressbookDTO.address;
		this.city = addressbookDTO.city;
		this.state = addressbookDTO.state;
		this.zipcode = addressbookDTO.zipcode;
		this.phonenumber = addressbookDTO.phonenumber;
	}

}
