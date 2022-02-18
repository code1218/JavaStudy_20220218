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
		for(int i = 0; i < users.length; i++) {
			if(users[i] == null) {
				User user = new User();
				System.out.print("사용자 이름(아이디) >>> ");
				user.setUsername(scanner.nextLine());
				System.out.print("비밀번호 >>> ");
				user.setPassword(scanner.nextLine());
				System.out.print("이름 >>> ");
				user.setName(scanner.nextLine());
				System.out.print("이메일 >>> ");
				user.setEmail(scanner.nextLine());
				
				users[i] = user;
				return;
			}
		}
		System.out.println("더이상 회원가입을 할 수 없습니다.");
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
