/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insurance.guru.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user1
 */
@Entity
//@NamedNativeQuery(name = "Claim.all", query = "select * from CLAIM", resultClass = Claim.class)
//@NamedQuery(name = "Claim.byClaimNo", query = "from Claim where claimNo=?")
@Table(name = "CLAIM")
@XmlRootElement(name = "claim")
public class Claim {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int claimNo;
	private String evidence;
	private Date date;
	private String description;

	private String status;

	@XmlElement
	public String getEvidence() {
		return evidence;
	}

	public void setEvidence(String evidence) {
		this.evidence = evidence;
	}

	@XmlElement
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@XmlElement
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
@XmlElement
	public String getStatus() {
		return status;
	}

	@ManyToOne
	private ClaimProcessor claimprocessor;

	public ClaimProcessor getClaimprocessor() {
		return claimprocessor;
	}

	public void setClaimprocessor(ClaimProcessor claimprocessor) {
		this.claimprocessor = claimprocessor;
	}

	@ManyToOne
	private PolicyHolder policyholder;

	public PolicyHolder getPolicyholder() {
		return policyholder;
	}

	public void setPolicyholder(PolicyHolder policyholder) {
		this.policyholder = policyholder;
	}

}
