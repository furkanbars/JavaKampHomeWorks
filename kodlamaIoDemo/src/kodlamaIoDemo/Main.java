package kodlamaIoDemo;

public class Main {

	public static void main(String[] args) {
		Student student=new Student();
		student.setId(1);
		student.setFirstName("Abdullah Furkan");
		student.setLastName("Barýþ");
		student.setEmail("abdullahfurkanbars@gmail.com");
		student.setPassword("Af12898.");
		student.setRegisteredCourseName("Java");
		
		StudentManager studentManager=new StudentManager();
		studentManager.register(student);
		studentManager.addCourse(student);
		
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroð");
		instructor.setEmail("engin@engin.com");
		instructor.setPassword("12345");
		instructor.setCourseName("Java");
		instructor.setTalentId(1);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.register(instructor);
		instructorManager.giveEducation(instructor);
	}

}
