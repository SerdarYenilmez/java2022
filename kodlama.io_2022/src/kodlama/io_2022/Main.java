package kodlama.io_2022;

import kodlama.io_2022.business.CategoryManager;
import kodlama.io_2022.business.CourseManager;
import kodlama.io_2022.core.logging.DatabaseLogger;
import kodlama.io_2022.core.logging.FileLogger;
import kodlama.io_2022.core.logging.Logger;
import kodlama.io_2022.core.logging.MailLogger;
import kodlama.io_2022.dataAccess.HibernateCategoryDao;
import kodlama.io_2022.dataAccess.JDBC_CourseDao;
import kodlama.io_2022.dataAccess.IDataAccess.CategoryDao;
import kodlama.io_2022.entities.Category;
import kodlama.io_2022.entities.Course;


public class Main {

	public static void main(String[] args) throws Exception {
		
		Course courseJava = new Course(123, "Java", 550.00);
		Course course2 = new Course(3246, "Fiyatı düşük Kurs", 0);
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		CourseManager courseManager = new CourseManager(new JDBC_CourseDao(), loggers);
		courseManager.deleteCourse(courseJava);
		courseManager.updateCourse(courseJava);
	
		
		
	//------------------------------------
		
		Category category = new Category("Backend", "JavaSC");
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers);
		categoryManager.addCategory(category);

	}

}
