package com.niit.ECommerceBackend;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ECommerceBackend.dao.UserDAO;
import com.niit.ECommerceBackend.model.User;



public class UserTest 
{
	private static AnnotationConfigApplicationContext context;
	static User user;
	static UserDAO userDAO;
	
	
	@BeforeClass
	public static void init() 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.ECommerceBackend");
		context.refresh();
		
		userDAO = (UserDAO)context.getBean("userDAO");
	}
	
	@Test
	public void testAddUser()
	{
		user = new User();
		
		user.setFirstName("Sumit");
		user.setLastName("Das");
		user.setContactNumber("1234567890");
		user.setEmail("sd@gmail.com");
		user.setEnabled(true);
		user.setPassword("sup12345");
		user.setRole("SUPPLIER");
		
		assertEquals("Done" , true , userDAO.addUser(user));
	}

}
