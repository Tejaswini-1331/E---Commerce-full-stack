package com.ecommerce.user_service.Service;

import com.ecommerce.user_service.DTO.request.UserLoginRequest;
import com.ecommerce.user_service.DTO.request.UserRegisterRequest;
import com.ecommerce.user_service.DTO.response.AuthResponse;
import com.ecommerce.user_service.Entity.User;

public interface AuthService {
   AuthResponse register(UserRegisterRequest request);
   AuthResponse login(UserLoginRequest request);
}
