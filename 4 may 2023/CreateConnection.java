package com.library.librarymanagement;

import java.sql.Connection;
import java.sql.DriverManager;


public class CreateConnection  {
	public Connection createconnection()
	{
		String url="jdbc:mysql://localhost:3306/school";
    	String user="root";
    	String password="1234";
    	try
    	{
    		Connection con=DriverManager.getConnection(url, user, password);
    		return con;
   		
    	}
    	catch (Exception e) 
    	{
			System.out.println(e);
			return null;
		}
	}

}


