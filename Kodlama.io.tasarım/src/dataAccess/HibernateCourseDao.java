package dataAccess;

import Entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void getData(Course course) {
		System.out.println("Hibernate ile kaydedildi "+course);

		
	}


}
