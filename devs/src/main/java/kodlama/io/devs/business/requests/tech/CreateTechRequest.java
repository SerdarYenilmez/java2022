package kodlama.io.devs.business.requests.tech;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTechRequest {

	private int LanguageId;
	private String name;
}
