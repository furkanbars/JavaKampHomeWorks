package kodlamaIoDemo;

public class Student extends User{
	String registeredCourseName;
	public Student(int id,String firstName,String lastName,String email,String password,String registeredCourseName) {
		super( id, firstName, lastName, email, password);
		this.registeredCourseName = registeredCourseName;
	}
	public Student() {
		
	}
	public String getRegisteredCourseName() {
		return registeredCourseName;
	}
	public void setRegisteredCourseName(String registeredCourseName) {
		this.registeredCourseName = registeredCourseName;
	}
}
