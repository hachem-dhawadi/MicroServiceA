package com.esprit.microservice.stagemicroservice.stagemicroservice.StageRepo;

import com.esprit.microservice.stagemicroservice.stagemicroservice.entity.Stage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StageRepo extends JpaRepository<Stage, Long> {
}
