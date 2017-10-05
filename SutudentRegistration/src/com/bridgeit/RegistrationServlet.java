package com.bridgeit;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
            Connection conn = null;
			PreparedStatement preparedStatemnt=null;
			RegisterBean rd = (RegisterBean) request.getAttribute("bean");
			
		String id = rd.getStudentid();
		String name = rd.getStudentName();
		String password = rd.getPassword();
		String gender = rd.getGender();
		String department = rd.getDepartment();
		String emailId = rd.getEmailId();
		String address = rd.getAddress();
		String city = rd.getCity();
		String district = rd.getDistrict();
		String state = rd.getState();
	    String pincode = rd.getPincode();
	    String mobileNo = rd.getMobileNo();
	    String sql="insert into studentDB.StudentRegistration values(?,?,?,?,?,?,?,?,?,?,?,?)";
		
		 try{
		      //STEP 2: Register JDBC driver
			   Class.forName("com.mysql.jdbc.Driver");
		      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=bridgeit");
		      //STEP 3: Open a connection
		      System.out.println("Connecting to a selected database...");
		    
		      System.out.println("Connected database successfully...");
		      preparedStatemnt = conn.prepareStatement(sql);
		      preparedStatemnt.setString(1, id);
		      preparedStatemnt.setString(2, name);
		      preparedStatemnt.setString(3, password);
			  preparedStatemnt.setString(4, gender);
		      preparedStatemnt.setString(5, department);
		      preparedStatemnt.setString(6, emailId);
		      preparedStatemnt.setString(7, address);
		      preparedStatemnt.setString(8, city);
		      preparedStatemnt.setString(9, district);
		      preparedStatemnt.setString(10, state);
		      preparedStatemnt.setString(11, pincode);
		      preparedStatemnt.setString(12, mobileNo);
		   	  preparedStatemnt.execute();
    
			System.out.println("Query Executed successfully.....");
			response.getWriter().append("Registration sucessFull.... "+name+" the male or female to know...."+gender);
			//RequestDispatcher requestDispatcher=request.getRequestDispatcher("ResultView.jsp");
			//requestDispatcher.forward(request, response);
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
			   System.out.println("Goodbye!");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest hai hai hai hai hai hai  request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
