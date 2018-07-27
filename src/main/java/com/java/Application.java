package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.A;

public class Application {
	public static void main(String[] args) {
	System.out.println("Hello World!");
	// ctrl shift o to import
	ApplicationContext context=new ClassPathXmlApplicationContext("spring-beans.xml");
	A a=context.getBean("a1", A.class);

	System.out.println(a.getClass());
	System.out.println(a.hashCode());
	
//	
	String[] beans=context.getBeanDefinitionNames();
	
	for(String bean: beans)
	{
		System.out.println(bean);
	}
	System.out.println("--------Annotation approach below---------");

	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	ctx.scan("com.beans");
	ctx.refresh();

	String[] newBeans = ctx.getBeanDefinitionNames();

	for (String bean : newBeans) {
		System.out.println(bean);
	}
	a.m1();
	A aa = ctx.getBean(A.class);
	aa.m1();
}
}