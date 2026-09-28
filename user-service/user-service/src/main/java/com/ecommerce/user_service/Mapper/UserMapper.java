package com.ecommerce.user_service.Mapper;

import com.ecommerce.user_service.DTO.response.UserResponse;
import com.ecommerce.user_service.Entity.User;

public class UserMapper {
 public UserResponse toResponsee(User user){
     return new UserResponse(
             user.getEmail(),
             user.getId(),
             user.getRole(),
             user.getName()
     );
 }
}
