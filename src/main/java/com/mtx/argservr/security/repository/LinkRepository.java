package com.mtx.argservr.security.repository;

import com.mtx.argservr.model.Link;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author montexbjeliseo
 */
@Repository
public interface LinkRepository extends JpaRepository<Link, Long>{
    
}
