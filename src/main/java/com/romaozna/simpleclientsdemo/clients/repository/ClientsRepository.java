package com.romaozna.simpleclientsdemo.clients.repository;

import com.romaozna.simpleclientsdemo.clients.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientsRepository extends JpaRepository<Client, Long> {
    @Query(value = " SELECT * FROM CLIENTS AS CL JOIN CONTACTS C on C.CLIENT_ID = CL.ID\n" +
            "WHERE CL.ID = ?1 ", nativeQuery = true)
    Client getClientWithContacts(Long id);
}
