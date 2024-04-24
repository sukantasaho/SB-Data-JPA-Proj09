package com.main.services;

import java.util.List;
import com.main.entity.Employee_Date_Time;
 
 

public interface IDoctorService 
{
	 public String saveEmployee(Employee_Date_Time dateTime);
	 
	 public List<Employee_Date_Time> getAllEmployee();
	 public List<Integer> showEmployeeAgesByDesg(String desg);
}
