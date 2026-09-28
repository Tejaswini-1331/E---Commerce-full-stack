package com.ecommerce.user_service.DTO.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserLoginRequest {
    @NotNull
    @Email
    private String email;

    @NotNull
    private String password;

}
