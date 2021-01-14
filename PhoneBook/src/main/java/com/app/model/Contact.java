package com.app.model;

import java.io.Serializable;
import java.util.Date;


//@Data
public class Contact implements Serializable {

	private static final long serialVersionUID = 1;
	private Integer contactId;
	private String contactName;
	private String contactEmail;
	private String contactPhone;
//	private Date createdDate;
//	private Date updatedDate;

	public Contact() {
		super();
	}

	public Contact(Integer contactId) {
		super();
		this.contactId = contactId;
	}

	public Contact(Integer contactId, String contactName, String contactEmail, String contactPhone, Date createdDate,
			Date updatedDate) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactEmail = contactEmail;
		this.contactPhone = contactPhone;
//		this.createdDate = createdDate;
//		this.updatedDate = updatedDate;
	}

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

//	public Date getCreatedDate() {
//		return createdDate;
//	}
//
//	public void setCreatedDate(Date createdDate) {
//		this.createdDate = createdDate;
//	}
//
//	public Date getUpdatedDate() {
//		return updatedDate;
//	}
//
//	public void setUpdatedDate(Date updatedDate) {
//		this.updatedDate = updatedDate;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", contactEmail=" + contactEmail
				+ ", contactPhone=" + contactPhone + "]";
	}

}
