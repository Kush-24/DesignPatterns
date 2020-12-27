package kush.state;

public class Main {
public static void main(String[] args) {
	MusicState ms=new MusicState();
	
	State playState=new PlayState();
	playState.doSomething(ms);
	
	System.out.println(ms.getState());
	
	
	
	State pauseState=new PauseState();
	pauseState.doSomething(ms);
	
	System.out.println(ms.getState());
	
	
}
}
