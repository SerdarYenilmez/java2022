package kodlama.io.devs.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.business.requests.language.CreateLanguageRequest;
import kodlama.io.devs.business.requests.language.DeleteLanguageRequest;
import kodlama.io.devs.business.requests.language.UpdateLanguageRequest;
import kodlama.io.devs.business.responses.language.GetAllLanguageResponse;
import kodlama.io.devs.business.responses.language.GetByIdLanguageResponse;
import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.dataAccess.abstracts.TechRepository;
import kodlama.io.devs.entities.Language;
import kodlama.io.devs.entities.Tech;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;
	TechRepository techRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository, TechRepository techRepository) {
		super();
		this.languageRepository = languageRepository;
		this.techRepository = techRepository;
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
		Language language = new Language();
		language.setName(createLanguageRequest.getName());
		if (!language.getName().isEmpty()) {
			for (int i = 0; i < languageRepository.findAll().size(); i++) {
				if (languageRepository.findAll().get(i).getName().equalsIgnoreCase(language.getName())) {
					throw new Exception("Programlama dili zaten var.");
				}
			}

			languageRepository.save(language);
		} else {
			throw new Exception("Programlama dil kısmı boş olamaz.");
		}

	}

	@SuppressWarnings("deprecation")
	@Override
	public void delete(DeleteLanguageRequest deleteLanguageRequest) {
		Language language = languageRepository.getById(deleteLanguageRequest.getId());
		techRepository.deleteAll(language.getTechnologies());
		languageRepository.delete(language);

	}

	@SuppressWarnings("deprecation")
	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest) {
		Language language = languageRepository.getById(updateLanguageRequest.getId());
		language.setName(updateLanguageRequest.getName());
		languageRepository.save(language);

	}

	@Override
	public List<GetAllLanguageResponse> getAll() {
		List<Language> languages = languageRepository.findAll();
		List<Tech> techs = techRepository.findAll();

		List<GetAllLanguageResponse> languagesResponse = new ArrayList<GetAllLanguageResponse>();
		for (Language language : languages) {
			GetAllLanguageResponse responseItem = new GetAllLanguageResponse();
			for (Tech tech : techs) {
				if (tech.getLanguage().getId() == language.getId()) {
					System.out.println("Buradayım");
					if (!language.getTechnologies().contains(tech)) {
						language.getTechnologies().add(tech);
					}

				}
			}
			responseItem.setTechs(language.getTechnologies());
			responseItem.setId(language.getId());
			responseItem.setName(language.getName());
			languagesResponse.add(responseItem);
		}

		return languagesResponse;

	}

	@Override
	public GetByIdLanguageResponse getById(int id) {
		Optional<Language> language = languageRepository.findById(id);
		GetByIdLanguageResponse languageResponse = new GetByIdLanguageResponse();
		languageResponse.setName(language.get().getName());

		return languageResponse;

	}
}
