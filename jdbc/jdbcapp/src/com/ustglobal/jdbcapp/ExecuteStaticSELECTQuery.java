package com.ustglobal.jdbcapp;

import java.sql.*;
import com.mysql.jdbc.Driver;

public class ExecuteStaticSELECTQuery {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null; //ResultSet only Used In SELECT Query
		try {



			// step 1 load the driver
			Driver  driver =new Driver();
			DriverManager.deregisterDriver(driver);



			//step  2  get the  connection
			String url= "jdbc:mysql://localhost:3306/ust_ty_db?"+"user=root&password=root";
			conn =DriverManager.getConnection(url,"root","root");
			
			// Step 3 Issue Sql Query
			stmt =conn.createStatement();
			String sql="select * from employee_info";
			rs=stmt.executeQuery(sql);
			
			
			// Step 4 Read The Result
			while(rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("name");
				int sal=rs.getInt("sal");
				String gender =rs.getString("gender");
				System.out.println("Id "+id);
				System.out.println("name "+name);
				System.out.println("sal "+sal);
				System.out.println("gender "+gender);
				System.out.println("***************************");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			
			// Step 5 to close all the jdbc objects
			try {
				if(conn!=null) {
					conn.close();
               }
				if(stmt!=null) {
					stmt.close();
				}if(rs!=null) {
					rs.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}//end of main()
}// end of my first jdbc
