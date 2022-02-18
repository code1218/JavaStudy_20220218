package a14_인터페이스2.Controller.Service;

import a14_인터페이스2.Model.User;

public interface UserService {
	
	public void setUsers(User[] users);
	
	public void createUser();
	public User[] getUserAll();
	public User getUserByUsername(String username);
	public void updateUser();
	public void deleteUser();
}
