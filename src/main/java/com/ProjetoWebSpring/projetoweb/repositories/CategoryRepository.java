package com.ProjetoWebSpring.projetoweb.repositories;

import com.ProjetoWebSpring.projetoweb.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
