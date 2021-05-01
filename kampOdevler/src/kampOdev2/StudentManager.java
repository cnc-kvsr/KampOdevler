package kampOdev2;

public class StudentManager extends UserManager{
   public void register(Student student) {
	   System.out.println("Kayıt olundu: " + student.getFirstName() +" " + student.getLastName());
   }

}
