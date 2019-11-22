package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.DriverManager;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mysql.jdbc.Driver;

public class EmpServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String empid=req.getParameter("empid");
		PrintWriter out=resp.getWriter();
		
		
		Connection conn=null;
		PreparedStatement pstmt =null;
		ResultSet rs=null; //ResultSet only Used In SELECT Query
		
		try {
			//Step1 Load the driver
		Driver driver=new Driver();
			DriverManager.deregisterDriver(driver);
			String url="jdbc:mysql://localhost:3306/ust_ty_db?"+"user=root&password=root";
			String sql= "select * from employee_info where id=?";
			conn=DriverManager.getConnection(url);
			
		
			pstmt=conn.prepareStatement(sql);
			
			int id=Integer.parseInt(empid);
			pstmt.setInt(1,  id);
			rs=pstmt.executeQuery();
			
			
			if(rs.next()) {
				int emp_id=rs.getInt("id");
				int sal=rs.getInt("sal");
				String name=rs.getString("name");
				String gender=rs.getString("gender");
				
				out.println("Id: "+id);
				out.println("Nmae: "+name);
			out.println("Salary: "+sal);
				out.println("Gender: "+gender);

             out.println("=================================");

				
			}
		}catch (SQLException e) {
			e.printStackTrace();
			}finally {
				try {
					if(rs!=null) {
						rs.close();
					}
					if(pstmt!=null) {
						pstmt.close();
					}
					if(conn!=null) {
						conn.close();
					}
					}catch (SQLException e) {
						e.printStackTrace();
				
					}

			}
		
	}// end of doGet
	}//end of EmpServlet