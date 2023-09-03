package com.romaozna.simpleclientsdemo.clients.repository;

import com.romaozna.simpleclientsdemo.clients.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientsRepository extends JpaRepository<Client, Long> {
    @Query(" select c from Client c join Contact ct on ct.id = c.id " +
            "where c.id = ?1 ")
    Client getClientWithContacts(Long id);
}
