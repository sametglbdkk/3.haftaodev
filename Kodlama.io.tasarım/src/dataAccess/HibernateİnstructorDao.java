package dataAccess;

import Entities.instructor;

public class HibernateİnstructorDao implements İnstructorDao{
	public void getData(instructor instructor) {
	System.out.println("Hibernate ile kaydedildi " +instructor);
		
	}

}
