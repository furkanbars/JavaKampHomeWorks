package registerSystem.business.concrete;

import registerSystem.business.abstracts.UserService;
import registerSystem.core.abstracts.ProjectService;
import registerSystem.dataAccess.abstracts.UserDao;
import registerSystem.entities.concrete.User;

public class UserManager implements UserService{
	private UserDao userDao;
	private ProjectService projectService;
	
	public UserManager(UserDao userDao,ProjectService projectService) {
		super();
		this.userDao = userDao;
		this.projectService=projectService;
	}

	@Override
	public void register(User user) {
		this.projectService.isThere(user);	
		
		
		if(ControlManager.emailControl(user.getEmail())&&ControlManager.firstNameControl(user.getFirstName())
				&&ControlManager.lastNameControl(user.getLastName())&&ControlManager.passwordControl(user.getPassword())){
			this.userDao.register(user);
			System.out.println("Go to google.com/verify to verify your account.");
		}
	}

	@Override
	public void login(String email,String password) {
		if(ControlManager.emailControl(email)&&ControlManager.passwordControl(password)){
			if (this.userDao.login(email,password)) {
				System.out.println("Giriþ baþarýlý.");
			}else {
				System.out.println("Email veya þifre hatalý!");
			} 
		}
	}
}
