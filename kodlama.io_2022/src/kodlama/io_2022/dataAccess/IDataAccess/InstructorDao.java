package kodlama.io_2022.dataAccess.IDataAccess;



import java.util.List;

import kodlama.io_2022.entities.Instructor;

public interface InstructorDao {

	void addInstructor(Instructor instructor);

	void deleteInstructor(Instructor instructor);

	void updateInstructor(Instructor instructor);

	List<Instructor> getAllInstructor(List<Instructor> instructors);
}
