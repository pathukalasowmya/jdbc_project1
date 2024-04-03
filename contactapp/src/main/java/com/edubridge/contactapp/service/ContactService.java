package com.edubridge.contactapp.service;

import java.util.List;

import com.edubridge.contactapp.model.Contact;

public interface ContactService {
	int addContact(Contact contact );
	List<Contact> viewContacts();
	Contact findContactByName(String Name);
	int updateContact(Contact contact);
	int deleteContact(String Name);
	void deleteAllContacts();

}
