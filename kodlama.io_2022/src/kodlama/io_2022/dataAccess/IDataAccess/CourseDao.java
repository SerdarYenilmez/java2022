package kodlama.io_2022.dataAccess.IDataAccess;

import java.util.List;

import kodlama.io_2022.entities.Course;

public interface CourseDao {

	void addCourse(Course course);

	void deleteCourse(Course course);

	void updateCourse(Course course);
	
	List<Course> getAllCourses(List<Course> courses);

}
