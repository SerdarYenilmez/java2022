package kodlama.io_2022.dataAccess;

import java.util.List;

import kodlama.io_2022.dataAccess.IDataAccess.CategoryDao;
import kodlama.io_2022.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void addCategory(Category category) {
		System.out.println("Kurs Kategorisi: " + category.getName() + "Hibernate ile kaydedildi.");
		
		
	}

	@Override
	public void deleteCategory(Category category) {
		System.out.println("Kurs Kategorisi: " + category.getName() + "Hibernate ile silindi");
		
	}

	@Override
	public void updateCategory(Category category) {
		System.out.println("Kurs Kategorisi: " + category.getName() + "Hibernate ile günellendi!");
		
	}

	@Override
	public List<Category> getAllCategories(List<Category> categories) {
		
		return categories;
	}

	
	}


