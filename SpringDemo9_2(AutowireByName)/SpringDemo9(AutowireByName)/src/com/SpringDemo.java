package com;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Employee;
public class SpringDemo// Test
{
 public static void main(String[] args) 
	{
		AbstractApplicationContext  context = 
				new ClassPathXmlApplicationContext("spring-config.xml");
		Employee employee=(Employee)context.getBean("employee");
		System.out.println(employee);		
		
    } 
}
