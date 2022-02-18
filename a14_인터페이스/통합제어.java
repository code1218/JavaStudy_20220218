package a14_인터페이스;

public class 통합제어 {

	public static void main(String[] args) {
		버튼 button = new 스마트폰2();
		버튼 button2 = new 에어컨리모컨();
		
		button.onClick();
		button2.onClick();
		
		화면 display = new 스마트폰();
		화면 display2 = new 에어컨리모컨();
		
		display.showDisplay();
		display2.showDisplay();
	}

}
