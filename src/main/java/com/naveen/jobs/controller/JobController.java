package com.naveen.jobs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.naveen.jobs.model.Job;
import com.naveen.jobs.service.JobService;

@Controller
public class JobController {

	@Autowired
	private JobService jobService;
	
	@RequestMapping(value = "employer/postJob", method = RequestMethod.GET)
	public String postJob(Model model) {
		return "jobInfo";
	}
	
	@RequestMapping(value = "employer/postJob", method = RequestMethod.POST)
	public String postJob(@ModelAttribute("job") Job job) {
		jobService.registerJob(job);
		return "redirect:/employer";
	}
}
