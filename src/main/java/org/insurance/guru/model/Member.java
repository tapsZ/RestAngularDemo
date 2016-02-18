/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insurance.guru.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author user1
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name = "MEMBER_DETAILS")
public class Member extends UserDetails {
	//can not have ID because its inheriting 
	@Column(name = "USER_NAME")
	private String username;
	@Column(name = "PASSWORD")
	private String password;
	@Column(name = "JOB_TITLE")
	private String jobTile;
	
		public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getJobTile() {
		return jobTile;
	}

	
	public void setJobTile(String jobTile) {
		this.jobTile = jobTile;
	}

	/*@ManyToOne
	private Administrator administrator;
	
	public Administrator getAdministrator() {
		return administrator;
	}

	public void setAdministrator(Administrator administrator) {
		this.administrator = administrator;
	}*/

	public Member(){
		super();
	}



}
