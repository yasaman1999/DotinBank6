package com.hibernate.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="GRANTCONDITION")

public class GrantCondition {
	
	@Id
	@GeneratedValue()
    @Column(name = "ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="MINIMUMCONTRACTPERIOD")
	private String minimumContractPeriod;
	
	@Column(name="MAXIMUMCONTRACTPERIOD")
	private String maximumContractPeriod;
	
	@Column(name="MINIMUMCONTRACTAMOUNT")
	private String minimumContractAmount;
	
	@Column(name="MAXIMUMCONTRACTAMOUNT")
	private String maximumContractAmount;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private LoanType loanType;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMinimumContractPeriod() {
		return minimumContractPeriod;
	}
	public void setMinimumContractPeriod(String minimumContractPeriod) {
		this.minimumContractPeriod = minimumContractPeriod;
	}
	public String getMaximumContractPeriod() {
		return maximumContractPeriod;
	}
	public void setMaximumContractPeriod(String maximumContractPeriod) {
		this.maximumContractPeriod = maximumContractPeriod;
	}
	public String getMinimumContractAmount() {
		return minimumContractAmount;
	}
	public void setMinimumContractAmount(String minimumContractAmount) {
		this.minimumContractAmount = minimumContractAmount;
	}
	public String getMaximumContractAmount() {
		return maximumContractAmount;
	}
	public void setMaximumContractAmount(String maximumContractAmount) {
		this.maximumContractAmount = maximumContractAmount;
	}
	public LoanType getLoanType() {
		return loanType;
	}
	public void setLoanType(LoanType loanType) {
		this.loanType = loanType;
	}
	
	
	
	
	
	
	
	

}
