package com.ecommerce.user_service.Repository;

import com.ecommerce.user_service.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    @Override
    Optional<User> findById(Long Id);

    @Override
    boolean existsById(Long along);

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);

}
