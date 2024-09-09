package com.orm.SpringORM;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ){
        System.out.println("App Start");
        ApplicationContext con  =new ClassPathXmlApplicationContext("com/orm/SpringORM/config.xml");
        DAO dao = (DAO)con.getBean("dao");
		System.out.println("context get");
		
		Model m1 = new Model(1, "java", 9876540, "Mumbai");
		dao.saveUser(m1);
		System.out.println("data saved");
		
		Model m = dao.getSingleUser(1);
		System.out.println(m);
		
		List<Model> list = dao.getAllUsers();
		System.out.println(list);
		
		Model model = new Model(1,"java",986854,"xyz");
		dao.saveUser(model); // It is for Update the Data
		
//		dao.deleteUser(1);
//		System.out.println("data deleted");
    }
}
