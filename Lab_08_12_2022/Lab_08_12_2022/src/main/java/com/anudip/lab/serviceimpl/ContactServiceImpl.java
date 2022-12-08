package com.anudip.lab.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.lab.entity.Contact;
import com.anudip.lab.exception.ContactNotFoundException;
import com.anudip.lab.repository.ContactRepository;
import com.anudip.lab.service.ContactService;

@Service
// Implement all CRUD methods
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactRepository contactRepository;

	@Override
	// Saving Contact details into table using save() of JpaRepository
	public Contact saveContact(Contact contact) {
		return contactRepository.save(contact);
	}

	@Override
	// fetching all Contacts from table
	public List<Contact> getAllContacts() {
		return contactRepository.findAll();
	}

	@Override
	// fetching Contact details from table based on id, if not found then throw
	// exception
	public Contact getContactById(int id) {
		return contactRepository.findById(id)
				.orElseThrow(() -> new ContactNotFoundException("Entered Contact Id dose not exist"));
	}

	@Override
	// Updating Contact details based on id from table using save()
	public Contact updateContactById(Contact contact, int id) {
		Contact newContact = contactRepository.findById(id)
				.orElseThrow(() -> new ContactNotFoundException("Entered Contact Id dose not exist"));

		// Set new values
		newContact.setEmail(contact.getEmail());
		newContact.setPhone(contact.getPhone());
		newContact.setCity(contact.getCity());

		// Saving updated Contact Details
		contactRepository.save(newContact);
		return newContact;
	}

	@Override
	// Delete Contact Based on Id using deleteById()
	public void deleteContactById(int id) {
		contactRepository.findById(id)
				.orElseThrow(() -> new ContactNotFoundException("Entered Contact Id dose not exist"));
		contactRepository.deleteById(id);
	}

}
