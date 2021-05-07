package registerSystem.googleValid;

import registerSystem.entities.concrete.User;

public class GoogleValidManager {
	private String[] emails= {"abdullah@gmail.com","abfurkii@gmail.com","abfurkii@hotmail.com"};
	public void isThere(User user) {
		for(int i=0;i<emails.length;i++) {
			if (emails[i]==user.getEmail()) {
				System.out.println("Google ile giriþ yapýldý.");
				return;
			} 
		}
	}
}
