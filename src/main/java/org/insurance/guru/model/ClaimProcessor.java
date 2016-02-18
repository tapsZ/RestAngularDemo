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
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author user1
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name = "CLAIMPROCESSOR")
public class ClaimProcessor extends Member{
	public ClaimProcessor() {
	}

	@OneToMany
	@JoinTable(name="CLAIMPROCESSOR_REQUEST", joinColumns=@JoinColumn(name="CLAIMPROCESSOR_ID"),
	inverseJoinColumns=@JoinColumn(name="CLAIM_NUMBER"))
	
private Collection<Claim> claimList= new ArrayList<Claim>();

public Collection<Claim> getClaimList() {
		return claimList;
	}

	public void setClaimList(Collection<Claim> claimList) {
		this.claimList = claimList;
	}
	
	
}
