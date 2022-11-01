package kodlama.io.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.Language;

public class InMemoryLanguageRepository implements LanguageRepository{

	List<Language> languages;
	
	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1,"C#"));
		languages.add(new Language(2,"Java"));
		languages.add(new Language(3,"Python"));
	}
	@Override
	public List<Language> getAll() {
		
		return languages;
	}
	@Override
	public Language add(Language language) {
		languages.add(language);
		return getById(language.getId());
	}
	@Override
	public void update(Language language, int id) {
		Language languageYeni = getById(id);
		languageYeni.setName(language.getName());
		
	}
	@Override
	public void delete(int id) {
		languages.remove(getById(id));
		
	}
	@Override
	public Language getById(int id) {
		
		return languages.stream().filter(language -> language.getId()==id).findFirst().get();
	}

}
