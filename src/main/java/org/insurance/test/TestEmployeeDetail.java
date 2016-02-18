package org.insurance.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.insurance.guru.Hibernate;
import org.insurance.guru.model.Employee;

public class TestEmployeeDetail {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date startDate = null;

		Employee employee = new Employee();
		employee.setEmployeeID(100);
		employee.setFirstName("Babe");
		employee.setLastName("Ruth");
		employee.setPayType("S");
		employee.setPayRate(125700);
		startDate = sdf.parse("02/14/2013");
		employee.setStartDate(startDate);

		Employee employee1 = new Employee();
		employee1.setEmployeeID(101);
		employee1.setFirstName("Derek");
		employee1.setLastName("samaa");
		employee1.setPayType("S");
		employee1.setPayRate(53500);
		startDate = sdf.parse("04/08/2006");
		employee1.setStartDate(startDate);
		

		SessionFactory factory1 = Hibernate.getSessionFactory();
		Session session1 = factory1.openSession();
		session1.beginTransaction();
		session1.save(employee);
		session1.save(employee1);
		session1.getTransaction().commit();
		session1.close();

				
	}

}
