package arrayList;

public class IteratorEx_02 {
	
	public static void main(String[] args) {
			
		ArrayListEx numbers = new ArrayListEx();
		
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		numbers.addLast(50);
		numbers.addLast(60);
		
		ArrayListEx.ListIterator li = numbers.listIterator();
		
		while(li.hasNext()) {
			int number = (int)li.next();
			if(number == 30) {
				li.add(35);
			}
		}
			
		System.out.println(numbers);
		
		
	}
	
}
