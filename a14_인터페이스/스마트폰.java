package a14_인터페이스;

public class 스마트폰 implements 버튼, 화면{

	@Override
	public void showDisplay() {
		System.out.println("스마트폰 화면을 켭니다.");
		test();
	}
	
	public void test() {
		System.out.println("test");
	}

	@Override
	public void onClick() {
		System.out.println("스마트폰 전원을 켭니다.");
		
	}

}
