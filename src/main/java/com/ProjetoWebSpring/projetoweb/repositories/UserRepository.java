package com.ProjetoWebSpring.projetoweb.repositories;

import com.ProjetoWebSpring.projetoweb.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}
