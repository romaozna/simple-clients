package com.romaozna.simpleclientsdemo.contacts.dto;

import com.romaozna.simpleclientsdemo.contacts.model.ContactType;
import lombok.Value;

@Value
public class ContactDto {
    String contact;
    ContactType type;

}
