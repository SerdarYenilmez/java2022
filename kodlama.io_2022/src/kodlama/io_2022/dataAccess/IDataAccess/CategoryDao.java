package kodlama.io_2022.dataAccess.IDataAccess;

import java.util.List;

import kodlama.io_2022.entities.Category;

public interface CategoryDao {

	void addCategory(Category category);

	void deleteCategory(Category category);

	void updateCategory(Category category);
	
	List<Category> getAllCategories(List<Category> categories);

	

	

	

}
