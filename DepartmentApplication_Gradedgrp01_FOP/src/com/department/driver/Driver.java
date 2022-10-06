package com.department.driver;

import com.department.admin.Admin_Department;
import com.department.hr.Hr_Department;
import com.department.tech.Tech_Department;

public class Driver {
	
		public static void main(String[] args) {
				
				Admin_Department admin = new Admin_Department();
				System.out.println("\n"+admin.departmentName());
				System.out.println(admin.getTodaysWork());
				System.out.println(admin.getWorkDeadline());
				System.out.println(admin.isTodayAHoliday()+"\n");
				
				Hr_Department hr = new Hr_Department();
				System.out.println(hr.departmentName());
				System.out.println(hr.doActivity());
				System.out.println(hr.getTodaysWork());
				System.out.println(hr.getWorkDeadline());
				System.out.println(hr.isTodayAHoliday()+"\n");
				
				Tech_Department tech = new Tech_Department();
				System.out.println(tech.departmentName());
				System.out.println(tech.getTodaysWork());
				System.out.println(tech.getWorkDeadline());
				System.out.println(tech.doActivity());
				System.out.println(tech.isTodayAHoliday()+"\n");
				
				
				
			}

}
