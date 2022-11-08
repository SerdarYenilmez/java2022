package kodlama.io.devs.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.TechService;
import kodlama.io.devs.business.requests.tech.CreateTechRequest;
import kodlama.io.devs.business.requests.tech.DeleteTechRequest;
import kodlama.io.devs.business.requests.tech.UpdateTechRequest;
import kodlama.io.devs.business.responses.tech.GetAllTechResponse;
import kodlama.io.devs.business.responses.tech.GetByIdTechResponse;

@RestController
@RequestMapping("/api/techs")
public class TechController {

	private TechService techService;

	@Autowired
	public TechController(TechService techService) {
		super();
		this.techService = techService;
	}

	@GetMapping("/getall")
	List<GetAllTechResponse> getAll() {
		return techService.getAll();
	}

	@GetMapping("/getbyid")
	GetByIdTechResponse getById(int id) {
		return techService.getById(id);
	}

	@PostMapping("/add")
	void add(CreateTechRequest createTechRequest) throws Exception {
		techService.add(createTechRequest);
	}

	@DeleteMapping("/delete")
	void delete(DeleteTechRequest deleteTechRequest) {
		techService.delete(deleteTechRequest);
	}

	@PutMapping("/update")
	void update(UpdateTechRequest updateTechRequest) {
		techService.update(updateTechRequest);
	}

}
