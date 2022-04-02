package com.niit.ECommerceBackend.dao;

import java.util.List;

import com.niit.ECommerceBackend.model.Category;


public interface CategoryDAO 
{
	public boolean addCategory(Category category);
	public boolean updateCategory(Category category);
	public boolean deleteCategory(Category category);
	public List<Category> listCategory();
	Category getCategory(int id);

}
