package com.sampleproject.springxmlbasicproject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	

        //Old way of creating object
        //Computer computer = new Laptop(null, null);
        //Computer computer = new Desktop(;)
       
    	
       ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
       
       //Alternative Bean factory Method
       //BeanFactory factory = new ClassPathXmlApplicationContext("Spring.xml");
       
       Computer computer = (Computer) context.getBean("computer");
       
       computer.calculateEfficiency();
       
    }
}
