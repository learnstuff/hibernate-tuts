package com.msrm.hibernate.app;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.msrm.hibernate.domain.Event;

public class App {

	public static void main(String[] args) {
		SessionFactory sf = null;
		Session session = null;

		try {
			// loading hibernate.cfg.xml file to JVM
			Configuration config = new Configuration().configure();

			// extracting the settings and forming ServiceRegistry
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
					.applySettings(config.getProperties()).build();

			// creating SessionFactory object
			sf = config.buildSessionFactory(registry);

			session = sf.openSession();
			session.beginTransaction();

			Event e = new Event();
			e.setTitle("My Graduation");
			e.setDate(new Date());

			session.save(e);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
			if (sf != null) {
				sf.close();
			}
		}
	}

}
