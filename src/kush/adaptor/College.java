package kush.adaptor;

public class College {
	public static void main(String[] args) {
		AssignmentWork aw=new AssignmentWork();
		//aw.writeAssignment("I am writing my assignment"); // CE pen object we dont have.
		
	// we can't use directly friends pen to write assign. We need adaptor.
	// bcz we don't have access over friendpen class.
		Pen p=new PenAdaptor();
		aw.setP(p);
		aw.writeAssignment("I am writing assignment");
	}
}
