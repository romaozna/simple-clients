package com.romaozna.simpleclientsdemo.contacts.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@AllArgsConstructor
@Jacksonized
public class NewContactDto {
    @NotBlank
    String contact;

    @NotBlank
    String type;

    @NotNull
    @Positive
    Long clientId;
}
