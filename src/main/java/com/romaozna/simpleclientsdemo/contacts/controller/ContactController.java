package com.romaozna.simpleclientsdemo.contacts.controller;

import com.romaozna.simpleclientsdemo.clients.service.ClientService;
import com.romaozna.simpleclientsdemo.contacts.dto.ContactDto;
import com.romaozna.simpleclientsdemo.contacts.dto.NewContactDto;
import com.romaozna.simpleclientsdemo.contacts.model.ContactType;
import com.romaozna.simpleclientsdemo.contacts.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.romaozna.simpleclientsdemo.contacts.mapper.ContactMapper.toContact;

@RestController
@RequestMapping("/contacts")
@RequiredArgsConstructor
@Validated
public class ContactController {

    private final ClientService clientService;
    private final ContactService contactService;

    @GetMapping("/clients/{id}")
    public List<ContactDto> getClientContacts(@PathVariable Long id, @RequestParam Optional<String> type) {
        clientService.getById(id);
        if (type.isPresent()) {
            return contactService.getClientContactsByType(id, ContactType.from(type.get()));
        }
        return contactService.getClientContacts(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ContactDto create(@RequestBody @Validated NewContactDto newContactDto) {
        return contactService.create(toContact(newContactDto));
    }
}
