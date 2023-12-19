package com.ty1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("my_conf.xml");
	Person person=(Person)context.getBean("myPerson");
		person.use();
	}
}
