package kampOdev2;

import kampOdev1.Course;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Kevser");
		student.setLastName("Canca");
		student.setEmail("abc@hotmail.com");
		student.setPassword(12345);
		
		StudentManager studentManager = new StudentManager();
		studentManager.register(student);
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.logIn(instructor);
		
		UserManager manager = new UserManager();
		manager.logIn(student);
		
		
		
		
	}

}
