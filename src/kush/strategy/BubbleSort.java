package kush.strategy;

public class BubbleSort implements MyStrategy {

	@Override
	public int[] sortArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n ; i++) {
			for (int j = 1; j < n - i ; j++) {
				if (arr[j-1] > arr[j]) {
					// swap arr[j+1] and arr[j]
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

}
