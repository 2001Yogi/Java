package com.core.spring_context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext con =  new ClassPathXmlApplicationContext("com/core/spring_context/config.xml");
      User u1 = (User)con.getBean(User.class);
      System.out.println(u1);
    }
}
