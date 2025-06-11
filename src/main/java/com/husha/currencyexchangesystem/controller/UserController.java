package com.husha.currencyexchangesystem.controller;

import com.husha.currencyexchangesystem.entity.User;
import com.husha.currencyexchangesystem.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{username}")
    public ResponseEntity<Optional<User>> getUser(@PathVariable String username) {
        return ResponseEntity.ok(userService.findUserByUsername(username));
    }
}
