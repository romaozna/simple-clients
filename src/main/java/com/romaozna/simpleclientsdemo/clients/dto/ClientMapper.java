package com.romaozna.simpleclientsdemo.clients.dto;

import com.romaozna.simpleclientsdemo.clients.model.Client;
import com.romaozna.simpleclientsdemo.contacts.model.Contact;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class ClientMapper {
    public static Client toClient(NewClientDto clientDto) {
        Client client = new Client();
        client.setName(clientDto.getName());
        client.setContacts(new HashSet<>());
        return client;
    }

    public static Client toClient(ClientDto clientDto, Set<Contact> contacts) {
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
                client.getContacts()
        );
    }

    public static List<ClientDto> toClientDto(List<Client> clients) {
        return clients.stream()
                .map(ClientMapper::toClientDto)
                .collect(Collectors.toList());
    }
}
