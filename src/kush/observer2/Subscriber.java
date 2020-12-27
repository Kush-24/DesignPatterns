package kush.observer2;

public class Subscriber implements Observer {
 
	private String name;
	private Channel ch=new Channel();
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void update() {
		System.out.println("Hey "+name+" Video uploaded "+ch.title);
	}
	@Override
	public void subscribeChanner(Channel channel) {
		ch=channel;
	}

}
