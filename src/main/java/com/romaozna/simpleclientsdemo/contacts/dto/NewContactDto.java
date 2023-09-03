package com.romaozna.simpleclientsdemo.contacts.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class NewContactDto {
    @NotBlank
    String contact;

    @NotBlank
    String contactType;
}
