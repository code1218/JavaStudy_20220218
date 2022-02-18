package a14_인터페이스2.Controller;

import java.util.Scanner;

import a14_인터페이스2.Controller.Service.UserService;
import a14_인터페이스2.Controller.Service.UserServiceImpl;
import a14_인터페이스2.Model.User;
import a14_인터페이스2.View.MainView;
import a14_인터페이스2.View.SignupView;
import a14_인터페이스2.View.View;

public class UserController {
	public static void main(String[] args) {
		User[] users = new User[10];
		boolean loopFlag = true;
		
		Scanner scanner = new Scanner(System.in);
		View mainView = new MainView();
		UserService userService = new UserServiceImpl(scanner);
		
		userService.setUsers(users);
		
		while(loopFlag) {
			mainView.show();
			System.out.print("명령을 입력하세요: ");
			int select = scanner.nextInt();
			scanner.nextLine();
			
			if(select == 1) {
				View signupView = new SignupView();
				signupView.show();
				userService.createUser();
			}else if(select == 2) {
				
			}else if(select == 3) {
				System.out.print("프로그램을 종료하시겠습니까?(y/n) ");
				char select2 = scanner.next().charAt(0);
				scanner.nextLine();
				if(select2 == 'y' || select2 == 'Y') {
					loopFlag = false;
				}
			}else {
				System.out.println("지원하지 않는 명령입니다.");
			}
			System.out.println();
		}
		
		System.out.println("프로그램이 종료되었습니다.");
	}
}
