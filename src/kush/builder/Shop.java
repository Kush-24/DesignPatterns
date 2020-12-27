package kush.builder;

public class Shop {
public static void main(String[] args) {
  //	Phone ph=new Phone("android", 4,"quadcore", 6, 4000);

	Phone ph=new PhoneBuilder().setOs("ios").setRam(8).setProcessor("quadcore").getPhone();
	System.out.println(ph);
	
}
}
