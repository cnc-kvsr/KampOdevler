package kampOdev2;

public class StudentManager extends UserManager{
   public void register(Student student) {
	   System.out.println("Kay�t olundu: " + student.getFirstName() +" " + student.getLastName());
   }

}
