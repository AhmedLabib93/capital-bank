package com.springboot.capitalbank.service.impl;

import com.springboot.capitalbank.model.Contact;
import com.springboot.capitalbank.repository.ContactRepository;
import com.springboot.capitalbank.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Random;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public Contact saveContactInquiryDetails(Contact contact) {
        contact.setContactId(getServiceReqNumber());
        Contact savedContact = contactRepository.save(contact);
        return savedContact;
    }

    private String getServiceReqNumber() {
        Random random = new Random();
        int ranNum = random.nextInt(999999999 - 9999) + 9999;
        return "SR" + ranNum;
    }
}
