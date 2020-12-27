package kush.composite;
// Tree structure design patter where root class obj contents all its child obj.
// One object can have multiple object.
// Whatever operation you perform on leaf node the same operation will perform on composite obj.  	
public class CompositeTest {

	public static void main(String[] args) {
		Component hd=new Leaf(4000,"HDD");
		Component mouse=new Leaf(500,"MOUSE");
		Component monitor=new Leaf(8000,"MONITOR");
		Component ram=new Leaf(3000,"RAM");
		Component cpu=new Leaf(9000,"CPU");
		
		
		Composite peripheral=new Composite("Peripheral");
		Composite cabinet=new Composite("Cabinet");
		Composite motherBoard=new Composite("Mother Board");
		Composite computer=new Composite("Computer");
		
		motherBoard.addComponents(cpu);
		motherBoard.addComponents(ram);
		
		peripheral.addComponents(mouse);
		peripheral.addComponents(monitor);
		
		cabinet.addComponents(hd);
		cabinet.addComponents(motherBoard);
		
		computer.addComponents(peripheral);
		computer.addComponents(cabinet);
		
		mouse.showPrice();
		
		motherBoard.showPrice();
		
		peripheral.showPrice();
		
		cabinet.showPrice();
		
		computer.showPrice();
		
		
		
	}

}
