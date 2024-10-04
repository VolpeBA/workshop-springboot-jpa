package com.ProjetoWebSpring.projetoweb.repositories;

import com.ProjetoWebSpring.projetoweb.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
