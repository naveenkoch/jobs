package com.naveen.jobs.service;

import org.springframework.stereotype.Service;

import com.naveen.jobs.model.Job;

@Service
public interface JobService {
	void registerJob(Job job);
}
