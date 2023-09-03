package com.romaozna.simpleclientsdemo.clients.controller;

import com.romaozna.simpleclientsdemo.clients.dto.ClientDto;
import com.romaozna.simpleclientsdemo.clients.dto.FullClientDto;
import com.romaozna.simpleclientsdemo.clients.dto.NewClientDto;
import com.romaozna.simpleclientsdemo.clients.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
@Validated
public class ClientController {

    private final ClientService clientService;

    @GetMapping("{id}")
    public FullClientDto getById(@PathVariable Long id) {
        return clientService.getById(id);
    }

    @GetMapping
    public List<ClientDto> getUserItems() {
        return clientService.getAll();
    }

    @PostMapping
    public ClientDto create(@RequestBody @Validated NewClientDto clientDto) {
        return clientService.create(clientDto);
    }
}
