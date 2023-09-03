package com.romaozna.simpleclientsdemo.clients.dto;

import com.romaozna.simpleclientsdemo.contacts.dto.ContactDto;
import lombok.Value;

import java.util.List;

@Value
public class FullClientDto {
    Long id;
    String name;
    List<ContactDto> contacts;
}
