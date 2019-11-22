package com.ustglobal.jpawithhibernate1;



import java.sql.*;


import com.mysql.jdbc.Driver;

public class DynamicInsertQuery {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;


		try {

			// Step 1 Load the Driver
			Driver  driver = new Driver();
			DriverManager.deregisterDriver(driver);


			// Step 2 get the connection
			String url="jdbc:mysql://localhost:3306/ust_ty_db?"+"user=root&password=root";
			conn =DriverManager.getConnection(url);

			//Step 3 Issue Sql Query
			String sql="insert into employee_info values(?,?,?,?) ";
		
			pstmt = conn.prepareStatement(sql);
			
			String eid= args[0];
			int id=Integer.parseInt(eid);
			pstmt.setInt(1,  id);
			
			String name =args[1];
			pstmt.setString(2, name);
			
			String esal=args[2];
			int sal=Integer.parseInt(esal);
			pstmt.setInt(3,  sal);
			
			String gender =args[3];
			pstmt.setString(4, gender);
			
			int count=pstmt.executeUpdate();

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
				if(pstmt!=null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}

} //end of main()

		}// end of ExecuteInsertQuery

