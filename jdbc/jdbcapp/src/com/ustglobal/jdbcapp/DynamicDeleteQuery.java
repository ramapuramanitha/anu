package com.ustglobal.jdbcapp;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DynamicDeleteQuery {

	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;


		try {

			// Step 1 Load the Driver
//			Driver  driver = new Driver();
//			DriverManager.registerDriver(driver);
			
			Class.forName("com.mysql.jdbc.Driver");// this also used we remove above 2 lines


			// Step 2 get the connection
			String url="jdbc:mysql://localhost:3306/ust_ty_db?"+"user=root&password=root";
			conn =DriverManager.getConnection(url);

			//Step 3 Issue Sql Query
			String sql="Delete from  employee_info where id=?" ;
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, Integer.parseInt(args[0]));
			
			int count=pstmt.executeUpdate();

			//step4 Read The Result
			System.out.println(count + "Row(s) Deleted");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//Step5 Close All the JDBC objects
		
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}//end of try-catch-finally block

} //end of main()

		}// end of Execute Dynamic Delete Query




