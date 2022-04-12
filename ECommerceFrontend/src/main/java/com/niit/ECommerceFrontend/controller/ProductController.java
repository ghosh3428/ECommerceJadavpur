package com.niit.ECommerceFrontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.ECommerceBackend.dao.CategoryDAO;

@Controller
@RequestMapping(value="/product")
public class ProductController 
{
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@RequestMapping(value="/view/all/active")
	public ModelAndView allActiveProducts()
	{
		ModelAndView mv = new ModelAndView("index");
		
		mv.addObject("userclickallproducts", true);
		mv.addObject("title", "All Products");
		mv.addObject("categories", categoryDAO.listCategory());
		
		return mv;
	}
	
	@RequestMapping(value="/view/category/{id}/products")
	public ModelAndView categoryProducts(@PathVariable("id") int c_id)
	{
		ModelAndView mv = new ModelAndView("index");
		
		mv.addObject("userclickcategoryproducts", true);
		mv.addObject("title", "All Products");
		mv.addObject("category" , categoryDAO.getCategory(c_id));
		mv.addObject("categories", categoryDAO.listCategory());
		
		return mv;
	}

}
