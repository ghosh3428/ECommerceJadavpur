package com.niit.ECommerceBackend.dao;

import com.niit.ECommerceBackend.model.User;

public interface UserDAO 
{
	boolean addUser(User user);
	User getByEmail(String email);
}
