package com.bridgelabz.addressbookapp.service;

import java.util.List;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

public interface IAddressBookService {
	List<AddressBookData> getAddressbookData();
	AddressBookData getAddressbookDataById(int id);
	AddressBookData createAddressbookData(AddressBookDTO bookDTO);
	AddressBookData updateAddressbookData(int id, AddressBookDTO bookDTO);
	void deleteAddressbookData(int id);

}
