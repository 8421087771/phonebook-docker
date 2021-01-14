package com.app.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.ContactEntity;
import com.app.model.Contact;
import com.app.service.IContactService;

@RestController
@RequestMapping("/rest")
public class ContactRestController {

	@Autowired
	IContactService contactService;

	@GetMapping("/all")
	public ResponseEntity<?> getAllContact() {

		ResponseEntity<?> responseEntity = null;
		List<ContactEntity> contacts = contactService.getAllContacts();
		if (contacts != null && !contacts.isEmpty()) {
			responseEntity = new ResponseEntity<List<ContactEntity>>(contacts, HttpStatus.OK);
		} else {

			responseEntity = new ResponseEntity<String>("No data is available !", HttpStatus.OK);
		}

		return responseEntity;
	}

	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Contact contact) {

		return new ResponseEntity<String>("Contact is saved with Id : " + contactService.savecontact(contact),
				HttpStatus.OK);
	}
	
//	@DeleteMapping("/delete/{contactId}")
//	public ResponseEntity<?> deleteOne(@PathVariable Integer contactId) {
//
//		ResponseEntity<?> responseEntity=null;
//
//		try {
//			contactService.deleteContactId(contactId);
//			responseEntity = new ResponseEntity<String>("Contact "+contactId+" is deleted", HttpStatus.BAD_REQUEST);
//		} catch (Exception e) {
//
//			responseEntity = new ResponseEntity<String>("Contact "+contactId+" is not available", HttpStatus.BAD_REQUEST);
//		}
//
//		return responseEntity;
//	}

}
