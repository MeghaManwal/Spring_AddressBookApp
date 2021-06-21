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

@RestController
@RequestMapping("/addressbook")
public class AddressBookControllers {

	@RequestMapping(value={" ", "/","/get"})
	public ResponseEntity<String> getAddressbookData() {
		return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
	}
		
	
	@GetMapping("/get/{Id}")
	public ResponseEntity<String> getAddressbookData(@PathVariable("Id") int Id){
		return new ResponseEntity<String>("Get Call Success for id: "+ Id, HttpStatus.OK);
	}
		
	
	@PostMapping("/create")
	public ResponseEntity<String> addAddressbookData(@RequestBody AddressBookDTO addressbookDTO) {
		return new ResponseEntity<String>("Created Address Book Data for: "+ addressbookDTO, HttpStatus.OK);
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<String> updateAddressbookData(@RequestBody AddressBookDTO addressbookDTO) {
		return new ResponseEntity<String>("Updated address Book Data for: "+addressbookDTO, HttpStatus.OK);
	}
	
	
	@DeleteMapping("/delete/{Id}")
	public ResponseEntity<String> deleteAddressbookData(@PathVariable("Id") int Id) {
		return new ResponseEntity<String>("Delete Call Success for id: "+Id, HttpStatus.OK);
	}
	
}
