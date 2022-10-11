package kodlama.io_2022.business;

import java.util.ArrayList;
import java.util.List;

import kodlama.io_2022.core.logging.Logger;
import kodlama.io_2022.dataAccess.IDataAccess.CourseDao;

import kodlama.io_2022.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.loggers=loggers;
		this.courseDao = courseDao;

	}
	List<Course> courses=new ArrayList<Course>();

	public void addCourse(Course course) throws Exception {
		for (Course courseList : courses) {
			if (courseList.getName() == course.getName()) {
				throw new Exception("Kurs zaten listelenmiş.");
			}
		}
		if (course.getPrice() <= 0) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");
		}

		courseDao.addCourse(course);
		for(Logger logger:loggers){
            logger.log(course.getName());
        }
	}

	public void deleteCourse(Course course) {
		courseDao.deleteCourse(course);
		for(Logger logger:loggers){
            logger.log(course.getName());
        }

	}

	public void updateCourse(Course course) {
		courseDao.updateCourse(course);
		for(Logger logger:loggers){
            logger.log(course.getName());
        }

	}

	public Course getCourseById(int id) {

		return null;
	}

}
