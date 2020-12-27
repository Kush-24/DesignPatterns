package kush.observer2;

public interface Subject {

	void subscribe(Subscriber sub);

	void unsubscribe(Observer s);

	void notifySubscribers();

	void uploaded(String title);

}