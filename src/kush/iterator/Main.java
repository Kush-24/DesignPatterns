package kush.iterator;

public class Main {

	public static void main(String[] args) {
		StudentRepo st=new StudentRepo();
		Iterator it=st.getIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
