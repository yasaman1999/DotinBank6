package com.hibernate.dao;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.hibernate.bean.LoanType;

public class LoanTypeDao {
	
	

	public void addLoanTypeDetails(String name, int interestRate) {
		try {
			// 1. configuring hibernate
			Configuration configuration = new Configuration().configure();

			// 2. create sessionfactory
			SessionFactory sessionFactory = configuration.buildSessionFactory();

			// 3. Get Session object
			Session session = sessionFactory.openSession();

			// 4. Starting Transaction
			Transaction transaction = session.beginTransaction();  
			LoanType loanType = new LoanType();
			loanType.setName(name);
			loanType.setInterestRate(interestRate);
			transaction.commit();
			

		} catch (HibernateException e) {
			
			System.out.println(e.getMessage());
			
		}

	}

}
