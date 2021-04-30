package kodlamaIoDemo;

public class StudentManager extends UserManager{
	@Override
	public void register(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" öðrencisi kayýt oldu!");
	}
	@Override
	public void login(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" öðrencisi login oldu!");
	}
	public void addCourse(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()+" kiþisi kursa eklendi!");
	}
	public void removeCourse(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()+" kiþisinden kurs kaldýrýldý!");
	}
}
