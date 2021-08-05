package com.hibernate.bean;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
@Entity
@Table(name="LOANTYPE")
public class LoanType {
	
	@Id
	@GeneratedValue()
	@Column(name = "ID")
	private int id;
	
	@Column(name="NAME", nullable=false)
	private String name;
	
	@Column(name="INTERESTRATE")
	private int interestRate;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="loantype_ID")
	private Set<GrantCondition> grantConditions = new HashSet<GrantCondition>(0);;
	
	
	
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
	
	
	public int getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	public Set<GrantCondition> getGrantConditions() {
		return grantConditions;
	}
	public void setGrantConditions(Set<GrantCondition> grantConditions) {
		this.grantConditions = grantConditions;
	}
	
	
	
	
	
	
	

}
