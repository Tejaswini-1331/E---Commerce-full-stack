package com.ecommerce.user_service.Service;

import com.ecommerce.user_service.DTO.request.UpdateUserRequest;
import com.ecommerce.user_service.DTO.response.UserResponse;

public interface UserService {
    UserResponse getUserById(Long Id);
    UserResponse updateUserById(Long Id, UpdateUserRequest updateUserRequest);
    void deleteUser(Long id);

}
