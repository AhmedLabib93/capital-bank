package com.springboot.capitalbank.repository;

import com.springboot.capitalbank.model.Accounts;
import com.springboot.capitalbank.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository  extends JpaRepository<Contact, Long> {
}
