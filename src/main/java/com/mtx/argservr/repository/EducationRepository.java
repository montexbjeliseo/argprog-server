package com.mtx.argservr.repository;

import com.mtx.argservr.model.Education;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends JpaRepository<Education, Long> {

    boolean existsByTitle(String title);

    Optional<Education> findByTitle(String name);
}
