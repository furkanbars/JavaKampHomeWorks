package registerSystem.business.abstracts;

import registerSystem.entities.concrete.User;

public interface UserService {
	void register(User user);
	void login(String email,String password);
}
