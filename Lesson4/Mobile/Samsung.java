package Lesson4.Mobile;

public class Samsung extends Mobile{

	public Samsung(String name) {
		super(name);
		this.OS = "Android";
	}

	@Override
	public void call() {
		System.out.println("Samsung!!");
		//super.call();
	}
}
