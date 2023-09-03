package com.romaozna.simpleclientsdemo.contacts.service;

import com.romaozna.simpleclientsdemo.contacts.dto.ContactDto;
import com.romaozna.simpleclientsdemo.contacts.model.Contact;
import com.romaozna.simpleclientsdemo.contacts.model.ContactType;

import java.util.List;

public interface ContactService {
    ContactDto create(Contact contact);

    List<ContactDto> getClientContacts(Long clientId);

    List<ContactDto> getClientContactsByType(Long clientId, ContactType contactType);
}
