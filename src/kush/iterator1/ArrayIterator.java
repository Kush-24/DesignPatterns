package kush.iterator1;

public class ArrayIterator implements Iterator{
	private int index;
	private int arr[];
	private int len;
	public ArrayIterator(int[] arr, int len) {
		this.arr=arr;
		this.len=len;
		index=0;
	}

	@Override
	public boolean hasNext() {
		return index < len;
	}

	@Override
	public int next() {
	 if(hasNext()) {
		 return arr[index++];
	 }
	 return -1;
	}

}
