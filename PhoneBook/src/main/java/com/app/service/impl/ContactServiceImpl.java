package com.app.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ContactRepository;
import com.app.entity.ContactEntity;
import com.app.model.Contact;
import com.app.service.IContactService;

@Service
public class ContactServiceImpl implements IContactService {
	@Autowired
	ContactRepository contactRepository;

	@Override
	public boolean savecontact(Contact c) {
		ContactEntity entity = new ContactEntity();
		BeanUtils.copyProperties(c, entity);
		ContactEntity contactEntity = contactRepository.save(entity);

		return contactEntity.getContactId() != null;
	}

	@Override
	public Contact getContactId(Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ContactEntity> getAllContacts() {

		return contactRepository.findAll();
	}

//	@Override
//	public void deleteContact(Integer contactId) {
//		// TODO Auto-generated method stub
//		contactRepository.deleteById(contactId);
//		
//	}
//
//	@Override
//	public Contact getContactById(Integer contactId) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
