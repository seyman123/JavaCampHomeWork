
public class StudentManager extends UserManager {
	public void add(Student student) {
		System.out.println("Öğrenci Eklendi : " + student.getFirstName());
	}
} 