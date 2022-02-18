package a14_인터페이스2.View;

public interface View {
	public default void show() {
		showDtl();
		System.out.println();
	};
	
	public void showDtl();
}
