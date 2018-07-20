package com.naveen.jobs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_JOB")
public class Job {
	
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_JOB")
    @SequenceGenerator(name="T_JOB",sequenceName="t_job_id", allocationSize=1)
    private Long id;
	
    @Column(name = "JOB_TITLE")
    private String jobTitle;
    
    @Column(name = "JOB_DESCRIPTION")
    private String jobDescription;
    
    @Column(name = "KEYWORDS")
    private String keyWords;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getKeyWords() {
		return keyWords;
	}

	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}
}