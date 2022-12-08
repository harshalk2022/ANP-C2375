package com.anudip.lab.service;

import java.util.List;

import com.anudip.lab.entity.Contact;

// Abstract method for performing CRUD on entity Contact
public interface ContactService {

	// Method to save Contact Details
	Contact saveContact(Contact contact);

	// Method to fetch All Contacts
	List<Contact> getAllContacts();

	// Method to fetch Contact details using Id
	Contact getContactById(int id);

	// Method to update Contact details based on id
	Contact updateContactById(Contact contact, int id);

	// Method to delete Contact based on id
	void deleteContactById(int id);

}
