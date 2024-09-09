package com.core.HibernateCore;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;



/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		SessionFactory sf = (SessionFactory) new Configuration()
				.configure("com/core/HibernateCore/hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		User u = new User(1, "Yogita", 879557412);
		session.save(u);
		tx.commit();
	}

}
