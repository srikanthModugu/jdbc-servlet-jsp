package com.BridgeLabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddingDataToDB {
	
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/FisrtApp";
       
	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "bridgeit";
       private static Statement stmt;
	   
       public static void addData(String fname,String lname,int age) {
	
	   Connection conn = null;
	   stmt = null;
	   try{
		   
	      //STEP 2: Register JDBC driver
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to a selected database...");
	      conn = DriverManager.getConnection(DB_URL, USER, PASS);
	      System.out.println("Connected database successfully...");
	      
	      //STEP 4: Execute a query
	      System.out.println("Creating statement...");
	      String sql = "insert into FristAppData values('2','srika','mogu','28')";
	     // String sql = ("insert into FristAppData values('"+2+"','"+fname+"','"+lname+"','"+age+"')");
	    	      // create the mysql insert preparedstatement
	    	  stmt.execute(sql);
	    System.out.println("entered data....");
	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
	      try{
	         if(stmt!=null)

	            conn.close();
	      }catch(SQLException se){
	      }// do nothing
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }//end finally try
	   }//end try
	   System.out.println("Goodbye!");
	}
}
