package com.sandroarpi.bdsfinalwork.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sandroarpi.bdsfinalwork.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
