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
		
		// numbers �� ��ȸ �ϸ鼭 numbers �� ��Ҹ� ��� ��ȸ
//		for(int i=0; i<numbers.size(); i++) {
//			System.out.println(numbers.get(i));
//		}
		
		// for �� ���� ����Ǵ� ���� Iterator ��ü�� ���
		// ��ü���� ���õ� �͵� ���� ���ϵ��� Design Pattern
		
		// ListIterator ��ü�� �ʿ�
		ArrayListEx.ListIterator li = numbers.listIterator();
		
		// next �� ó�� ȣ��� ù ���Ҹ� ����
//		System.out.println(li.next());
//		// �� ���� ��� ����
//		System.out.println(li.next());
//		
//		// index �� ���� �� null �� ��ȯ
//		System.out.println(li.next());
//		System.out.println(li.next());
//		System.out.println(li.next());
//		System.out.println(li.next());
//		System.out.println(li.next());
//		System.out.println(li.next());
		
		// �ݺ������� ��ü
		// hasNext �� ���� ��Ұ� �ִ��� boolean return
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		li.next();
		
		// ���� ������Ʈ�� ã�� ���� �� 
		li.previous();

//		System.out.println(li.previous());
//		System.out.println(li.previous());
//		System.out.println(li.previous());
//		System.out.println(li.previous());
//		System.out.println(li.previous());
//		System.out.println(li.previous());
//		System.out.println(li.previous());
		
		// ���� ��� �ִ���
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}
	
	
}
