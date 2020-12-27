package kush.composite;

import java.util.ArrayList;
import java.util.List;

interface Component{
	void showPrice();
}

class Leaf implements Component{
	private int price;
	private String name;
	
	public Leaf(int price,String name) {
		this.price=price;
		this.name=name;
	}
	@Override
	public void showPrice() {
		System.out.println(name+" : "+price);
	}
	
}

class Composite implements Component{
	String name;
	List<Component> components =new ArrayList<>();
	
	
	
	public Composite(String name) {
		super();
		this.name = name;
	}

	public void addComponents(Component comp) {
		components.add(comp);
	}
	
	@Override
	public void showPrice() {
		System.out.println(name);
		
		for(Component com:components) {
			com.showPrice();
		}
	}
	
}

