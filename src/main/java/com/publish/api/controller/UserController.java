package com.publish.api.controller;
import com.publish.api.domain.model.User;
import com.publish.api.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController( UserService service) {
        this.service = service;
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById( id ));
    }
    @PostMapping
    public ResponseEntity<User> created(@RequestBody User user) {

        User userCreated = service.created( user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreated.getId())
                .toUri();

        return ResponseEntity.created(location).body(userCreated);
    }
}
