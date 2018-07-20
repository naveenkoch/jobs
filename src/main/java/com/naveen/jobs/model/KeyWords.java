package com.naveen.jobs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_KEYWORDS")
public class KeyWords {
	
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_KEYWORDS")
    @SequenceGenerator(name="T_KEYWORDS",sequenceName="t_keywords_id", allocationSize=1)
    private Long id;
	
    @Column(name = "KEYWORDS")
    private String keyWord;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
    
}