package kush.iterator1;

public class Array implements Collection{

	private int arr[];
	private int len;
	
	public Array(int size) {
		arr=new int[size];
		len=0;
	}
	@Override
	public Iterator getIterator() {
		return new ArrayIterator(arr,len);
	}

	@Override
	public void insert(int data) {
		arr[len++]=data;
	}

}
