package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class MyFirstJDBCSelectDBWithProperties {

	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null; //ResultSet only Used In SELECT Query
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
		}catch (Exception e) {
			e.printStackTrace();
		}finally {


			// Step 5 to close all the jdbc objects
			try {
				if(conn!=null) {
					conn.close();


				}
				if(reader!=null) {
					reader.close();
				}if(rs!=null) {
					rs.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}//end of main()
}// end of my first jdbc

