package registerSystem.dataAccess.abstracts;

import java.util.ArrayList;

import registerSystem.entities.concrete.User;

public interface UserDao {
	void register(User user);
	boolean login(String email,String password);
	void remove(User user);
	ArrayList<User> getAll();
}
