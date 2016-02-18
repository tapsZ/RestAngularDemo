/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insurance.guru.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


/**
 *
 * @author user1
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name = "POLICYHOLIDER")

@XmlRootElement
public class PolicyHolder extends Member{

	public PolicyHolder() {

	}
	@ElementCollection(fetch=FetchType.EAGER)
	@OneToMany
	@JoinTable(name = "POLICYHOLDER_REQUEST", joinColumns = @JoinColumn(name = "POLICYHOLDER_ID") , 
	inverseJoinColumns = @JoinColumn(name = "REQUEST_NUMBER") )
	private Collection<Request> requestList= new ArrayList<Request>();

	public Collection<Request> getRequestList() {
		return requestList;
	}

	public void setRequestList(Collection<Request> requestList) {
		this.requestList = requestList;
	}
	
	@ElementCollection(fetch=FetchType.EAGER)
	@OneToMany
	@JoinTable(name="POLICYHOLDER_ACCOUNT", joinColumns=@JoinColumn(name="POLICYHOLDER"),
				inverseJoinColumns=@JoinColumn(name="ACCOUNT_NUMBER"))
	
	private Collection<Account> accountList= new ArrayList<Account>();
	
		public Collection<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(Collection<Account> accountList) {
		this.accountList = accountList;
	}
	@ElementCollection(fetch=FetchType.EAGER)
		@OneToMany
		@JoinTable(name="POLICYHOLDER_CLAIM", joinColumns=@JoinColumn(name="POLICYHOLDER_ID"),
		inverseJoinColumns=@JoinColumn(name="CLAIM_NUMBER"))
		
		private Collection<Claim> claimList= new ArrayList<Claim>();

		public Collection<Claim> getClaimList() {
			return claimList;
		}

		public void setClaimList(Collection<Claim> claimList) {
			this.claimList = claimList;
		}

	
	
}
