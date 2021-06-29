package com.bridgelabz.addressbookapp.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.service.IAddressBookService;

@RestController
@RequestMapping("/addressbook")
public class AddressBookControllers {

	@Autowired
	private IAddressBookService addressbookservice;
	
	@GetMapping(value={" ", "/","/get"})
	public ResponseEntity<ResponseDTO> getAddressbookData() {
		List<AddressBookData> bookDataList = null;
		bookDataList = addressbookservice.getAddressbookData();
		ResponseDTO respDTO = new ResponseDTO("Get Call Successful", bookDataList);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
		
	
	@GetMapping("/get/{Id}")
	public ResponseEntity<ResponseDTO> getAddressbookDataById(@PathVariable("Id") int id){
		AddressBookData bookData = null;
		bookData = addressbookservice.getAddressbookDataById(id);
		ResponseDTO respDTO = new ResponseDTO("Get Call Successful", bookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
		
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddressbookData(@Valid @RequestBody AddressBookDTO addressbookDTO) {
		AddressBookData bookData = null;
		bookData = addressbookservice.createAddressbookData(addressbookDTO);
		ResponseDTO respDTO = new ResponseDTO("Created Addressbook Data Successfully", bookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	
	@PutMapping("/update/{Id}")
	public ResponseEntity<ResponseDTO> updateAddressbookData(@PathVariable("Id") int id,@RequestBody AddressBookDTO addressbookDTO) {
		AddressBookData bookData = null;
		bookData = addressbookservice.updateAddressbookData(id,addressbookDTO);
		ResponseDTO respDTO = new ResponseDTO("Updated Addressbook Data Successfully", bookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{Id}")
	public ResponseEntity<ResponseDTO> deleteAddressbookData(@PathVariable("Id") int id) {
		addressbookservice.deleteAddressbookData(id);
		ResponseDTO respDTO = new ResponseDTO("Created Addressbook Data Successfully", "Deleted Id : "+ id);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@GetMapping("/name/{name}")
	public ResponseEntity<ResponseDTO> getAddessBookData(@PathVariable("name") String personName) {
		List<AddressBookData> personDataList = null;
		personDataList = addressbookservice.getPersonByName(personName);
		ResponseDTO respDTO = new ResponseDTO("Get Call for Name Successful", personDataList);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
}
