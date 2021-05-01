package homework3;

public class StudentManager extends UserManager {

	public void add(Student student) {
		System.out.println(student.getFirstName() + student.getLastName() + " öğrenci olarak kaydı güncellenmiştir.");
	}
	
}
