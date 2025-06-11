package com.husha.currencyexchangesystem.controller;

import com.husha.currencyexchangesystem.dto.AuthRequest;
import com.husha.currencyexchangesystem.dto.AuthResponse;
import com.husha.currencyexchangesystem.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request) {
        String token = authService.authenticate(request.getUsername(), request.getPassword());
        return ResponseEntity.ok(new AuthResponse(token, "bearer", 1800));
    }
}
