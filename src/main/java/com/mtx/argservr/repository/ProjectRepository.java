package com.mtx.argservr.repository;

import com.mtx.argservr.model.Project;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    boolean existsByTitle(String title);

    Optional<Project> findByTitle(String title);
}
