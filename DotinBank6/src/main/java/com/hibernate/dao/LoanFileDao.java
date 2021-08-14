package com.hibernate.dao;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.bean.Customer;
import com.hibernate.bean.LoanFile;
import com.hibernate.bean.LoanType;



public class LoanFileDao {
	
	public void addLoanFileDetails(int contractPeriod,int amount,LoanType loanType,Customer customer) {
		try {
			// 1. configuring hibernate
			Configuration configuration = new Configuration().configure();

			// 2. create sessionfactory
			SessionFactory sessionFactory = configuration.buildSessionFactory();

			// 3. Get Session object
			Session session = sessionFactory.openSession();

			// 4. Starting Transaction
			Transaction transaction = session.beginTransaction();
			/*BasicConfigurator.configure();
			logger.info("before new loanFile");*/
			
			LoanFile loanFile = new LoanFile();
			loanFile.setContractPeriod(contractPeriod);
			loanFile.setAmountPeriod(amount);
			loanFile.setCustomer(customer);
			loanFile.setLoanType(loanType);
			session.save(loanFile);
			
			
		

		} catch (HibernateException e) {

			System.out.println(e.getMessage());

		}

	}

}
