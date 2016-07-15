package com.msrm.orm.hibernate.app;

import com.msrm.orm.hibernate.dao.PassengerDAO;
import com.msrm.orm.hibernate.dos.PassengerDO;

public class App {

	public static void main(String[] args) {
		PassengerDO passengerDO = new PassengerDO();
		passengerDO.setId(1);
		passengerDO.setName("surya");
		passengerDO.setMail("surya@gmail.com");
		passengerDO.setDob(new java.sql.Date(new java.util.Date().getTime()));

		PassengerDAO hibDAO = new com.msrm.orm.hibernate.dao.impl.PassengerDAOImpl();
		insert(passengerDO, hibDAO);
		System.out.println("Transaction Completed");

		// PassengerDAO jdbcDAO = new
		// com.msrm.orm.jdbc.dao.impl.PassengerDAOImpl();
		// insert(passengerDO, jdbcDAO);
		// System.out.println("Transaction Completed");

	}

	public static void insert(PassengerDO passengerDO, PassengerDAO dao) {
		dao.insert(passengerDO);
	}

}
