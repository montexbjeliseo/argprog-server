package com.mtx.argservr.repository;

import com.mtx.argservr.model.Experience;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long> {

    boolean existsByTitle(String title);

    Optional<Experience> findByTitle(String title);
}
