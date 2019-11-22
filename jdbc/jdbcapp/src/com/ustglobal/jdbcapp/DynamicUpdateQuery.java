package com.ustglobal.jdbcapp;

import java.sql.*;


import com.mysql.jdbc.Driver;

public class DynamicUpdateQuery {

	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;


		try {

			// Step 1 Load the Driver
			Driver  driver = new Driver();
			DriverManager.registerDriver(driver);


			// Step 2 get the connection
			String url="jdbc:mysql://localhost:3306/ust_ty_db?"+"user=root&password=root";
			conn =DriverManager.getConnection(url);

			//Step 3 Issue Sql Query
			String sql="update  employee_info set name=?, sal=?, gender=? where id=?" ;
			pstmt = conn.prepareStatement(sql);
			
			String empid=args[0];
			int id=Integer.parseInt(empid);
			
			String name=args[1];
			
			String empsal=args[2];
			int sal=Integer.parseInt(empsal);
			
			String gender =args[3];
			
			pstmt.setInt(4, id);
			pstmt.setString(1, name);
			pstmt.setInt(2, sal);
			pstmt.setString(3, gender);
			
			
			int count=pstmt.executeUpdate();

			//step4 Read The Result
			System.out.println(count + "Row(s) Updated");
			
		}catch(SQLException e) {
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

		}// end of Execute Dynamic Update Query



