package odevler_3;

public class InstructorManager {
	
	public void addCourse(String course) {
		System.out.println("Eklenen kurs: " + course);
	}
	
	public void delCourse(String course) {
		System.out.println("Silinen kurs: " + course);
	}
	
	public void addInstructor(Instructor user) {
		System.out.println("Eðitimci id'si: " + user.educatorNo);
	}

}
