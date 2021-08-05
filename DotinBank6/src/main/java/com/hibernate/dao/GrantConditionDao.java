package com.hibernate.dao;

import java.util.Iterator;
import java.util.Set;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.hibernate.bean.GrantCondition;
import com.hibernate.bean.LoanType;

public class GrantConditionDao {

	/*private static final Logger logger = LogManager.getLogger(GrantConditionDao.class);*/

	public void addGrantConditionDetails(Set<GrantCondition> grantConditionSet,String loanName,int interestRate) {
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
			logger.info("before new grantcondition");*/
			
			LoanType loanType = new LoanType();
			
			loanType.setName(loanName);
			loanType.setInterestRate(interestRate);
			session.save(loanType);
			
			for (Iterator<GrantCondition> it = grantConditionSet.iterator(); 
					it.hasNext(); ) {
				GrantCondition grantcondition = it.next();
				grantcondition.setLoanType(loanType);
				session.save(grantcondition);   
		    }
			loanType.setGrantConditions(grantConditionSet);
			session.update(loanType);
			
			transaction.commit();

		} catch (HibernateException e) {

			System.out.println(e.getMessage());

		}

	}
}
