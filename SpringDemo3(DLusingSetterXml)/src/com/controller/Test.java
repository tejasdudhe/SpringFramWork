package com.controller;
import com.model.*;
import org.springframework.*;
import org.springframework.context.*;
import org.springframework.context.support.*;
public class Test 
{
 public static void main(String[] args) 
 {
   ApplicationContext ac= new ClassPathXmlApplicationContext("Spring.xml");
   
   Employee e= (Employee)ac.getBean("emp");
   System.out.println(e); 

 }// end main
}// end class
