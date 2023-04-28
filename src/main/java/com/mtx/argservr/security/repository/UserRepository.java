package com.mtx.argservr.security.repository;

import com.mtx.argservr.security.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //boolean existsByEmail(String email);
    
    boolean existsByUsername(String username);

    //Optional<User> findByEmail(String email);
    
    Optional<User> findByUsername(String username);
}
