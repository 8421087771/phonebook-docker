package com.app.service;

import java.util.List;

import com.app.entity.ContactEntity;
import com.app.model.Contact;

public interface IContactService {
	boolean savecontact(Contact c);

	public Contact getContactId(Integer cid);

//	public void deleteContact(Integer contactId);

	public List<ContactEntity> getAllContacts();

//	public Contact getContactById(Integer contactId);
}
