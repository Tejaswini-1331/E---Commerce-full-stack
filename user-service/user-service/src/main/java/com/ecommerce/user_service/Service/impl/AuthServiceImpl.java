package com.ecommerce.user_service.Service.impl;

import com.ecommerce.user_service.DTO.request.UserLoginRequest;
import com.ecommerce.user_service.DTO.request.UserRegisterRequest;
import com.ecommerce.user_service.DTO.response.AuthResponse;
import com.ecommerce.user_service.Entity.Role;
import com.ecommerce.user_service.Entity.User;
import com.ecommerce.user_service.Exception.DuplicateUserException;
import com.ecommerce.user_service.Repository.UserRepository;
import com.ecommerce.user_service.Service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    public AuthResponse register(UserRegisterRequest request){
        if(userRepository.existsByEmail(request.getEmail())){
           throw new DuplicateUserException("Email already exits");
        }
        User user = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(request.getPassword())
                .role(Role.CUSTOMER)
                .build();
        userRepository.save(user);

       // String token = new jwtUtil.ge
    }

    public AuthResponse login(UserLoginRequest request){

    }
}
