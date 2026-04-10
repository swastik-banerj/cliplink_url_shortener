package com.url.shortener.controllers;

import com.url.shortener.dto.LoginRequest;
import com.url.shortener.dto.RegisterRequest;
import com.url.shortener.services.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {

    private UserService userService;

    @PostMapping("/public/login")
    public ResponseEntity<?> loginUser(@Valid @RequestBody LoginRequest loginRequest){
        return ResponseEntity.ok(userService.loginUser(loginRequest));
    }

    @PostMapping("/public/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody RegisterRequest registerRequest){
        return ResponseEntity.ok(userService.registerUser(registerRequest));
    }
}
