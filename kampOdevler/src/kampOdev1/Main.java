package kampOdev1;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� - C#",
				"Engin Demiro�","C# + ANGULAR");
		Course course2 = new Course(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� - Java",
				"Engin Demiro�","Java + REACT");
		
		Course[] courses = {course1,course2};
		for (Course course : courses) {
			System.out.println(course.courseName);
		}
		
	}

}
