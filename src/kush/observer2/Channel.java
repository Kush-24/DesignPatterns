package kush.observer2;

import java.util.ArrayList;
import java.util.List;

// let it be a you tube channel.
public class Channel implements Subject{
	List<Subscriber> subs=new ArrayList<>();
	String title;
	
	@Override
	public void subscribe(Subscriber sub){
		subs.add(sub);
	}
	
	@Override
	public void unsubscribe(Observer s) {
		subs.remove(s);
	}
	
	@Override
	public void notifySubscribers() {
		// we notify all the subscriber of the channel when new video uploads.
		for(Observer s:subs) {
			s.update();
		}
	}
	
	@Override
	public void uploaded(String title) {
		this.title=title;
		notifySubscribers();
	}
	
}
