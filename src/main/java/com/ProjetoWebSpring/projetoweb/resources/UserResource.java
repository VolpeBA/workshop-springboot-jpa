package com.ProjetoWebSpring.projetoweb.resources;

import com.ProjetoWebSpring.projetoweb.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Maria", "Maria@gmail.com", "12345675", "123123");
        return ResponseEntity.ok().body(user);
    }
}
