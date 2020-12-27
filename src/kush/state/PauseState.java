package kush.state;

// Behavioral classes
public class PauseState implements State{

	@Override
	public void doSomething(MusicState ms) {
		ms.setState(this); // set pausingstate class state in musicstate
	}
	
	public String toString() {
		return "Pausing music";
	}

}
