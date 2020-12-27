package kush.factory;

import kush.factory.phone.OperatingSystem;

public class FactoryMain {

	public static void main(String[] args) {
		//OperatingSystem os=new Window();
		//os.specification();
		
		OSFactory osf=new OSFactory();
		OperatingSystem os=osf.getInstance("android");
		os.specification();
		
	}

}
