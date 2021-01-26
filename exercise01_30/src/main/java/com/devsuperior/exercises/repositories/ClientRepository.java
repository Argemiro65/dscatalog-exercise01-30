package com.devsuperior.exercises.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.exercises.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
