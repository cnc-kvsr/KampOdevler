package kampOdev1;

public class CourseManager {

	public void addCourse(Course course) {
		System.out.println("Yeni kurs eklendi: " + course.courseName);
	}
	public void deleteCourse(Course course) {
		System.out.println("Kurs silindi: " + course.courseName);
	}
}
