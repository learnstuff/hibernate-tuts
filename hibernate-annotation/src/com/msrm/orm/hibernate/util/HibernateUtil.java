package com.msrm.orm.hibernate.util;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	//@formatter:off
	public static Session openSession() {
		return new Configuration()
				.configure()
				.buildSessionFactory()
				.openSession();
	}

}
