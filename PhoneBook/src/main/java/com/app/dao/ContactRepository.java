package com.app.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.ContactEntity;

public interface ContactRepository extends JpaRepository<ContactEntity, Serializable> {

}
