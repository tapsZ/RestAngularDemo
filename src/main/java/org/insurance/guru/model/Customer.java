/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insurance.guru.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author user1
 */
@Entity
@Table(name = "CUSTOMER_DETAILS")
public class Customer extends UserDetails{
	//can not have ID because its inheriting 
	@Column(name = "CUSTOMER_NUMBER")
	private int customerNo;
	
	@OneToMany
	@JoinTable(name="CUSTOMER_REQUEST", joinColumns=@JoinColumn(name="CUSTOMER_ID"),
	inverseJoinColumns=@JoinColumn(name="REQUEST_NUMBER"))
	private Collection<Request> requestList= new ArrayList<Request>();

	public Collection<Request> getRequestList() {
		return requestList;
	}

	public void setRequestList(Collection<Request> requestList) {
		this.requestList = requestList;
	}
	

	
	public Customer(){
		
	}

}
