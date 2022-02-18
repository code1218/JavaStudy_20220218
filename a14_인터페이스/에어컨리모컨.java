package a14_인터페이스;

public class 에어컨리모컨 implements 버튼, 화면 {

	@Override
	public void showDisplay() {
		System.out.println("에어컨리모컨의 화면에 온도를 표시합니다.");
		
	}

	@Override
	public void onClick() {
		System.out.println("에어컨의 온도를 조절합니다.");
		
	}

}
