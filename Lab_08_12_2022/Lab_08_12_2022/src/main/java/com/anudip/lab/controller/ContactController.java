package com.anudip.lab.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.anudip.lab.entity.Contact;
import com.anudip.lab.service.ContactService;

@RestController
// Rest controller to handle all incoming request using REST API
public class ContactController {

	@Autowired
	private ContactService contactService;

	// Saving Contact details using Post Mapping
	@PostMapping("/save")
	public ResponseEntity<Contact> saveContact(@Valid @RequestBody Contact contact) {
		return new ResponseEntity<Contact>(contactService.saveContact(contact), HttpStatus.CREATED);
	}

	// fetching Contact details using Get Mapping
	@GetMapping("getall")
	public List<Contact> getAllContact() {
		return contactService.getAllContacts();
	}

	// fetching Contact details by Id using Get Mapping
	@GetMapping("/getbyid/{id}")
	public ResponseEntity<Contact> getContact(@PathVariable("id") int id) {
		return new ResponseEntity<Contact>(contactService.getContactById(id), HttpStatus.OK);
	}

	// Updating Contact details by id using put mapping
	@PutMapping("/update/{id}")
	public ResponseEntity<Contact> updateContact(@PathVariable("id") int id, @RequestBody Contact contact) {
		return new ResponseEntity<Contact>(contactService.updateContactById(contact, id), HttpStatus.OK);
	}

	// Deleting Contact details by id using Delete Mapping
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteContact(@PathVariable("id") int id) {
		contactService.deleteContactById(id);
		return new ResponseEntity<String>("Deleted Successfully", HttpStatus.OK);
	}

}
