package com.ustglobal.jpawithhibernate1;



import java.sql.*;
import com.mysql.jdbc.Driver;

public class ExecuteStaticInsertQuery {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;


		try {

			// Step 1 Load the Driver
			Driver  driver = new Driver();
			DriverManager.deregisterDriver(driver);


			// Step 2 get the connection
			String url="jdbc:mysql://localhost:3306/ust_ty_db?"+"user=root&password=root";
			conn =DriverManager.getConnection(url);

			//Step 3 Issue Sql Query
			String sql="insert into employee_info " + "  values(45, 'sowmya', 14500,'M') ";
			stmt = conn.createStatement();
			int count=stmt.executeUpdate(sql);

			//step4 Read The Result
			System.out.println(count + "Row(s) Inserted");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			//Step5 Close All the JDBC objects
		}
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}

} //end of main()

		}// end of ExecuteInsertQuery
