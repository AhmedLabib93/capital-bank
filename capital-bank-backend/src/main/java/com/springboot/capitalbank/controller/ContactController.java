package com.springboot.capitalbank.controller;

import com.springboot.capitalbank.model.Contact;
import com.springboot.capitalbank.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("capitalbank/v1")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping("/contact")
    public Contact saveContactInquiryDetails(@RequestBody Contact contact) {
        return contactService.saveContactInquiryDetails(contact);
    }
}
