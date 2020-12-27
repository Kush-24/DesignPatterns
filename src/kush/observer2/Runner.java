package kush.observer2;

public class Runner {
 public static void main(String[] args) {
	Channel code=new Channel();
	
	Subscriber s1=new Subscriber("Kush");
	Subscriber s2=new Subscriber("yadav");
	Subscriber s3=new Subscriber("rahul");
	Subscriber s4=new Subscriber("sandy");
	
	// code channel add these subscriber as there subscriber.
	code.subscribe(s1);
	code.subscribe(s2);
	code.subscribe(s3);
	code.subscribe(s4);
	
	s1.subscribeChanner(code); // s1 subscribe channel name code.
	s2.subscribeChanner(code);
	s3.subscribeChanner(code);
	s4.subscribeChanner(code);
	
	// code channel will upload new video 
	code.uploaded("Learn design pattern..");
	
}
}
