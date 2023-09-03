package com.romaozna.simpleclientsdemo.contacts.dto;

import com.romaozna.simpleclientsdemo.contacts.model.ContactType;
import lombok.Value;

@Value
public class ContactDto {
    Long id;
    String contact;
    ContactType contactType;

}
