package com.ecommerce.user_service.Mapper;

import com.ecommerce.user_service.DTO.response.UserResponse;
import com.ecommerce.user_service.Entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
 public UserResponse toResponse(User user){
     return new UserResponse(
             user.getEmail(),
             user.getId(),
             user.getRole(),
             user.getName()
     );
 }
}
