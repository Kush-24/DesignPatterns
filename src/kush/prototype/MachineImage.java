package kush.prototype;

/*Use :
 * To improve the performance when obj creation is costly and time consuming.
 * To simplify and optimize multiple obj creation that will have mostly the same.
 */
public class MachineImage implements Cloneable{

	StringBuilder image;
	
	public MachineImage(String os, String antivirus) {
		image=new StringBuilder();
		image.append(os).append(" + "+antivirus);
	}
	
	private MachineImage(String sw) {
		image=new StringBuilder(sw);
	}
	
	public void install(String sw) {
		image.append(sw);
	}
	
	public void printSw() {
		System.out.println(image);
	}
	
	@Override
	public MachineImage clone() throws CloneNotSupportedException {
		return new MachineImage(this.image.toString());
	}
	
}
