package kush.adaptor;

public class PenAdaptor implements Pen{

	FriendPen fp=new FriendPen();
	@Override
	public void write(String str) {
		fp.writingAssign(str);
	}
	

}
