package kodlama.io.devs.business.responses.language;

import java.util.List;

import kodlama.io.devs.entities.Tech;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllLanguageResponse {

	private String name;
	private int id;
	private List<Tech> techs;
}
