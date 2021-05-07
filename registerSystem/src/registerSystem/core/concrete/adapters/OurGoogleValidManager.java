package registerSystem.core.concrete.adapters;

import registerSystem.core.abstracts.ProjectService;
import registerSystem.entities.concrete.User;
import registerSystem.googleValid.GoogleValidManager;

public class OurGoogleValidManager implements ProjectService{
	private GoogleValidManager googleValidManager;
	@Override
	public void isThere(User user) {
		this.googleValidManager=new GoogleValidManager();
		googleValidManager.isThere(user);
	}

}
