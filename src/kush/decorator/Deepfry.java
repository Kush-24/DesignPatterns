package kush.decorator;

public class Deepfry extends PizzaDecorator{

	public Deepfry(Item item) {
		super(item);
	}
	public void prepare() {
		super.prepare();
		System.out.print(" + deep fried.");
	}

}
