package com.ecommerce.user_service.Exception;

import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.ExceptionHandler;

@NoArgsConstructor
public class DuplicateUserException extends RuntimeException{

    public DuplicateUserException(String message){
        super(message);
    }
}
