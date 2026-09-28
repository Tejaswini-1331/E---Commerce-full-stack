package com.ecommerce.user_service.DTO.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserRegisterRequest {

    @NotNull(message = "Name is required")
    private String name;

    @NotNull(message = "Name is required")
    @Email(message = "Email has to valid")
    private String email;

    @NotNull(message = "Name is required")
    @Size(min = 6,message = "password required")
    private String password;
}
