package a14_인터페이스2.View;

public class MainView implements View {

	@Override
	public void showDtl() {
		System.out.println("[회원관리 프로그램]");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 프로그램 종료");
	}

}
