package com.romaozna.simpleclientsdemo.contacts.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "CONTACTS")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    @Id
    @Column(name = "CONTACT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contactId;

    @Column(name = "CONTACT")
    private String contact;

    @Column(name = "TYPE")
    private ContactType contactType;

    @Column(name = "CLIENT_ID")
    private Long clientId;
}
