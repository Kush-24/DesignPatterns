package kush.singleton;

public class Test {
public static void main(String[] args) {
	//Singleton obj=new Singleton(); // not visible CE
	Singleton obj=Singleton.getInstance();
	obj.setName("Kushagra ");
	System.out.println(obj.getName() +" "+obj.hashCode());
	
	obj=Singleton.getInstance();
	System.out.println(obj.hashCode());
}
}
