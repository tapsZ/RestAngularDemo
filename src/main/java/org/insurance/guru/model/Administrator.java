/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insurance.guru.model;

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
@Table(name="ADMINISTRATOR")
public class Administrator extends Member {

	public Administrator(){}
	
		
	/*@OneToMany
	@JoinTable(joinColumns=@JoinColumn(name="ID_NUMBER"))
	private Collection<Member> member;

	public Collection<Member> getMember() {
		return member;
	}

	public void setMember(Collection<Member> member) {
		this.member = member;
	}*/
	

}
