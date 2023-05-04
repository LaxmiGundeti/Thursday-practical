package com.library.librarymanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	
    	try
    	{
    		LibraryQuaries lquary=new LibraryQuaries();
    		CreateConnection obj=new CreateConnection(); 
    		Connection con=obj.createconnection();//connecting to database 
    		if(con.isClosed())
    		{
    			System.out.println("Connection is not establised");
    		}
    		else
    		{
    			System.out.println("Connection is establised");
 
    		}
    		
    		//Creating the book table
    		String q="create table Books(bid int primary key,bname varchar(50) not null,author varchar(50))";
    		Statement  stmt=con.createStatement();
    		stmt.executeUpdate(q);
    		System.out.println("The is created");
    		
    		//taking input from user to perform oprations
    		System.out.println("Enter which sql quary you want to perform:");
    		System.out.println("1.Insert");
    		System.out.println("2.Update");
    		System.out.println("3.delete");
    		System.out.println("4.View The Data");
    		System.out.println("Enter your choice:");
    		int no;
    		no=sc.nextInt();
    		switch (no) 
    		{
    		        case 1:lquary.insertq();//insertion operation
			              break;
		            case 2:lquary.updateq();//Update operation
			              break;
		            case 3:lquary.deleteq();//delete operation
			              break;
		            case 4:lquary.viewdata();//view the data available on table
			               break;
		            default:
			              System.out.println("wrong input!!!");
			              break;
	         }
    	     con.close();
		
		
        }
    	catch (Exception e) 
	    {
		    System.out.println(e);
	    }
   }
    
}

    		
    	

