package org.insurance.guru;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate {
    private static final SessionFactory sessionFactory = createSessionFactory();
 
    private static SessionFactory createSessionFactory() {
      try {
        System.out.println("Initial SessionFactory creation...");
        return new Configuration().configure().buildSessionFactory();
      } catch (Throwable ex) {
      System.err.println("Initial SessionFactory creation has failed with exception: " + ex);
      throw new ExceptionInInitializerError(ex);
    }
	}

  public static SessionFactory getSessionFactory() {
    return sessionFactory;
  }
}