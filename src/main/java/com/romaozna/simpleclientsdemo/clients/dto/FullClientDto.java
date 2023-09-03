package com.romaozna.simpleclientsdemo.clients.dto;

import com.romaozna.simpleclientsdemo.contacts.model.Contact;
import lombok.Value;

import java.util.Set;

@Value
public class FullClientDto {
    Long id;
    String name;
    Set<Contact> contacts;
}
