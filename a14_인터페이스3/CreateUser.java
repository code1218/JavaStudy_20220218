package a14_인터페이스3;

import java.util.Scanner;

import a14_인터페이스2.Model.User;

public class CreateUser {
	
	private User[] users = new User[3];
	private Scanner scanner = new Scanner(System.in);
	
	public void createUser() {
		for(int i = 0; i < users.length; i++) {
			if(users[i] == null) {
				User user = new User();
				System.out.print("사용자 이름 입력 >>> ");
				user.setUsername(scanner.nextLine());
				
				users[i] = user;
				return;
			}
		}
		System.out.println("회원가입 할 수 없습니다.");
	}

	public static void main(String[] args) {
		CreateUser createUser = new CreateUser(); //main 
		
		for(int i = 0; i < 4; i++) { //총 4번 반복할거다.
			
			createUser.createUser();
			
			for(User user : createUser.users) {
				if(user == null) {
					System.out.println("null");
				}else {					
					System.out.println(user.toString());
				}
			}
			
		}
		

	}

}
