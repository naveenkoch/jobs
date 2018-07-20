package com.naveen.jobs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.naveen.jobs.model.Job;

public interface JobRepository extends JpaRepository<Job, Long>{

}
