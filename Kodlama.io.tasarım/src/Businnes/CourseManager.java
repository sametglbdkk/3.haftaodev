package Businnes;

import Entities.Course;
import core.logging.Logger;
import dataAccess.CourseDao;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager() {
		
	}

	public CourseManager(CourseDao courseDao, Logger[] logger) {
		this.courseDao = courseDao;
		this.loggers = logger;
	}
	public void getData(Course course) throws Exception {
		Course [] courses = {new Course("Java",2000,183.5),new Course("Html",1250,75.5),new Course("C++",1750,83.5)}; 
		for (Course course2 : courses) { if (course.getLanguage() == course2.getLanguage()) {
            throw new Exception("Kurs ismi(dili) tekrar edemez.");
        } 
		else if (course.getPrice()<0) {
			throw new Exception("Kursun fiyatı 0 dan küçük olamaz");
		}
		courseDao.getData(course);
		for (Logger logger : loggers) {
			logger.log(course.getLanguage());
			
		}
		
			
		
	       }
	
	
       }
	}
	
