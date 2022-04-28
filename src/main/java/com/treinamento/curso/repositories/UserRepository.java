package com.treinamento.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamento.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {	

}
