package com.romaozna.simpleclientsdemo.clients.repository;

import com.romaozna.simpleclientsdemo.clients.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientsRepository extends JpaRepository<Client, Long> {
}
