package com.romaozna.simpleclientsdemo.contacts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class NewEmailContact {
    @NotBlank
    @Email
    String email;
}
