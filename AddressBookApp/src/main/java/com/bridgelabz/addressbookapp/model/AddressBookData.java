package com.bridgelabz.addressbookapp.model;

public class AddressBookData {
	private int personId;
	private String firstName;
	private String lastName;
	private String address;
	
	public AddressBookData(int personId, String firstName, String lastName, String address) {
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
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
	
	

}
