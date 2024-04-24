package com.main.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.main.entity.Employee_Date_Time;
 
public interface EmployeeRepository extends JpaRepository<Employee_Date_Time, Integer>
{
  
	  
	 
}
