package com.welcome.springcopilot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
       ApplicationContext ac = new ClassPathXmlApplicationContext("vehicleconfig.xml");
    	
    	Vehicle v = (Vehicle)ac.getBean("vehicle");
    	
        v.drive();
    }
    	
}


