package com.edubridge.contactapp.dao;

import java.util.List;

import com.edubridge.contactapp.model.Contact;

public interface ContactDao {
	int addContact(Contact contact );
	List<Contact> viewContacts();
	Contact findContactByName(String Name);
	int updateContact(Contact contact);
	int deleteContact(String Name);
	void deleteAllContacts();
	
	
	

}
