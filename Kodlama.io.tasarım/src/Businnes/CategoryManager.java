package Businnes;

import Entities.Category;
import core.logging.Logger;
import dataAccess.CategoryDao;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger [] loggers ;


	
public CategoryManager() {
		
	}

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	public void add (Category category) throws Exception {
		Category [] categories= {new Category(1,"Backend"),new Category(2,"Devops"),new Category(3,"Android")};
		for (Category category2 : categories) {
	    if(category.getCategoryName()== category2.getCategoryName()) {
	    	throw new Exception ("Kategori ismi tekrar edemez!!");
	    }
	 
		}
		
	   categoryDao.getData(category);
	for (Logger logger : loggers) {
		   logger.log(category.getCategoryName());
		   }
		
	}
	}
	
	
	
	


