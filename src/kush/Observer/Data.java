package kush.Observer;

import java.util.ArrayList;

public class Data {
	// we can assume this data as a subject like youtube,fb or anything which has some data.
	
	private String message;
	private ArrayList<Observer> observers;
	 
	public Data() {
		observers=new ArrayList<>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	
	public void notifyObserver() {
		for(int i=0;i<observers.size();i++) {
			Observer ob=observers.get(i);
			ob.updateMessage(message);
		}
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
