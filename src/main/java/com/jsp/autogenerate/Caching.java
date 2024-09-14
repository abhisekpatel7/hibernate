package com.jsp.autogenerate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Caching {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("abhisek");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Car c = entityManager.find(Car.class, 1);
		c.getColor();
		
		Car c1 = entityManager.find(Car.class, 1);
		System.out.println(c1.getName());
		
		EntityManager entityManager1 = entityManagerFactory.createEntityManager();
		
		Car c2 = entityManager1.find(Car.class, 1);
		System.out.println(c2.getName());
		
	}
	
}