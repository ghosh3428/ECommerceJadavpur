package com.niit.ECommerceBackend;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ECommerceBackend.dao.CategoryDAO;
import com.niit.ECommerceBackend.model.Category;

public class CategoryTest 
{
	private static AnnotationConfigApplicationContext context;
	static Category category;
	static CategoryDAO categoryDAO;
	
	
	@BeforeClass
	public static void init() 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.ECommerceBackend");
		context.refresh();
		
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	
	@Test
	public void testAddCategory()
	{
		category = new Category();
		category.setName("SmartTV");
		category.setDescription("Sample category for Smart Tv");
		category.setActive(true);
		
		assertEquals("Done" , true , categoryDAO.addCategory(category));
	}
	

}
