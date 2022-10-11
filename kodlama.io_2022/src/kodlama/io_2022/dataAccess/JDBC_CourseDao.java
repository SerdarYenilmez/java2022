package kodlama.io_2022.dataAccess;

import java.util.List;

import kodlama.io_2022.dataAccess.IDataAccess.CourseDao;
import kodlama.io_2022.entities.Course;

public class JDBC_CourseDao implements CourseDao{

	@Override
	public void addCourse(Course course) {
		System.out.println("Kurs: " + course.getName() + "JDBC ile eklendi!");
		
	}

	@Override
	public void deleteCourse(Course course) {
		System.out.println("Kurs: " + course.getName() + "JDBC ile silindi.");
		
	}

	@Override
	public void updateCourse(Course course) {
		System.out.println("Kurs: " + course.getName() + "JDBC ile güncellendi.");
		
	}

	@Override
	public List<Course> getAllCourses(List<Course> courses) {
		
		return courses;
	}

}
