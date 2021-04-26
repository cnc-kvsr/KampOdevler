package kampOdev1;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý - C#",
				"Engin Demiroð","C# + ANGULAR");
		Course course2 = new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý - Java",
				"Engin Demiroð","Java + REACT");
		
		Course[] courses = {course1,course2};
		for (Course course : courses) {
			System.out.println(course.courseName);
		}
		
	}

}
