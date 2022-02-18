package a14_인터페이스;

public class TestMain {

	public static void main(String[] args) {
		InterfaceEx[] interfaceExs = new InterfaceEx[2];
		interfaceExs[0] = new Test1();
		interfaceExs[1] = new Test2();
		
		for(InterfaceEx ex : interfaceExs) {
			ex.printInfo();
		}
	}

}
