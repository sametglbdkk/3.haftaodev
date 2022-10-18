import Businnes.CategoryManager;
import Businnes.CourseManager;
import Businnes.İnstructorManager;
import Entities.Category;
import Entities.Course;
import Entities.instructor;
import core.logging.DatabaseLogger;
import core.logging.EmailLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateİnstructorDao;
import dataAccess.JdbcCategoryDao;
import dataAccess.JdbcCourseDao;

public class Main {

	public static void main(String[] args) throws Exception {
    Category category1= new Category(4,"İos");
    Logger[] loggers = {new EmailLogger(),new DatabaseLogger(),new FileLogger()};
	CategoryManager categoryManager=new CategoryManager(new HibernateCategoryDao(),loggers);
	categoryManager.add(category1);
	
	Course course1 = new Course("pyhton",4,200);
    CourseManager courseManager=new CourseManager(new JdbcCourseDao(),loggers);
    courseManager.getData(course1);
    
    instructor instructor1 = new instructor("Fatih ","Terim " ,50.3, "Java");
    İnstructorManager instructorManager =new İnstructorManager(new HibernateİnstructorDao(),loggers);
    instructorManager.getData(instructor1);
    		}
}
