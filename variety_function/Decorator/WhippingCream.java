package Decorator;

public class WhippingCream extends Decorator{

	public WhippingCream(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}

	public void brewing() {
		super.brewing();
		System.out.println("Adding Whipping Cream");
	}
}
