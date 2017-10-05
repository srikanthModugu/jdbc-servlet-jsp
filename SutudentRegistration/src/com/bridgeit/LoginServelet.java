package com.bridgeit;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class LoginServelet
 */
@WebServlet("/LoginServelet")
public class LoginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   //  Database credentials
	  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServelet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 Connection conn = null;
		 
		 System.out.println("its connectionnnnn");
			PreparedStatement preparedStatemnt=null;
			System.out.println("haiiiii");
		   
		   String userName = request.getParameter("Uname");
		   String passWord = request.getParameter("passWord");
		   try{
		      //STEP 2: Register JDBC driver
			   Class.forName("com.mysql.jdbc.Driver");
		      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=bridgeit");
		      //STEP 3: Open a connection
		      System.out.println("Connecting to a selected database...");
		      String query = "SELECT * FROM studentDB.StudentRegistration";

		      // create the java statement
		      Statement st = (Statement) conn.createStatement();
		      
		      // execute the query, and get a java resultset
		      ResultSet rs = st.executeQuery(query);
		      System.out.println("Connected database successfully...");
		      System.out.println("values"+rs.next());
		      while (rs.next()) {
		    	 
		    	  System.out.println("haiiiiiii1234");
				  if(userName.equals(rs.getString("name"))){
					String id = rs.getString("id");
					System.out.println(id);
					if(passWord.equals(rs.getString("password"))){
						if(id.equals(rs.getString("id"))){
							System.out.println("loggied in sucesssss");
						    request.setAttribute("name",userName);
							RequestDispatcher requestDispatcher=request.getRequestDispatcher("Sucsses.jsp");
							requestDispatcher.forward(request, response);
						}
						else {
							System.out.println("opppssss after username");
						}
					}
				}
				else{
					System.out.println("ooppssss....!!");
				}
		      }
			System.out.println("Query Executed successfully.....");
			
		
		   }catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }finally{
			      //finally block used to close resources
			      try{
			         if(preparedStatemnt!=null)

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
			}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
