package com.romaozna.simpleclientsdemo.contacts.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "EMAILS")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Email {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "EMAIL")
    private String email;
}
