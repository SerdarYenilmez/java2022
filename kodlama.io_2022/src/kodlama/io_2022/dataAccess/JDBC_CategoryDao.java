package kodlama.io_2022.dataAccess;

import java.util.List;

import kodlama.io_2022.dataAccess.IDataAccess.CategoryDao;
import kodlama.io_2022.entities.Category;

public class JDBC_CategoryDao implements CategoryDao{

	@Override
	public void addCategory(Category category) {
		System.out.println("Kategori: " + category.getName() + "JDBC ile eklendi.");
		
	}

	@Override
	public void deleteCategory(Category category) {
		System.out.println("Kategori: " + category.getName() + "JDBC ile silindi.");
		
	}

	@Override
	public void updateCategory(Category category) {
		System.out.println("Kategori: " + category.getName() + "JDBC ile güncellendi.");
		
	}

	@Override
	public List<Category> getAllCategories(List<Category> categories) {
		
		return categories;
	}

}
