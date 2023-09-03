package com.romaozna.simpleclientsdemo.contacts.service;

import com.romaozna.simpleclientsdemo.contacts.dto.ContactDto;
import com.romaozna.simpleclientsdemo.contacts.model.Contact;
import com.romaozna.simpleclientsdemo.contacts.model.ContactType;
import com.romaozna.simpleclientsdemo.contacts.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.romaozna.simpleclientsdemo.contacts.mapper.ContactMapper.toContactDto;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {
    private final ContactRepository contactRepository;

    @Override
    @Transactional
    public ContactDto create(Contact contact) {
        return toContactDto(contactRepository.save(contact));
    }

    @Override
    public List<ContactDto> getClientContacts(Long clientId) {
        return toContactDto(contactRepository.getAllClientsContacts(clientId));
    }

    @Override
    public List<ContactDto> getClientContactsByType(Long clientId, ContactType contactType) {
        return toContactDto(contactRepository.getAllClientsContactsByType(clientId, contactType));
    }
}
