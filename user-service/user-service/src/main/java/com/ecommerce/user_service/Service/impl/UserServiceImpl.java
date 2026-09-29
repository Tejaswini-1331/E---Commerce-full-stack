package com.ecommerce.user_service.Service.impl;

import com.ecommerce.user_service.DTO.request.UpdateUserRequest;
import com.ecommerce.user_service.DTO.response.UserResponse;
import com.ecommerce.user_service.Entity.User;
import com.ecommerce.user_service.Exception.UserNotFoundException;
import com.ecommerce.user_service.Mapper.UserMapper;
import com.ecommerce.user_service.Repository.UserRepository;
import com.ecommerce.user_service.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;


    public UserResponse getUserById(Long id){
       User user = userRepository.findById(id).orElseThrow(()->new UserNotFoundException("User not found with id: " + id));
       return userMapper.toResponse(user);
    }

    public UserResponse updateUserById(Long id, UpdateUserRequest updateUserRequest){
        User user = userRepository.findById(id).orElseThrow(()-> new UserNotFoundException("User not found"));

        if(updateUserRequest.getName()!=null){
            user.setName(updateUserRequest.getName());
        }

        if(updateUserRequest.getEmail()!=null){
            user.setEmail(updateUserRequest.getEmail());
        }

        userRepository.save(user);
        return userMapper.toResponse(user);
    }

    @Override
    public void deleteUser(Long id){
        if(!userRepository.existsById(id)){
            throw new UserNotFoundException("User not found");
        }
        userRepository.deleteById(id);
    }

}
