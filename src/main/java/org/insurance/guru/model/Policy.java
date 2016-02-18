/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insurance.guru.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author user1
 */
@Entity
public class Policy {
    @Id 
    private int policyNo;
    private String premiumCost;
    private String type;
    private String description;
    private String customerRepNo;

    public int getProductNo() {
        return policyNo;
    }

    public String getPremiumCost() {
        return premiumCost;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String getCustomerRepNo() {
        return customerRepNo;
    }

    public void setProductNo(int productNo) {
        this.policyNo = productNo;
    }

    public void setPremiumCost(String premiumCost) {
        this.premiumCost = premiumCost;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCustomerRepNo(String customerRepNo) {
        this.customerRepNo = customerRepNo;
    }
    
}
