package com.romaozna.simpleclientsdemo.contacts.repository;

import com.romaozna.simpleclientsdemo.contacts.model.Contact;
import com.romaozna.simpleclientsdemo.contacts.model.ContactType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    @Query(" select ct from Contact ct join Client c on c.id = ct.id " +
            "where c.id = ?1 ")
    List<Contact> getAllClientsContacts(Long clientId);

    @Query(" select ct from Contact ct join Client c on c.id = ct.id " +
            "where c.id = ?1 and ct.contactType = ?2 ")
    List<Contact> getAllClientsContactsByType(Long clientId, ContactType contactType);
}
