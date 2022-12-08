package com.anudip.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anudip.lab.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
