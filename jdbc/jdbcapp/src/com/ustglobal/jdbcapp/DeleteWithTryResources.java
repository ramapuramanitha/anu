package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DeleteWithTryResources {

	public static void main(String[] args) {
		try (FileReader reader =new FileReader("db.properties"))
		{
			Properties prop=new Properties();
			prop.load(reader);

			Class.forName(prop.getProperty("driver-class-name"));
			String url= prop.getProperty("url");
			String sql= prop.getProperty("delete-query");
			try( Connection conn =DriverManager.getConnection(url,prop);
					PreparedStatement pstmt=conn.prepareStatement(sql)){

				String empid=args[0];
				pstmt.setInt(1, Integer.parseInt(args[0]));
				int count=pstmt.executeUpdate();
				//step4 Read The Result
				System.out.println(count + "Row(s) Deleted");

			}


		}catch (Exception e) {
			e.printStackTrace();

		}

	}
}






