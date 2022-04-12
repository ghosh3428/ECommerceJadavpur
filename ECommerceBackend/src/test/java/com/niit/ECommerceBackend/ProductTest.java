package com.niit.ECommerceBackend;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ECommerceBackend.dao.CategoryDAO;
import com.niit.ECommerceBackend.dao.ProductDAO;
import com.niit.ECommerceBackend.dao.UserDAO;
import com.niit.ECommerceBackend.model.Category;
import com.niit.ECommerceBackend.model.Product;
import com.niit.ECommerceBackend.model.User;

public class ProductTest 
{
	private static AnnotationConfigApplicationContext context;
	static User user;
	static UserDAO userDAO;
	static Product product;
	static ProductDAO productDAO;
	
	
	
	@BeforeClass
	public static void init() 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.ECommerceBackend");
		context.refresh();
		
		userDAO = (UserDAO)context.getBean("userDAO");
		productDAO = (ProductDAO)context.getBean("productDAO");
	}
	
	@Test
	public void testAddProduct()
	{
		user = userDAO.getByEmail("sd@gmail.com");
		product = new Product();
		
		product.setName("Gen 5 Smartwatch The Carlyle HR Black Silicone");
		product.setBrand("Fossils");
		product.setUnitPrice(14999);
		product.setQuantity(8);
		product.setDescription("Processor: Qualcomm® Snapdragon™ Wear 3100 " + 
				"Memory: 1 GB RAM, 8GB Storage " + 
				"Display: 3.2 cm AMOLED / 416 x 416 / 328ppi");
		product.setCategoryId(3);
		product.setSupplierId(user.getId());
		product.setActive(true);
		
		assertEquals("Done" , true , productDAO.addProduct(product));
	}

}
