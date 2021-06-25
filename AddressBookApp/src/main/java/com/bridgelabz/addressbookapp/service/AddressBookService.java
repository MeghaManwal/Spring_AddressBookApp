package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.exceptions.AddressBookException;
import com.bridgelabz.addressbookapp.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService {

	private List<AddressBookData> addressbookDataList = new ArrayList<>();
	
	@Override
	public List<AddressBookData> getAddressbookData() {
		return addressbookDataList;
	}

	@Override
	public AddressBookData getAddressbookDataById(int id) {
		return addressbookDataList.stream()
				.filter(personData -> personData.getPersonId() == id)
				.findFirst()
				.orElseThrow(() -> new AddressBookException("Person Not Found"));
	}

	@Override
	public AddressBookData createAddressbookData(AddressBookDTO bookDTO) {
		AddressBookData bookData = null;
		bookData=new AddressBookData(addressbookDataList.size()+1, bookDTO);
		addressbookDataList.add(bookData);
		return bookData;
	}

	@Override
	public void deleteAddressbookData(int id) {
		AddressBookData bookData = this.getAddressbookDataById(id);
		addressbookDataList.remove(id-1);
	}

    @Override
    public AddressBookData updateAddressbookData(int id, AddressBookDTO bookDTO) {
    	AddressBookData bookData = this.getAddressbookDataById(id);
		bookData.setFirstName(bookDTO.firstName);
		bookData.setLastName(bookDTO.lastName);
		bookData.setAddress(bookDTO.address);
		return addressbookDataList.set(id-1,bookData);
    }

}
