package com.romaozna.simpleclientsdemo.clients.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class NewClientDto {
    @NotBlank
    String name;
}
