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
    public AddressBookData updateAddressbookData(int id, AddressBookDTO bookDTO) {
    	AddressBookData bookData = this.getAddressbookDataById(id);
		bookData.setName(bookDTO.name);
		bookData.setAddress(bookDTO.address);
		bookData.setCity(bookDTO.city);
		bookData.setState(bookDTO.state);
		bookData.setZipcode(bookDTO.zipcode);
		bookData.setPhonenumber(bookDTO.phonenumber);
		return addressbookDataList.set(id-1,bookData);
    }
    
    @Override
	public void deleteAddressbookData(int id) {
		AddressBookData bookData = this.getAddressbookDataById(id);
		addressbookDataList.remove(bookData);
	}

}
