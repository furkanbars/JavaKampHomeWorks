package kodlamaIoDemo;

public class Instructor extends User{
	private String courseName;
	private int talentId;

	public Instructor(int id,String firstName,String lastName,String email,String password,String courseName,int talentId) {
		super( id, firstName, lastName, email, password);
		this.courseName=courseName;
		this.talentId = talentId;
	}
	public Instructor() {
		
	}
	public int getTalentId() {
		return talentId;
	}
	public void setTalentId(int talentId) {
		this.talentId = talentId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}
