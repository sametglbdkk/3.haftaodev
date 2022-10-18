package Businnes;

import Entities.instructor;
import core.logging.Logger;
import dataAccess.İnstructorDao;

public class İnstructorManager {
	private İnstructorDao instructorDao;
	private Logger[] loggers ;
	
	public İnstructorManager() {
	
	}

	public İnstructorManager(İnstructorDao instructorDao, Logger[] loggers) {
	
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	public void getData(instructor instructor) {
		instructorDao.getData(instructor);
		for(Logger logger: loggers) {
			logger.log(instructor.getName()+""+instructor.getLastName()+instructor.getYearsofexperience());
		}
		
	}
	
	
	

}
