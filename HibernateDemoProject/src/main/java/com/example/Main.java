package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student(1, "Gfg", 23);
		
		Configuration cfg = new Configuration();
		
		SessionFactory sf = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction();
		
		session.save(s);
		
		t.commit();
		
		System.out.println("Student Saved Successfully");
		session.close();
		
		
	}

}
