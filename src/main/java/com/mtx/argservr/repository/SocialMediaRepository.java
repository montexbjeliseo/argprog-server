package com.mtx.argservr.repository;

import com.mtx.argservr.model.SocialMedia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialMediaRepository extends JpaRepository<SocialMedia, Long> {

    boolean existsByName(String name);

    Optional<SocialMedia> findByName(String name);
}
