package com.ustglobal.jdbcapp;

import java.sql.*;


import com.mysql.jdbc.Driver;
public class DynamicSelectQuery {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/ust_ty_db?"+"user=root&password=root";
		String sql= "select * from employee_info where id=?";
		
		Connection conn=null;
		PreparedStatement pstmt =null;
		ResultSet rs=null; //ResultSet only Used In SELECT Query
		
		try {
			//Step1 Load the driver
		Driver driver =new Driver();
		DriverManager.deregisterDriver(driver);
			//Class.forName("com.mysql.jdbc.Driver");// this also used we remove above 2 lines

			
			//Step2 Get the connection
			conn=DriverManager.getConnection(url);
			
			
			//Step3 Issue Sql Query
			pstmt=conn.prepareStatement(sql);
			String empid=args[0];
			int id=Integer.parseInt(empid);
			pstmt.setInt(1,  id);
			
			rs=pstmt.executeQuery();
			
			
			//Step4 Read the Result
			if(rs.next()) {
				int emp_id=rs.getInt("id");
				int sal=rs.getInt("sal");
				String name=rs.getString("name");
				String gender=rs.getString("gender");
				
				System.out.println("Id: "+id);
				System.out.println("Nmae: "+name);
				System.out.println("Salary: "+sal);
				System.out.println("Gender: "+gender);
				System.out.println("=================================");

				
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
			}//end of try-catch-finally
				}//end of main
}//end od DynamicSelect Query
