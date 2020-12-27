package kush.decorator;

// This class contains the item obj which will be decorated with new functinalities.
abstract class PizzaDecorator implements Item {
private Item pizza;

public PizzaDecorator(Item item) {
	this.pizza=item;
}
public void prepare() {
	pizza.prepare();
}
}
