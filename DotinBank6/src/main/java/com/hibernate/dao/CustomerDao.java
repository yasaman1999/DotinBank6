package com.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.cfg.Configuration;

import com.hibernate.bean.Customer;

public class CustomerDao {
	/*
	 * private static final Logger logger = LogManager.getLogger(CustomerDao.class);
	 */

	public void addCustomerDetails(String name, String family, String fatherName, boolean gender, String birthday,
			String nationalCode, String placeOfBirth, String address, String mobileNumber, String phoneNumber) {
		try {
			// 1. configuring hibernate
			Configuration configuration = new Configuration().configure();

			// 2. create sessionfactory
			SessionFactory sessionFactory = configuration.buildSessionFactory();

			// 3. Get Session object
			Session session = sessionFactory.openSession();

			// 4. Starting Transaction
			Transaction transaction = session.beginTransaction();
			/*
			 * BasicConfigurator.configure(); logger.info("before new customer");
			 */
			Customer customer = new Customer();
			customer.setName(name);
			customer.setFamily(family);
			customer.setFatherName(fatherName);
			customer.setGender(gender);
			customer.setBirthday(birthday);
			customer.setNationalCode(nationalCode);
			customer.setPlaceOfBirth(placeOfBirth);
			customer.setAddress(address);
			customer.setMobileNumber(mobileNumber);
			customer.setPhoneNumber(phoneNumber);

			String SQL_QUERY = "select max(customerNumber)from Customer customer";
			Query query = session.createQuery(SQL_QUERY);
			List list = query.list();
			int customerNumber = (Integer) list.get(0) + 1;
			customer.setCustomerNumber(customerNumber);
			/* logger.info("before save"); */
			session.save(customer);
			transaction.commit();
			/* logger.info("\n\n new customer created \n"); */

		} catch (HibernateException e) {

			System.out.println(e.getMessage());

		}

	}

}
