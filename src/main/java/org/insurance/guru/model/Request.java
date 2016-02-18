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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user1
 */

@Entity
@Table(name = "REQUEST")
@NamedNativeQuery(name = "Request.all", query = "select * from REQUEST", resultClass = Request.class)
//@NamedQuery(name = "Request.byRequestNo", query = "from Request where requestNo=?")

@XmlRootElement
public class Request {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long requestNo;
	private String productType;
	private Date date;
	private String comment;
	private String status;
	

	public Long getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(long i) {
		this.requestNo = i;
	}
	
	
	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}


	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @param requestNo
	 * @param productType
	 * @param date
	 * @param comment
	 * @param status
	 */
	public Request(Long requestNo, String productType, String comment, String status) {
		super();
		this.requestNo = requestNo;
		this.productType = productType;
		this.comment = comment;
		this.status = status;
		this.date = new Date();
	}

	/*@ManyToOne
	private Underwritter underwritter;

	public Underwritter getUnderwritter() {
		return underwritter;
	}

	public void setUnderwritter(Underwritter underwritter) {
		this.underwritter = underwritter;
	}*/

	/**
	 * @param requestNo
	 * @param productType
	 * @param date
	 * @param comment
	 * @param status
	 */
	public Request(Long requestNo, String productType, Date date, String comment, String status) {
		super();
		this.requestNo = requestNo;
		this.productType = productType;
		this.date = date;
		this.comment = comment;
		this.status = status;
	}

	/*@ManyToOne
	private PolicyHolder policyholder;

	public PolicyHolder getPolicyholder() {
		return policyholder;
	}

	public void setPolicyholder(PolicyHolder policyholder) {
		this.policyholder = policyholder;
	}
*/
	public Request() {
		
	}

}
