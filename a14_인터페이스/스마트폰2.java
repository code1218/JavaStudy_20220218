package a14_인터페이스;

public class 스마트폰2 implements 버튼, 화면{

	@Override
	public void showDisplay() {
		System.out.println("스마트폰2 화면을 켭니다.");
		
	}

	@Override
	public void onClick() {
		System.out.println("스마트폰2 전원을 켭니다.");
		
	}

}
