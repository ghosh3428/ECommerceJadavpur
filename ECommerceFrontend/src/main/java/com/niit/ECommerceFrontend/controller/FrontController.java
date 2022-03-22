package com.niit.ECommerceFrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontController 
{
	
	@RequestMapping(value={"/","/home" , "/index"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("index");
		
		mv.addObject("title" ,"E_COMMERCE FRONTEND HOME");
		mv.addObject("message" ,"Hello User. Welcome to E-Commerce Frontend");
		
		return mv;
	}
	
	@RequestMapping(value="/aboutus")
	public ModelAndView aboutus()
	{
		ModelAndView mv = new ModelAndView("about");
		
		mv.addObject("title" ,"E_COMMERCE FRONTEND About Us");


		return mv;
	}
	

}
