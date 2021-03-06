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
@Table(name = "CUSTOMERREP")
public class CustomerRep extends Member{
	public CustomerRep(){}
	
	@OneToMany
	@JoinTable(name="CUSTOMERREP", joinColumns=@JoinColumn(name="CUSTOMERREP_ID"),
	inverseJoinColumns=@JoinColumn(name="ACCOUNT_NUMBER"))
	
	private Collection<Account> accountList= new ArrayList<Account>();
	

		public Collection<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(Collection<Account> accountList) {
		this.accountList = accountList;
	}

	
}
