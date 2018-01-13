package com.synclones.iventory.repositoryImpl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import com.synclones.iventory.repository.GenericRepository;

public class GenericRepositoryImpl<T, PK extends Serializable> implements GenericRepository<T, PK>{

	private Class< T > clazz;
	
	@Autowired
	SessionFactory sessionFactory;
	

    @Autowired
    @Required
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public SessionFactory getSessionFactory() {
        return this.sessionFactory;
    }
    public Session getSession() throws HibernateException {
        Session sess = getSessionFactory().getCurrentSession();
        if (sess == null) {
            sess = getSessionFactory().openSession();
        }
        return sess;
    }

	@Override
	public List<T> getAll() {
		Session sess = getSession();
		return sess.createCriteria(clazz).list();
	}

	@Override
	public T get(PK id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsObj(PK id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T save(T object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(T object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(PK id) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * nuwan @ SYNCLONES
	 * Jan 10, 2018 T 12:36:50 PM
	 */
}
