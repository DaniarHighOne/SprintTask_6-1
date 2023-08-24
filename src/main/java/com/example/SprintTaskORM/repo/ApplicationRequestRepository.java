package com.example.SprintTaskORM.repo;

import com.example.SprintTaskORM.models.ApplicationRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRequestRepository extends JpaRepository<ApplicationRequest,Long> {

}
