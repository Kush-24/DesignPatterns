package kush.iterator;

public class StudentRepo implements Collection{
 String students[]= {"kushagra","sunny","tanu","sandy"};
 
	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	
	private class NameIterator implements Iterator{
        int index=0;
		@Override
		public boolean hasNext() {
			if(index < students.length)
				return true;
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()) {
				return students[index++];
			}
			return null;
		}
		
	}
}
