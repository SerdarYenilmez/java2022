package kodlama.io_2022.dataAccess;

import java.util.List;

import kodlama.io_2022.dataAccess.IDataAccess.InstructorDao;
import kodlama.io_2022.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void addInstructor(Instructor instructor) {
		System.out.println("Eğitmen: " + instructor.getName() + "Hibernate ile kaydedildi.");
		
	}

	public void deleteInstructor(Instructor instructor) {
		System.out.println("Eğitmen: " + instructor.getName() + "Hibernate ile silindi");
		
	}

	@Override
	public void updateInstructor(Instructor instructor) {
		System.out.println("Eğitmen: " + instructor.getName() + "Hibernate ile güncellendi.");
		
	}

	public List<Instructor> getAllInstructor(List<Instructor> instructors) {
        return instructors;
    }
	

	
	}


