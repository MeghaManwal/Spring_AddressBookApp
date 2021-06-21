package com.bridgelabz.addressbookapp.controllers;

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

@RestController
@RequestMapping("/addressbook")
public class AddressBookControllers {

	@RequestMapping(value={" ", "/","/get"})
	public ResponseEntity<ResponseDTO> getAddressbookData() {
		AddressBookData bookData = new AddressBookData(1,new AddressBookDTO("Neha","Sharma","Bangalore"));
		ResponseDTO respDTO = new ResponseDTO("Get Call Successful", bookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
		
	
	@GetMapping("/get/{Id}")
	public ResponseEntity<ResponseDTO> getAddressbookData(@PathVariable("Id") int Id){
		AddressBookData bookData = new AddressBookData(1,new AddressBookDTO("Neha","Sharma","Bangalore"));
		ResponseDTO respDTO = new ResponseDTO("Get Call for Id Successful", bookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
		
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddressbookData(@RequestBody AddressBookDTO addressbookDTO) {
		AddressBookData bookData = new AddressBookData(1,addressbookDTO);
		ResponseDTO respDTO = new ResponseDTO("Created Addressbook Data Successfully", bookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateAddressbookData(@RequestBody AddressBookDTO addressbookDTO) {
		AddressBookData bookData = new AddressBookData(1,addressbookDTO);
		ResponseDTO respDTO = new ResponseDTO("Updated Addressbook Data Successfully", bookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	
	@DeleteMapping("/delete/{Id}")
	public ResponseEntity<ResponseDTO> deleteAddressbookData(@PathVariable("Id") int Id) {
		ResponseDTO respDTO = new ResponseDTO("Created Addressbook Data Successfully", "Deleted Id : "+ Id);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
}
