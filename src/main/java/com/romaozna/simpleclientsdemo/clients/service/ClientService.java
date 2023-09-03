package com.romaozna.simpleclientsdemo.clients.service;

import com.romaozna.simpleclientsdemo.clients.dto.ClientDto;
import com.romaozna.simpleclientsdemo.clients.dto.FullClientDto;
import com.romaozna.simpleclientsdemo.clients.dto.NewClientDto;

import java.util.List;

public interface ClientService {
    ClientDto create(NewClientDto clientDto);

    FullClientDto getById(Long id);

    List<ClientDto> getAll();
}
