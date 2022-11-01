package kodlama.io.devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.devs.entities.Language;

public interface LanguageRepository {

	List<Language> getAll();

	Language add(Language language);
	
	void update(Language language, int id);
	
	void delete(int id);
	
	public Language getById(int id);
}
