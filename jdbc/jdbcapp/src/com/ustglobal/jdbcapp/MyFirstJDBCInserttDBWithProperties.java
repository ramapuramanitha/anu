package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class MyFirstJDBCInserttDBWithProperties {

	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		FileReader reader=null;


		try {
			reader =new FileReader("db.properties");
			Properties prop=new Properties();
			prop.load(reader);


			// step 1 load the driver
			Class.forName("com.mysql.jdbc.Driver");


			//step  2  get the  connection
			String url= prop.getProperty("url");
			conn =DriverManager.getConnection(url,prop);
			
			// Step 3 Issue Sql Query
						String sql=prop.getProperty("select-query");
						stmt =conn.createStatement();
						int count=stmt.executeUpdate(sql);

			//step4 Read The Result
			System.out.println(count + "Row(s) Inserted");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//Step5 Close All the JDBC objects
		}
			try {
				if(conn!=null) {
					conn.close();
				}
				if(reader!=null) {
					reader.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}

} //end of main()

		}// end of ExecuteInsertQuery

