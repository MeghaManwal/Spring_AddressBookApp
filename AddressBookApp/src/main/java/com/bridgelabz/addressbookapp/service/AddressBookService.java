package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService {

	@Override
	public List<AddressBookData> getAddressbookData() {
		List<AddressBookData> bookDataList = new ArrayList<>();
		bookDataList.add(new AddressBookData(1,new AddressBookDTO("Neha","Sharma","Bangalore")));
		return bookDataList;
	}

	@Override
	public AddressBookData getAddressbookDataById(int id) {
		AddressBookData bookData = null;
		bookData=new AddressBookData(1,new AddressBookDTO("Neha","Sharma","Bangalore"));
		return bookData;
	}

	@Override
	public AddressBookData createAddressbookData(AddressBookDTO bookDTO) {
		AddressBookData personData = null;
		personData=new AddressBookData(1, bookDTO);
		return personData;
	}

	@Override
	public AddressBookData updateAddressbookData(AddressBookDTO bookDTO) {
		AddressBookData personData = null;
		personData=new AddressBookData(1, bookDTO);
		return personData;
	}

	@Override
	public void deleteAddressbookData(int id) {
		
	}

}
