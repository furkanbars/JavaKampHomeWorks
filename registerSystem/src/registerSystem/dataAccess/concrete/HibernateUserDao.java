package registerSystem.dataAccess.concrete;

import java.util.ArrayList;

import registerSystem.dataAccess.abstracts.UserDao;
import registerSystem.entities.concrete.User;

public class HibernateUserDao implements UserDao{
	private ArrayList<User> users=new ArrayList<User>();
	
	@Override
	public void register(User user) {
		users.add(user);
		System.out.println(user.getFirstName()+" "+user.getLastName()+" kiþisi kayýt oldu.");
	}

	@Override
	public boolean login(String email,String password) {
		for(User userOne:users) {
			if (userOne.getEmail()==email&&userOne.getPassword()==password) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void remove(User user) {
		this.users.remove(user.getId());
	}

	@Override
	public ArrayList<User> getAll() {
		return users;
	}

}
