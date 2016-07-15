package com.msrm.orm.hibernate.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.msrm.orm.hibernate.dao.PassengerDAO;
import com.msrm.orm.hibernate.dos.PassengerDO;

public class PassengerDAOImpl implements PassengerDAO {

	public void insert(PassengerDO passengerDO) {
		try (SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
				Session session = sf.openSession();) {
			session.beginTransaction();
			session.save(passengerDO);
			session.getTransaction().commit();
			System.out.println("Hibernate - saved");
		}
	}

	public void update(PassengerDO passengerDO) {

	}

	public void delete(int id) {

	}

	public PassengerDO fetchBy(int id) {
		return null;
	}

	public List<PassengerDO> fetch() {
		return null;
	}

}
