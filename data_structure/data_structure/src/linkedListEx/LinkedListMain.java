package linkedListEx;

import linkedList.LinkedList;

public class LinkedListMain extends LinkedListTest{
	
	public static void main(String[] args) {
		LinkedListTest numbers = new LinkedListTest();
		// Head ���ٰ� �����͸� �߰�
		numbers.addFirst(30);
		numbers.addFirst(20);
		numbers.addFirst(10);
		
		// Tail ���ٰ� �����͸� �߰�
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		
		// Ư���� index ��ġ�� �� 15�� ���� ���� 
		numbers.add(1, 15);
		numbers.add(2,  40);
		
		numbers.addLast(47);
		
		// Data �� ���� �ϱ�
		// ù��° Node �� ���� 
		Object removePrint = numbers.removeFirst();
		// ������ ���� return ������ 
		System.out.println(removePrint);
		
		// index �� ù�� �� Element �� 10 �� ������ �ִ� Node ��ü�� Return
		System.out.println(numbers.node(2));
		System.out.println(numbers.toString());
		
		// ���� �Ϸ��� index �� ���� ���� �� �� 
		numbers.remove(5);
		
		System.out.println(numbers.toString());
		
		// ���� ���� �ִ� Node ����
		numbers.removeLast();
		
		System.out.println(numbers.size());
		
		// � Ư���� ��ġ�� ���� return ���� �� 
		System.out.println(numbers.get(2));
		
		// � Ư���� ���� ��� �ε����� ��ġ�� �ִ����� return
		System.out.println(numbers.indexOf(300));
		
		LinkedListTest.ListIterator i = numbers.listIterator();
		
		System.out.println(i.next());
		System.out.println(i.next());
		
	}
	
}
