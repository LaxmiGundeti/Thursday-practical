package com.library.librarymanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class LibraryQuaries 
{
	CreateConnection obj=new CreateConnection(); 
	Connection con=obj.createconnection();
	Scanner sc=new Scanner(System.in);
	public void insertq() throws SQLException  //method for adding the data
	{
		String q="insert into Books(bid,bname,author) values(?,?,?)";
		PreparedStatement psmt=con.prepareStatement(q);
		System.out.println("Enter Book Id:");
		int id= sc.nextInt();
		System.out.println("Enter Book Name:");
		String name=sc.next();
		System.out.println("Enter Author Name:");
		String author=sc.next();
		psmt.setInt(1,id);
		psmt.setString(2, name);
		psmt.setString(3, author);
		psmt.executeUpdate();
		System.out.println("Data inserted successfully");
		con.close();
	}
	public void updateq() throws SQLException    //method for updating data on table
	{
		String q="update Books set author=? where bid=?";
		PreparedStatement psmt=con.prepareStatement(q);
		System.out.println("Enter book Id to Update:");
		int id= sc.nextInt();
		System.out.println("Enter new author name:");
		String author=sc.next();
		psmt.setString(1, author);
		psmt.setInt(2, id);
		psmt.executeUpdate();
		System.out.println("Data updated successefully");
		con.close();
		
	}
	public void deleteq() throws SQLException    //method for deleting data from table
	{
		String q="delete from Books where bid=?";
		PreparedStatement psmt=con.prepareStatement(q);
		System.out.println("Enter book Id to Delete:");
		int id= sc.nextInt();
		psmt.setInt(1, id);
		psmt.executeUpdate();
		System.out.println("Data Deleted successefully");
		con.close();

    }
	public void viewdata() throws SQLException   //method to view data available on table
	{
		String q="select bid,bname,author from Books ";
		Statement stmt=con.createStatement();
		ResultSet set=stmt.executeQuery(q);
		while(set.next())
		{
			int id=set.getInt(1);
			String name=set.getString(2);
			String author=set.getString(3);
			System.out.println(id+"  "+name+"  "+author+"  ");
			
		}
		
		con.close();//closing database connection
	}
}
	
	

