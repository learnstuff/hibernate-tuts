package com.msrm.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public final class HibernateUtil {

	private HibernateUtil() {
	}

	private static final Configuration cfg = new Configuration();
	private static SessionFactory sf;

	static {
		cfg.addClass(com.msrm.hibernate.domain.Event.class)
				.setProperty("connection.driver_class", "com.mysql.jdbc.Driver")
				.setProperty("connection.url", "jdbc:mysql://localhost:3306/hibernate_db")
				.setProperty("connection.username", "root").setProperty("connection.password", "root")
				.setProperty("connection.pool_size", "1")
				.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect")
				.setProperty("current_session_context_class", "thread")
				.setProperty("cache.provider_class", "org.hibernate.cache.internal.NoCacheProvider")
				.setProperty("show_sql", "true");
	}

	public static Session newSession() {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties())
				.build();
		sf = cfg.buildSessionFactory(registry);
		return sf.openSession();
	}

	public static void close() {
		if (sf != null) {
			sf.close();
		}
	}

}
