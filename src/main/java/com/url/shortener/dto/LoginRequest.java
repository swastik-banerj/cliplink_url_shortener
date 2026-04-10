package com.url.shortener.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {

    @NotBlank
    private String username;
    private String password;
}
