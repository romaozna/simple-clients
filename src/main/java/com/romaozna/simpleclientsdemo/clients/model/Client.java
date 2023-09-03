package com.romaozna.simpleclientsdemo.clients.model;

import com.romaozna.simpleclientsdemo.contacts.model.Contact;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "CLIENTS")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID")
    private Set<Contact> contacts;
}
