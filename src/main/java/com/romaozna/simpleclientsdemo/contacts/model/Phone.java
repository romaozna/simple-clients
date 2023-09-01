package com.romaozna.simpleclientsdemo.contacts.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "PHONES")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Phone {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "PHONE")
    private String phone;
}
