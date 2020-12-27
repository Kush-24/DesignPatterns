package kush.strategy;

public class UseStrategy {
	private MyStrategy strategy;

	public UseStrategy(MyStrategy st) {
		this.strategy = st;
	}
	
	public int[] performStrategy(int[] arr) {
		return strategy.sortArray(arr);
	}
	
}
