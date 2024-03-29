package com.romaozna.simpleclientsdemo.contacts.mapper;

import com.romaozna.simpleclientsdemo.contacts.dto.ContactDto;
import com.romaozna.simpleclientsdemo.contacts.dto.NewContactDto;
import com.romaozna.simpleclientsdemo.contacts.model.Contact;
import com.romaozna.simpleclientsdemo.contacts.model.ContactType;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ContactMapper {
    public static Contact toContact(NewContactDto newContactDto) {
        Contact contact = new Contact();
        contact.setContact(newContactDto.getContact());
        contact.setContactType(ContactType.from(newContactDto.getType()));
        contact.setClientId(newContactDto.getClientId());
        return contact;
    }

    public static ContactDto toContactDto(Contact contact) {
        return new ContactDto(
                contact.getContactId(),
                contact.getContact(),
                contact.getContactType());
    }

    public static List<ContactDto> toContactDto(List<Contact> contacts) {
        return contacts.stream()
                .map(ContactMapper::toContactDto)
                .collect(Collectors.toList());
    }
}
