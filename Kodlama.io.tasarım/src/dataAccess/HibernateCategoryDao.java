package dataAccess;

import Entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void getData(Category category) {
		System.out.println("Hibernate ile kaydedildi "+ category);
		
	}
	

}
