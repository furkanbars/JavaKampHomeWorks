package registerSystem;

import registerSystem.business.abstracts.UserService;
import registerSystem.business.concrete.UserManager;
import registerSystem.core.concrete.adapters.OurGoogleValidManager;
import registerSystem.dataAccess.concrete.HibernateUserDao;
import registerSystem.entities.concrete.User;

public class Main {

	public static void main(String[] args) {
		User user=new User();
		user.setId(1);
		user.setFirstName("Abdullah Furkan");
		user.setLastName("Barýþ");
		user.setEmail("abfurkii@gmail.com");
		user.setPassword("123456");
		
		UserService userService=new UserManager(new HibernateUserDao(),new OurGoogleValidManager());
		userService.register(user);
		
		userService.login(user.getEmail(),user.getPassword());
		
		
	}

}
