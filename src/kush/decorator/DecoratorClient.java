package kush.decorator;

public class DecoratorClient {

	public static void main(String[] args) {
		Item order[]= {new Deepfry(new Pizza()), new Deepfry(new DoubleCheese(new Pizza()))};
		for(Item item:order) {
			item.prepare();
			System.out.println();
		}
		
		Pizza p=new Pizza();
		Deepfry deep=new Deepfry(p);
		deep.prepare();
		
		Pizza p1=new Pizza();
		DoubleCheese cheese=new DoubleCheese(p1);
		Deepfry d=new Deepfry(cheese);
		d.prepare();
		
	}

}
