package kush.Observer;

public class Student implements Observer{
	private String message;
	
	// now student have control to subscribe or unsubscribe the data.
	public Student(Data data) {
		data.registerObserver(this);
	}
	@Override
	public void updateMessage(String message) {
		this.message=message;
		this.display();
	}

	@Override
	public void display() {
		System.out.println(this.message);
	}

}
