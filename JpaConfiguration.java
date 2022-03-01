package com.mondee;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mysql.cj.xdevapi.SessionFactory;

@Configuration
public class JpaConfiguration {
	
	@Autowired
	private EntityManagerFactory emf;
	
	@Bean
	public SessionFactory sessionfactory()
	{
		return emf.unwrap(SessionFactory.class);
	}
	

}
