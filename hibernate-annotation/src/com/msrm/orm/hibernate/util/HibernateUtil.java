package com.msrm.orm.hibernate.util;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.msrm.orm.hibernate.dos.PassengerDO;

public class HibernateUtil {

	//@formatter:off
	public static Session openSession() {
		return new Configuration()
				.addPackage("com.msrm.orm.hibernate.dos")
				.addAnnotatedClass(PassengerDO.class)
				.configure()
				.buildSessionFactory()
				.openSession();
	}

}
