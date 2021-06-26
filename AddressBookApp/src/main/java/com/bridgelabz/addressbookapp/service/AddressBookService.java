package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.exceptions.AddressBookException;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.repository.AddressBookRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService {

	@Autowired
	private AddressBookRepository addressbookrepo;
	
	@Override
	public List<AddressBookData> getAddressbookData() {
		return addressbookrepo.findAll();
	}

	@Override
	public AddressBookData getAddressbookDataById(int id) {
		return addressbookrepo
				.findById(id)
				.orElseThrow(() -> new AddressBookException("Person Not Id: "+id+
						                                     "doesn't exist."));
	}

	@Override
	public AddressBookData createAddressbookData(AddressBookDTO bookDTO) {
		AddressBookData bookData = null;
		bookData=new AddressBookData(bookDTO);
		log.debug("Person Data: "+bookData.toString());
		return addressbookrepo.save(bookData);
	}

    @Override
    public AddressBookData updateAddressbookData(int id, AddressBookDTO bookDTO) {
    	AddressBookData bookData = this.getAddressbookDataById(id);
		bookData.updateAddressbookData(bookDTO);
		return addressbookrepo.save(bookData);
    }
    
    @Override
	public void deleteAddressbookData(int id) {
		AddressBookData bookData = this.getAddressbookDataById(id);
		addressbookrepo.delete(bookData);
	}

}
