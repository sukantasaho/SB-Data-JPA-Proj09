package com.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.main.entity.Employee_Date_Time;
import com.main.repository.EmployeeRepository;
 

@Service("docService")
public class DoctorServiceImp implements IDoctorService 
{
	@Autowired
	private EmployeeRepository repo;

	@Override
	public String saveEmployee(Employee_Date_Time dateTime) 
	{
		    int eno = repo.save(dateTime).getEno();
		return "Employee is inserted with id-"+eno;
	}

	@Override
	public List<Employee_Date_Time> getAllEmployee() 
	{
		 
		return repo.findAll();
	}

	@Override
	public List<Integer> showEmployeeAgesByDesg(String desg) 
	{
		 
		return null;
	}
	
	

	 
}
