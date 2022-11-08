package kodlama.io.devs.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.devs.business.requests.tech.CreateTechRequest;
import kodlama.io.devs.business.requests.tech.DeleteTechRequest;
import kodlama.io.devs.business.requests.tech.UpdateTechRequest;
import kodlama.io.devs.business.responses.tech.GetAllTechResponse;
import kodlama.io.devs.business.responses.tech.GetByIdTechResponse;

@Service
public interface TechService {
	
	
	void add(CreateTechRequest createTechRequest) throws Exception;

	void delete(DeleteTechRequest deleteTechRequest);

	void update(UpdateTechRequest updateTechRequest);

	List<GetAllTechResponse> getAll();

	GetByIdTechResponse getById(int id);
}
