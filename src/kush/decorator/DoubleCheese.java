package kush.decorator;

public class DoubleCheese extends PizzaDecorator{

	public DoubleCheese(Item item) {
		super(item);
	}
	public void prepare() {
		super.prepare();
		System.out.print(" + double cheese.");
	}
}
