package odevler_3;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.id = 1;
		student.number = 364;
		student.name = "Ali İhsan";
		student.lastName = "Alpargu";
		
		StudentManager studentManager = new StudentManager();
		studentManager.homework("3. gün ödevi");
		
		
		Instructor instructor = new Instructor();
		instructor.id = 10;
		instructor.educatorNo = "123";
		instructor.name = "Engin";
		instructor.lastName = "Demiroğ";

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse("C#");
		instructorManager.delCourse("Python");
		
		
		UserManager userManager = new UserManager();
		userManager.addUser(student);
		
		
	}

}
