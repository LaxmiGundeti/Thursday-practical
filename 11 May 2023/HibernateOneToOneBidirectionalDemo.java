package com.hibernateOneToOneBidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HibernateOneToOneBidirectionalDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("project has satrted");
	       Configuration cfg=new Configuration();
	       cfg.configure("hibernate.cfg.xml");
	       SessionFactory factory=cfg.buildSessionFactory();
	       
	       Employee1 e1=new Employee1();
	       e1.setEid(1);
	       e1.setEname("Laxmi");
	       e1.setDes("database devloper");
	       
	       Employee1 e2=new Employee1();
	       e2.setEid(2);
	       e2.setEname("Omkar");
	       e2.setDes("frontend devloper");
	       
	       Employee1 e3=new Employee1();
	       e3.setEid(3);
	       e3.setEname("Leena");
	       e3.setDes("backend devloper");
	       
	       
	       Project p1=new Project();
	       p1.setPid(301);
	       p1.setPname("Library_ManagementSystem");
	       p1.setEmp(e1);
	       

	       Project p2=new Project();
	       p2.setPid(302);
	       p2.setPname("Hospital_Managment");
	       p2.setEmp(e2);

	       Project p3=new Project();
	       p3.setPid(303);
	       p3.setPname("Poker_Game");
	       p3.setEmp(e3);
	       
	       e1.setPj(p1);
	       e2.setPj(p2);
	       e3.setPj(p3);
	       
	       Session s=factory.openSession();
	       Transaction tx=s.beginTransaction();
	       s.save(e1);
	       s.save(e2);
	       s.save(e3);
	       s.save(p1);
	       s.save(p2);
	       s.save(p3);
	       
	       tx.commit();
	       s.close();
	       factory.close();



	}


}
