package com.mondee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringHibernateLogic implements CommandLineRunner {

	@Autowired
	private EmployeeDao dao;
	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateLogic.class, args);
	}
	
	public void run(String... args) throws Exception {
		Employee ep = new Employee();
		ep.setName("varun");
		ep.setSalary(34000);
		dao.insrt(ep);
	}

}
