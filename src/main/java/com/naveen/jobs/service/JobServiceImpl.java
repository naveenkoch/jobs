package com.naveen.jobs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naveen.jobs.model.Job;
import com.naveen.jobs.repository.JobRepository;

@Service
public class JobServiceImpl implements JobService{

	@Autowired
	private JobRepository jobRepository;
	
	@Override
	public void registerJob(Job job) {
		jobRepository.save(job);
	}

}
