
public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiro�");
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("�brahim");
		student.setLastName("Seyman");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add();
		instructorManager.add(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add();
		studentManager.add(student);
	
	}
	
	

}
