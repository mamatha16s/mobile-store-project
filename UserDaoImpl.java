package com.DaoImpl;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.Dao.*;
import com.model.*;

@Repository
public class UserDaoImpl implements UserDao
{
	@Autowired
	SessionFactory sessionFac;
	public void insertUser(User user)
	{
		Session session=sessionFac.openSession();
		session.beginTransaction();
		session.persist(user);
		session.getTransaction().commit();
	}
	
	@Autowired
	public UserDaoImpl(SessionFactory sessionFactory)
	{
		super();
		sessionFac=sessionFactory;
	}
	
	
}
