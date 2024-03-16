package com.spring.orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entity.Student;

public class StudentDao {
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	
	public StudentDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	//insert
	@Transactional
	public int insert(Student student) {
		Integer r = (Integer) this.hibernateTemplate.save(student);
		return r;
	}
	
	
	// update
	
	
	// get single student
	
	
	// get all student
	
	
	// delete
	
}
