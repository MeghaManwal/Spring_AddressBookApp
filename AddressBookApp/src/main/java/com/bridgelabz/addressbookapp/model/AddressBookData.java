package com.bridgelabz.addressbookapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

import lombok.Data;

@Entity
@Table(name="addressbook_data")
public @Data class AddressBookData {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int personId;
	private String name;
	private String address;
    public String city;
	
	public String state;
	
	public String zipcode;
	
	public String phonenumber;
	
	public AddressBookData() { }
	
	public AddressBookData(AddressBookDTO bookDTO) {
		this.updateAddressbookData(bookDTO);
	}
	
	private void updateAddressbookData(AddressBookDTO bookDTO) {
		
	}

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
