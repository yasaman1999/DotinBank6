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
	
	

	public void addLoanTypeDetails(String name, String interestRate) {
		try {
			// 1. configuring hibernate
			Configuration configuration = new Configuration().configure();

			// 2. create sessionfactory
			SessionFactory sessionFactory = configuration.buildSessionFactory();

			// 3. Get Session object
			Session session = sessionFactory.openSession();

			// 4. Starting Transaction
			Transaction transaction = session.beginTransaction();  
			System.out.println("before new loantype");
			LoanType loanType = new LoanType();
			loanType.setName(name);
			loanType.setInterestRate(interestRate);
			System.out.println("before save");
			session.save(loanType);
			transaction.commit();
			System.out.println("\n\n new loantype created \n");

		} catch (HibernateException e) {
			
			System.out.println(e.getMessage());
			
		}

	}

}