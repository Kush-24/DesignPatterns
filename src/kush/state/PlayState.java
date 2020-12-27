package kush.state;

// Behavioral classes
public class PlayState implements State{

	@Override
	public void doSomething(MusicState ms) {
		ms.setState(this); // set playstate class state in musicstate
	}
	
	public String toString() {
		return "Playing music";
	}

}
