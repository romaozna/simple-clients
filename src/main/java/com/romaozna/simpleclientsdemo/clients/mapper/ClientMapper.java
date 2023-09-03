package com.romaozna.simpleclientsdemo.clients.mapper;

import com.romaozna.simpleclientsdemo.clients.dto.ClientDto;
import com.romaozna.simpleclientsdemo.clients.dto.FullClientDto;
import com.romaozna.simpleclientsdemo.clients.dto.NewClientDto;
import com.romaozna.simpleclientsdemo.clients.model.Client;
import com.romaozna.simpleclientsdemo.contacts.mapper.ContactMapper;
import com.romaozna.simpleclientsdemo.contacts.model.Contact;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ClientMapper {
    public static Client toClient(NewClientDto clientDto) {
        Client client = new Client();
        client.setName(clientDto.getName());
        client.setContacts(new ArrayList<>());
        return client;
    }

    public static Client toClient(ClientDto clientDto, List<Contact> contacts) {
        return new Client(
                clientDto.getId(),
                clientDto.getName(),
                contacts

        );
    }

    public static ClientDto toClientDto(Client client) {
        return new ClientDto(
                client.getId(),
                client.getName()
        );
    }

    public static FullClientDto toFullClientDto(Client client) {
        return new FullClientDto(
                client.getId(),
                client.getName(),
                ContactMapper.toContactDto(client.getContacts())
        );
    }

    public static List<ClientDto> toClientDto(List<Client> clients) {
        return clients.stream()
                .map(ClientMapper::toClientDto)
                .collect(Collectors.toList());
    }
}
