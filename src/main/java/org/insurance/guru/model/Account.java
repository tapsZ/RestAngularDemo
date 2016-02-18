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
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user1
 */

@Entity
@Table(name = "ACCOUNT")
@NamedNativeQuery(name = "Account.all", query = "select * from ACCOUNT", resultClass = Account.class)
//@NamedQuery(name = "Account.byAccountNo", query = "from Account where accountNo=?")

@XmlRootElement(name = "account")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Account_No;
	private Date date;
	private int debit;
	private int credit;
	private int balance;
	private String description;

	@XmlElement
	public int getDebit() {
		return debit;
	}

	public void setDebit(int debit) {
		this.debit = debit;
	}

	@XmlElement
	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	@XmlElement
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
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

	@ManyToOne
	@XmlElement
	private CustomerRep customerrep;

	public CustomerRep getCustomerrep() {
		return customerrep;
	}

	public void setCustomerrep(CustomerRep customerrep) {
		this.customerrep = customerrep;
	}

	public int getAccount_No() {
		return Account_No;
	}

	public void setAccount_No(int account_No) {
		Account_No = account_No;
	}

	@ManyToOne
	@XmlElement
	private PolicyHolder policyholder;

	public PolicyHolder getPolicyholder() {
		return policyholder;
	}

	public void setPolicyholder(PolicyHolder policyholder) {
		this.policyholder = policyholder;
	}

}
