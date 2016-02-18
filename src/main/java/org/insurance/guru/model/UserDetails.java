/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insurance.guru.model;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import java.util.Iterator;  

/**
 *
 * @author user1
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name = "USER_DETAILS")
public class UserDetails {

	@Id
	@Column(name = "NATIONAL_ID")
	private String idNo;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "SURNAME")
	private String surname;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "MOBILE_NUMBER")
	private String mobileNo;

	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name = "ADDRESS", joinColumns=@JoinColumn(name="NATIONAL_ID"))
	
	@GenericGenerator(name="sequence-gen",strategy="sequence")
	@CollectionId(columns = { @Column(name="ADDRESS_NO") }, generator = "sequence-gen", type = @Type(type="long") )
	
	private Collection<Address> listOfAddresses = new ArrayList<Address>();

	public Collection<Address> getListOfAddresses() {
		return listOfAddresses;
	}

	public void setListOfAddresses(Collection<Address> listOfAddresses) {
		this.listOfAddresses = listOfAddresses;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public UserDetails() {

	}
	
	public void displayInfo(){  
	    System.out.println(idNo+" "+ firstName);  
	    System.out.println("Your address is:");  
	    Iterator<Address> itr=listOfAddresses.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());
	    }
}
}