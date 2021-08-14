package com.hibernate.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="LOANFILE")
public class LoanFile {
	
	@Id
	@GeneratedValue()
	@Column(name = "ID")
	private int id;
	
	@Column(name="CONTRACTPERIOD", nullable=false)
	private int contractPeriod;
	
	@Column(name="AMOUNTPERIOD", nullable=false)
	private int amountPeriod;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private LoanType loanType;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Customer customer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getContractPeriod() {
		return contractPeriod;
	}

	public void setContractPeriod(int contractPeriod) {
		this.contractPeriod = contractPeriod;
	}

	public int getAmountPeriod() {
		return amountPeriod;
	}

	public void setAmountPeriod(int amountPeriod) {
		this.amountPeriod = amountPeriod;
	}

	public LoanType getLoanType() {
		return loanType;
	}

	public void setLoanType(LoanType loanType) {
		this.loanType = loanType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

}
