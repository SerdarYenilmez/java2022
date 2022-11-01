package kodlama.io.devs.business.concretes;

import java.util.List;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.Language;

public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;

	public LanguageManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		// iş kuralları
		return languageRepository.getAll();
	}

	@Override
	public Language add(Language language) throws Exception {
		if (idMevcut(language.getId()))
			throw new Exception("Id zaten mevcut.");
		if (isimMevcut(language))
			throw new Exception("İsim zaten var.");
		return languageRepository.add(language);
	}

	@Override
	public void update(Language language, int id) throws Exception {
		if (!idMevcut(language.getId()))
			throw new Exception("Id bulunamadı.");
		if (isimMevcut(language))
			throw new Exception("İsim zaten var.");
		languageRepository.update(language, id);
	}

	@Override
	public void delete(int id) throws Exception {
		if (!idMevcut(id))
			throw new Exception("Id bulunamadı");
		languageRepository.delete(id);

	}

	@Override
	public Language getById(int id) throws Exception {
		if (idMevcut(id))
			throw new Exception("Id bulunamadı.");
		return languageRepository.getById(id);
	}

	public boolean idMevcut(int id) {
		for (Language languageYeni : getAll()) {
			if (languageYeni.getId() == id) {
				return true;
			}
		}
		return false;
	}

	public boolean isimMevcut(Language language) {
		for (Language languageYeni : getAll()) {
			if (language.getName().equalsIgnoreCase(languageYeni.getName())) {
				return true;
			}
		}
		return false;
	}
}
