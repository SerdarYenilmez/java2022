package kodlama.io.devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.io.devs.entities.Tech;

@Repository
public interface TechRepository extends JpaRepository<Tech, Integer>{

	
}
