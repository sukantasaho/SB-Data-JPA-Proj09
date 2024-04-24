package com.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

 
import com.main.entity.Employee_Date_Time;
import com.main.services.IDoctorService;

@SpringBootApplication
public class SbDataJpaProj03Application
{

	public static void main(String[] args) 
	{
		   ApplicationContext ctx = SpringApplication.run(SbDataJpaProj03Application.class, args);
		   IDoctorService service = ctx.getBean("docService", IDoctorService.class);
		   
		   try
		   {
			   Employee_Date_Time e1 = new Employee_Date_Time("Biju","clerk",LocalDateTime.of(1990, 10, 20, 11, 31),LocalTime.of(22, 41),LocalDate.of(2020, 10, 30));
			   
			    String msg = service.saveEmployee(e1);
			    System.out.println(msg);
service.getAllEmployee().forEach(e->System.out.println(e.getDesg()+" "+e.getEname()+" "+e.getDoj()+" "+e.getDob()+" "+e.getToj()+" "+e.getEno()));
			    
		   }
           catch(Exception e)
		   {
        	   e.printStackTrace();
		   }
		      ((ConfigurableApplicationContext) ctx).close();
	}

}
