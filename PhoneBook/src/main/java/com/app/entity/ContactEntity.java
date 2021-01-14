package com.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

//@Data
@Entity
@Table(name = "Contact")
public class ContactEntity {

	@Id
	@Column(name = "CONTACT_ID")
	// @SequenceGenerator(name = "cid_seq_gen", sequenceName = "Contact_ID_Seq",
	// allocationSize = 1)
	@GeneratedValue(generator = "cid_seq_gen")
	@GenericGenerator(name = "Contact_ID_Seq", strategy = "increment")
	private Integer contactId;

	@Column(name = "Name")
	private String contactName;

	@Column(name = "Email")
	private String contactEmail;

	@Column(name = "Phone")
	private String contactPhone;

	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date createdDate;

	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date updatedDate;

	public ContactEntity() {
		super();
	}

	public ContactEntity(Integer contactId) {
		super();
		this.contactId = contactId;
	}

	public ContactEntity(Integer contactId, String contactName, String contactEmail, String contactPhone,
			Date createdDate, Date updatedDate) {
		super();
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactEmail = contactEmail;
		this.contactPhone = contactPhone;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "ContactEntity [contactId=" + contactId + ", contactName=" + contactName + ", contactEmail="
				+ contactEmail + ", contactPhone=" + contactPhone + ", createdDate=" + createdDate + ", updatedDate="
				+ updatedDate + "]";
	}

}
