package kush.factory;

import kush.factory.phone.Android;
import kush.factory.phone.Ios;
import kush.factory.phone.OperatingSystem;
import kush.factory.phone.Window;

public class OSFactory {
	public OperatingSystem getInstance(String str) {
		if (str.equalsIgnoreCase("Window"))
			return new Window();
		else if (str.equalsIgnoreCase("Android"))
			return new Android();
		else if (str.equalsIgnoreCase("ios"))
			return new Ios();
		else
			return null;
	}
}
