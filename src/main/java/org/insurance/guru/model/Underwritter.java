/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insurance.guru.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author user1
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="UNDERWRITTER")
public class Underwritter extends Member{
	
	public Underwritter(){}
	
	@OneToMany
	@JoinTable(name="UNDERWRITTER_REQUEST", joinColumns=@JoinColumn(name="UNDERWRITTER_ID"),
	inverseJoinColumns=@JoinColumn(name="REQUEST_NUMBER"))
	private Collection<Request> requestList= new ArrayList<Request>();

	public Collection<Request> getRequestList() {
		return requestList;
	}

	public void setRequestList(Collection<Request> requestList) {
		this.requestList = requestList;
	}
	
}
