package com.ustglobal.empapp;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeManager;

public class App {
	public static void main(String[] args) {
		System.out.println("Press 1 to get all employee data");
		System.out.println("Press 2 to insert employee data");
		System.out.println("Press 3 to get update employee data");
		System.out.println("Press 4 to delete employee data");
		System.out.println("Press 5 to search single  employee data");
		
		Scanner scn=new Scanner(System.in);
		int ch=scn.nextInt();

		switch (ch) {
		case 1:
			EmployeeDAO dao=EmployeeManager.getEmployeeDAO();
		List<EmployeeBean>	result = dao.getAllEmployeeData();
		
		for(EmployeeBean bean:result) {
			System.out.println("Id: "+bean.getId());
			System.out.println("Name: "+bean.getName());
			System.out.println("Gender: "+bean.getGender());
			System.out.println("Sal: "+bean.getSal());
			
		}

			break;
		case 2:
			break;
		case 3:
//			EmployeeDAO dao3=EmployeeManager.getEmployeeDAO();
//			int id=scn.nextInt();
//			String name=scn.hasNextLine();
//			String gender=scn.nextLine();
//			EmployeeBean bean1=new EmployeeBean();
//			bean1.setId(id);
//			bean1.setName(name);
//			bean1.setSal(sal);
//			bean1.setGender(gender);
//			int count1=dao3.updateEmployeeData(bean1);
//			System.out.println("rows deleted"+count1);
			break;
		case 4:
			EmployeeDAO dao4=EmployeeManager.getEmployeeDAO();
			int id4=scn.nextInt();
			int count1=dao4.deleteEmployeeData(id4);
			System.out.println("rows deleted"+count1);

			
			
			break;
		case 5:
			EmployeeDAO dao5=EmployeeManager.getEmployeeDAO();
			int id=scn.nextInt();
			EmployeeBean bean=dao5.searchEmployeeData(id);
			if(bean!=null) {
				System.out.println("Id: "+bean.getId());
				System.out.println("Name: "+bean.getName());
				System.out.println("Sal: "+bean.getSal());
				System.out.println("Gender: "+bean.getGender());
			}else {
				System.out.println("No Data Found");
			}
			break;

		}//end of switch
	}//end of main()
}//end of app







