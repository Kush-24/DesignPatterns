package kush.Observer;

public class Main {
/*
 *  Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified,
 * its depenedent objects are to be notified automatically. 
 * Observer pattern falls under behavioral pattern category.
 * ex. Youtube subscriber , if someone subscribe channel only channel admin get to know but if channel 
 * upload any video it notify to all its subscriber.
 */
	public static void main(String[] args) {
		Data data=new Data();
		Observer stud=new Student(data);
		String msg="Hello world";
		data.setMessage(msg);
		
		if(!data.getMessage().equals(""))
			data.notifyObserver();
		
		data.removeObserver(stud);
		
		
	}

}
