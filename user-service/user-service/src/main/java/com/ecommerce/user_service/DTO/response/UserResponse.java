package com.ecommerce.user_service.DTO.response;

import com.ecommerce.user_service.Entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private String Name;
    private Long Id;
    private Role role;
    private String Email;

}
