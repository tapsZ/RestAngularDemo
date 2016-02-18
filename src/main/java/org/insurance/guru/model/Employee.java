package org.insurance.guru.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
 
@Entity
@Table(name="EMPLOYEE_DETAILS")
@XmlRootElement
@NamedNativeQuery(name = "Employee.all", query = "select * from EMPLOYEE_DETAILS", resultClass = Request.class)
public class Employee {
  @Id
  @Column(name="employee_id")
  private int employeeID;
 
  @Column(name="first_name")
  private String firstName;
 
  @Column(name="last_name")
  private String lastName;
 
  @Column(name="pay_type")
  private String payType;
 
  @Column(name="pay_rate")
  private double payRate;
 
  @Column(name="start_date")
  private Date startDate;
 
  @Column(name="end_date")
  private Date endDate;
 
  public int getEmployeeID() {
    return employeeID;
  }
 
  public void setEmployeeID(int employeeID) {
    this.employeeID = employeeID;
  }
 
  public String getFirstName() {
    return firstName;
  }
 
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
 
  public String getLastName() {
    return lastName;
  }
 
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
 
  public String getPayType() {
    return payType;
  }
 
  public void setPayType(String payType) {
    this.payType = payType;
  }
 
  public double getPayRate() {
    return payRate;
  }
 
  public void setPayRate(double payRate) {
    this.payRate = payRate;
  }
 
  public Date getStartDate() {
    return startDate;
  }
 
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }
 
  public Date getEndDate() {
    return endDate;
  }
 
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

public Employee() {
	
}

public Employee(int employeeID, String firstName, String lastName, String payType) {
	this.employeeID = employeeID;
	this.firstName = firstName;
	this.lastName = lastName;
	this.payType = payType;
}

  
}