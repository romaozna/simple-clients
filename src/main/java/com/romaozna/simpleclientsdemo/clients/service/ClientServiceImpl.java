package com.romaozna.simpleclientsdemo.clients.service;

import com.romaozna.simpleclientsdemo.clients.dto.ClientDto;
import com.romaozna.simpleclientsdemo.clients.dto.FullClientDto;
import com.romaozna.simpleclientsdemo.clients.dto.NewClientDto;
import com.romaozna.simpleclientsdemo.clients.model.Client;
import com.romaozna.simpleclientsdemo.clients.repository.ClientsRepository;
import com.romaozna.simpleclientsdemo.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.romaozna.simpleclientsdemo.clients.mapper.ClientMapper.*;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final ClientsRepository clientsRepository;

    @Override
    @Transactional
    public ClientDto create(NewClientDto clientDto) {
        return toClientDto(clientsRepository.save(toClient(clientDto)));
    }

    @Override
    public FullClientDto getById(Long id) {
        validateClientOrException(id);
        return toFullClientDto(clientsRepository.getClientWithContacts(id));
    }

    @Override
    public List<ClientDto> getAll() {
        return toClientDto(clientsRepository.findAll());
    }

    private Client validateClientOrException(Long clientId) {
        return clientsRepository.findById(clientId).orElseThrow(() ->
                new NotFoundException("Client with id=" + clientId + " not found!"));
    }
}
