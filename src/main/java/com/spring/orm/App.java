package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entity.Student;

public class App {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/spring/orm/config1.xml");
		StudentDao dao = context.getBean("studentDao", StudentDao.class);
		Student s1 = new Student();
		s1.setStudentId(1);
		s1.setStudentName("saurabh");
		s1.setStudentAdddress("Azamgarh");
		int r = dao.insert(s1);
		System.out.println("Data inserted " + r);

	}
}
