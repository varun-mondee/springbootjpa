package com.mondee;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class EmployeeDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void insrt(Employee e1) {
		Session s= sessionFactory.openSession();
		org.hibernate.Transaction tx  = s.beginTransaction();
		s.save(e1);
		tx.commit();
	}
}
