package dataAccess;

import Entities.instructor;

public class JdbcİnstructorDao implements İnstructorDao  {

	@Override
	public void getData(instructor instructor) {
	System.out.println("Jdbc ile kaydedildi " +instructor);
		
	}

}
