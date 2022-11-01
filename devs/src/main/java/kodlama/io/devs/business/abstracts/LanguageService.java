package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.entities.Language;

public interface LanguageService {

	List<Language> getAll();

	public Language add (Language language) throws Exception;

	public void update (Language language, int id) throws Exception;

	public void delete (int id) throws Exception;

	public Language getById (int id) throws Exception;
}
