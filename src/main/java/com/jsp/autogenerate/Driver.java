package com.jsp.autogenerate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("abhisek");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		Car car = new Car();
		car.setName("Alto");
		car.setColor("Pink");

		transaction.begin();
		entityManager.persist(car);
		transaction.commit();

	}
}