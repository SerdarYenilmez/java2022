package kodlama.io_2022.business;

import java.util.ArrayList;
import java.util.List;

import kodlama.io_2022.core.logging.Logger;
import kodlama.io_2022.dataAccess.IDataAccess.CategoryDao;
import kodlama.io_2022.entities.Category;

public class CategoryManager {

	
	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	List<Category> categories = new ArrayList<Category>();

	public void addCategory(Category category) throws Exception {

		for (Category categoryList : categories) {
			if (category.getName() == categoryList.getName()) {
				throw new Exception("Kurs zaten listelenmiş.");
			}

		}
		categoryDao.addCategory(category);
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}

	public void deleteCategory(Category category) {
		categoryDao.deleteCategory(category);
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}

	public void updateCategory(Category category) {
		categoryDao.updateCategory(category);
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}

	}
}
