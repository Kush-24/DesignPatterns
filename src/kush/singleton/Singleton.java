package kush.singleton;

public class Singleton {
	private static Singleton firstObj = null;
	private String name;

	private Singleton() {
	} // very imp

	public static Singleton getInstance() {
		if (firstObj == null)
			firstObj = new Singleton();
		return firstObj;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
