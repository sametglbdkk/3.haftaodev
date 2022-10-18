package dataAccess;

import Entities.Course;

public class JdbcCourseDao implements CourseDao{

	public void getData(Course course) {
		System.out.println("Jdbc ile kaydedildi "+course);

		}
}
