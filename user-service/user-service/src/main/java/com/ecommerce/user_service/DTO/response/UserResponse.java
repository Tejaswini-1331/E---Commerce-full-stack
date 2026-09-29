package com.ecommerce.user_service.DTO.response;

import com.ecommerce.user_service.Entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// we can fetch all the details by using id from here
// further fetch from id is written in service class (only wanted info) service is connected to controller

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private String Name;
    private Long Id;
    private Role role;
    private String Email;

}
