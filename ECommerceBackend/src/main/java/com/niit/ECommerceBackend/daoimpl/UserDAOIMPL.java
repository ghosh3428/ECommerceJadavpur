package com.niit.ECommerceBackend.daoimpl;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ECommerceBackend.dao.UserDAO;
import com.niit.ECommerceBackend.model.Category;
import com.niit.ECommerceBackend.model.User;

@Repository("userDAO")
@Transactional
public class UserDAOIMPL implements UserDAO 
{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean addUser(User user) 
	{
		try
		{
			sessionFactory.getCurrentSession().persist(user);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public User getByEmail(String email) 
	{
		String selectActiveCategory = "FROM User WHERE enabled = :active and email= :email";
		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
		query.setParameter("active", true);
		query.setParameter("email", email);
		return (User) query.getSingleResult();
		
	}

}
