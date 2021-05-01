package homework3;

public class Main {

	public static void main(String[] args) {
		
		Student user1 = new Student();
		user1.setId(1);
		user1.setFirstName("test");
		user1.setLastName("user");
		user1.setNationalIdentity("123456789");
		user1.setCountry("Turkey");
		user1.setHomeland("Ankara");
		user1.setStudentId(1);
		user1.setLearningLanguage("JAVA");
		
		UserManager userManager = new UserManager();
		userManager.add(user1);
				
		
	}
	
}
