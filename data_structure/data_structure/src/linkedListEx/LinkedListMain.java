package linkedListEx;

import linkedList.LinkedList;

public class LinkedListMain extends LinkedListTest{
	
	public static void main(String[] args) {
		LinkedListTest numbers = new LinkedListTest();
		// Head 에다가 데이터를 추가
		numbers.addFirst(30);
		numbers.addFirst(20);
		numbers.addFirst(10);
		
		// Tail 에다가 데이터를 추가
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		
		// 특정하 index 위치에 값 15를 끼워 넣음 
		numbers.add(1, 15);
		numbers.add(2,  40);
		
		numbers.addLast(47);
		
		// Data 를 삭제 하기
		// 첫번째 Node 를 삭제 
		Object removePrint = numbers.removeFirst();
		// 삭제한 값을 return 시켜줌 
		System.out.println(removePrint);
		
		// index 에 첫번 쨰 Element 인 10 을 가지고 있는 Node 객체를 Return
		System.out.println(numbers.node(2));
		System.out.println(numbers.toString());
		
		// 삭제 하려는 index 에 값을 지정 해 줌 
		numbers.remove(5);
		
		System.out.println(numbers.toString());
		
		// 제일 끝에 있는 Node 삭제
		numbers.removeLast();
		
		System.out.println(numbers.size());
		
		// 어떤 특정한 위치에 값을 return 시켜 줌 
		System.out.println(numbers.get(2));
		
		// 어떤 특정한 값이 어디 인덱스에 위치해 있는지는 return
		System.out.println(numbers.indexOf(300));
		
		LinkedListTest.ListIterator i = numbers.listIterator();
		
		System.out.println(i.next());
		System.out.println(i.next());
		
	}
	
}
