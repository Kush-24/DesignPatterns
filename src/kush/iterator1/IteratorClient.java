package kush.iterator1;

public class IteratorClient{
	
	public static void main(String[] args) {
		Collection arr=new Array(5);
		arr.insert(10);
		arr.insert(20);
		arr.insert(30);
		arr.insert(40);
		arr.insert(50);
		
		Collection list=new LinkedList();
		list.insert(11);
		list.insert(22);
		list.insert(33);
		
		
		Iterator it=arr.getIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		it=list.getIterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" - > ");
		}
	}

}
