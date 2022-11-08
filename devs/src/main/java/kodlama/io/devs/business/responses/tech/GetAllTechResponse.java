package kodlama.io.devs.business.responses.tech;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllTechResponse {

	private int id;
	private String name;
	private int LanguageId;
	private String LanguageName;
}
