package com.cjc.crud.web.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.crud.web.dao.HomeDao;
import com.cjc.crud.web.model.Student;

@Repository
public class HomeDaoImpl implements HomeDao

{
	@Autowired
	SessionFactory sf;

	public void saveData(Student s) 
	{
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(s);
		tx.commit();
		session.close();
	}

}
