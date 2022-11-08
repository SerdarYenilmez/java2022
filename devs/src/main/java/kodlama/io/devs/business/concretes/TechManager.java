package kodlama.io.devs.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.TechService;
import kodlama.io.devs.business.requests.tech.CreateTechRequest;
import kodlama.io.devs.business.requests.tech.DeleteTechRequest;
import kodlama.io.devs.business.requests.tech.UpdateTechRequest;
import kodlama.io.devs.business.responses.tech.GetAllTechResponse;
import kodlama.io.devs.business.responses.tech.GetByIdTechResponse;
import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.dataAccess.abstracts.TechRepository;
import kodlama.io.devs.entities.Language;
import kodlama.io.devs.entities.Tech;

@Service
public class TechManager implements TechService {

	TechRepository techRepository;
	LanguageRepository languageRepository;

	@Autowired
	public TechManager(TechRepository techRepository, LanguageRepository languageRepository) {
		super();
		this.techRepository = techRepository;
		this.languageRepository = languageRepository;

	}

	@Override
	public void add(CreateTechRequest createTechRequest) throws Exception {
		Language language = languageRepository.findById(createTechRequest.getLanguageId()).get();
		Tech tech = new Tech();
		tech.setLanguage(language);
		tech.setName(createTechRequest.getName());
		techRepository.save(tech);
	}

	@Override
	public void delete(DeleteTechRequest deleteTechRequest) {
		Tech tech = techRepository.findById(deleteTechRequest.getId()).get();
		techRepository.delete(tech);

	}

	@Override
	public void update(UpdateTechRequest updateTechRequest) {
		Language language = languageRepository.findById(updateTechRequest.getLanguageId()).get();
		Tech tech = techRepository.findById(updateTechRequest.getId()).get();
		tech.setName(updateTechRequest.getName());
		tech.setLanguage(language);
		techRepository.save(tech);

	}

	@Override
	public List<GetAllTechResponse> getAll() {
		List<Tech> techs = techRepository.findAll();
		List<GetAllTechResponse> techsResponse = new ArrayList<GetAllTechResponse>();
		for (Tech tech : techs) {
			GetAllTechResponse responseItem = new GetAllTechResponse();
			responseItem.setId(tech.getId());
			responseItem.setName(tech.getName());
			responseItem.setLanguageId(tech.getLanguage().getId());
			responseItem.setLanguageName(tech.getLanguage().getName());
			techsResponse.add(responseItem);

		}
		return techsResponse;
	}

	@Override
	public GetByIdTechResponse getById(int id) {
		Optional<Tech> tech = techRepository.findById(id);
		GetByIdTechResponse responseItem = new GetByIdTechResponse();
		responseItem.setName(tech.get().getName());
		return responseItem;

	}

}
