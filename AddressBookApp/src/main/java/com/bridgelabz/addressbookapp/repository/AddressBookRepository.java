package com.bridgelabz.addressbookapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bridgelabz.addressbookapp.model.AddressBookData;

public interface AddressBookRepository extends JpaRepository<AddressBookData, Integer>{

	@Query(value="select * from addressbook_data where name like ?1% ", nativeQuery=true)
	List<AddressBookData> findPersonByName(String personName);
}
