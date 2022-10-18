package dataAccess;

import Entities.Category;

public class JdbcCategoryDao implements CategoryDao {
	
	public void getData(Category category) {
		System.out.println("Jdbc ile kaydedildi "+ category);
		
	}

}
