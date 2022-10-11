package kodlama.io_2022.dataAccess;

import java.util.List;

import kodlama.io_2022.dataAccess.IDataAccess.InstructorDao;
import kodlama.io_2022.entities.Instructor;

public class JDBC_InstructorDao implements InstructorDao{

	@Override
	public void addInstructor(Instructor instructor) {
		System.out.println("Eğitmen: " + instructor.getName() + "JDBC ile eklendi.");
		
	}

	@Override
	public void deleteInstructor(Instructor instructor) {
		System.out.println("Eğitmen: " + instructor.getName() + "JDBC ile silindi.");
		
	}

	@Override
	public void updateInstructor(Instructor instructor) {
		System.out.println("Eğitmen: " + instructor.getName() + "JDBC ile güncellendi.");
		
	}

	@Override
	public List<Instructor> getAllInstructor(List<Instructor> instructors) {
        return instructors;
	}

}
