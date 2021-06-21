package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

public class AddressBookData {
	
	private int personId;
	private String firstName;
	private String lastName;
	private String address;
	
	public AddressBookData(int personId, AddressBookDTO addressbookDTO) {
		this.personId = personId;
		this.firstName = addressbookDTO.firstName;
		this.lastName = addressbookDTO.lastName;
		this.address = addressbookDTO.address;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
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
	
	@Override
	public String toString() {
		return "AddressBookData [personId=" + personId + ", firstName=" + firstName + ", "
				+ "lastName=" + lastName + ", address=" + address + "]";
	}

}
