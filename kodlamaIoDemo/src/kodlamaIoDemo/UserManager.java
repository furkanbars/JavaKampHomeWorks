package kodlamaIoDemo;

public class UserManager {
	public void login(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" login olundu!");
	}
	public void register(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" kayýt olundu!");
	}
}
