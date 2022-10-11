package kodlama.io_2022.business;

import kodlama.io_2022.core.logging.Logger;
import kodlama.io_2022.dataAccess.IDataAccess.InstructorDao;
import kodlama.io_2022.entities.Instructor;

public class InstructorManager {

	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void addInstructor(Instructor instructor) {
		instructorDao.addInstructor(instructor);
		for(Logger logger : loggers) {
			logger.log(instructor.getName());
		}
	}

	public void deleteInstructor(Instructor instructor) {
		instructorDao.deleteInstructor(instructor);
	}

	public void updateInstructor(Instructor instructor) {
		instructorDao.updateInstructor(instructor);
	}

	public void addInstructor(int i, String string, double d) {
		
		
	}

	}
