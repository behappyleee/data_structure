package arrayList;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListMain {
	
	// ArrayList 는 내부적으로 배열을 사용 
	
	public static void main(String[] args) {
		// ArrayList 객체 사용 
		ArrayListEx numbers = new ArrayListEx();
		
		// addLast 구현 (가장 마지막에 add 기능 구현)
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		
		// 데이터를 중간에 추가 하는 메서드 구현
		// 1 index 에 15 값을 추가 하기 
		numbers.add(1, 15);
		
		numbers.add(4, 70);
		
		// 첫번째 위치에 데이터를 추가
		numbers.addFirst(5);
		numbers.addFirst(35);
		
		// 삭제 한 값을 return 
		System.out.println("삭제 값 : " + numbers.remove(1));
		System.out.println("삭제 값 : " + numbers.remove(2));
		
		
		// toString 메서드를 정의하였으므로 설정한대로 값이 출력이 됨 
		System.out.println(numbers);
		
		// index 2 번째꺼를 get 하기 
		System.out.println(numbers.get(2));
		
		// 이 해당 List 가 몇개의 Element 를 가지고 있는지
		System.out.println(numbers.size());
		
		// 검색 기능을 구현 (조회 시에는 전체 List 를 순회하면서 있는지 없는지 Check)
		System.out.println(numbers.indexOf(20));
		JOptionPane a = new JOptionPane();
		
		// a.showMessageDialog(a, "Jso");
		
		
		
		// Java 기본 Collection Framework ArrayList 는 기능이 많이 존재 
		ArrayList ex = new ArrayList();
		
	}
	
	
}
