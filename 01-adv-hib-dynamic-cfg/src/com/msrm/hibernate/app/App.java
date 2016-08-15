package com.msrm.hibernate.app;

import java.util.Date;

import org.hibernate.Session;

import com.msrm.hibernate.domain.Event;
import com.msrm.hibernate.util.HibernateUtil;

public class App {

	public static void main(String[] args) {
		Session session = null;
		try {
			session = HibernateUtil.newSession();
			session.beginTransaction();

			Event e = new Event();
			e.setTitle("My Hibernate Tutorial Class");
			e.setDate(new Date());

			session.save(e);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				HibernateUtil.close();
			}
		}
	}

}
