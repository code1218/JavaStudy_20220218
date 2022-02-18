package a14_인터페이스2.Controller.Service;

import java.util.Scanner;

import a14_인터페이스2.Model.User;

public class UserServiceImpl implements UserService {
	private User[] users;
	private Scanner scanner;
	
	public UserServiceImpl() {
		
	}
	
	public UserServiceImpl(Scanner scanner) {
		this.scanner = scanner;
	}

	@Override
	public void setUsers(User[] users) {
		this.users = users;
	}
	
	@Override
	public void createUser() {
		System.out.print("사용자 이름(아이디) >>> ");
		System.out.print("비밀번호 >>> ");
		System.out.print("이름 >>> ");
		System.out.print("이메일 >>> ");
	}

	@Override
	public User[] getUserAll() {
		return null;
	}

	@Override
	public User getUserByUsername(String username) {
		return null;
	}

	@Override
	public void updateUser() {
		
	}

	@Override
	public void deleteUser() {
		
	}

}
