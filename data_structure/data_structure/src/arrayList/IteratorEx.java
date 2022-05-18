package arrayList;

import java.util.Iterator;

public class IteratorEx {
	
	
	public static void main(String[] args) {
		
		ArrayListEx numbers = new ArrayListEx();	
		
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		numbers.addLast(50);
		
		// numbers 를 순회 하면서 numbers 의 요소를 모두 순회
//		for(int i=0; i<numbers.size(); i++) {
//			System.out.println(numbers.get(i));
//		}
		
		// for 문 보다 권장되는 것이 Iterator 객체를 사용
		// 객체지향 관련된 것들 좋은 패턴들은 Design Pattern
		
		// ListIterator 객체가 필요
		ArrayListEx.ListIterator li = numbers.listIterator();
		
		// next 를 처음 호출시 첫 원소를 리턴
//		System.out.println(li.next());
//		// 두 번쨰 요소 리턴
//		System.out.println(li.next());
//		
//		// index 를 넘을 때 null 을 반환
//		System.out.println(li.next());
//		System.out.println(li.next());
//		System.out.println(li.next());
//		System.out.println(li.next());
//		System.out.println(li.next());
//		System.out.println(li.next());
		
		// 반복문으로 대체
		// hasNext 는 다음 요소가 있는지 boolean return
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		li.next();
		
		// 이전 엘리먼트롤 찾고 싶을 시 
		li.previous();

//		System.out.println(li.previous());
//		System.out.println(li.previous());
//		System.out.println(li.previous());
//		System.out.println(li.previous());
//		System.out.println(li.previous());
//		System.out.println(li.previous());
//		System.out.println(li.previous());
		
		// 이전 요소 있는지
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}
	
	
}
