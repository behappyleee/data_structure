package linkedListEx;

public class LinkedListTest {
	private Node head;
	private Node tail;
	private int size = 0;
	
	private class Node {
		private Object data;
		private Node next;
		private Node (Object input) {
			this.data = input;
			this.next = null;
		}
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	
	public void addFirst(Object input) {
		// Node ��� Class �� ��üȭ �� 
		// ���������� ������ ���� 30 Next �� Null �� ������ ��
		Node newNode = new Node(input);
		
		// Node �� Head / Tail / Size �� List �� ���������� �����ϴ� ��������
		newNode.next = head;
		head = newNode;
		size++;
		// next �� �������� �ʴ´ٸ� ���� ���� head �� �� tail
		if(head.next == null) {
			tail = head;
		}
	}
	
	public void addLast(Object input) {
		Node newNode = new Node(input);
		// size �� 0 �̸� ������ �����Ͱ� ���� ���� ����
		// �����Ͱ� ���� �����̸� �����͸� ���ʿ� �ִ� ���ʿ� �ִ� ����� �����Ƿ�
		// addFirst �� �̿��Ͽ� �����͸� ����
		if(size == 0) {
			addFirst(input);
		} else {
			// �����Ͱ� ���� ���� �� �� tail �� ���� ���� ���� 
			// ���� ���� �ִ� ��� �ڿ� �ٰ� �� �� 
			tail.next = newNode ;
			tail = newNode;
			size++;
		}
	}
	
	// public ���� �� �ܺο��� ��� ���ɼ��� �־� public �� �����ֱ� 
	Node node (int index) {
		// Ž���� ���Ͽ����� ù��° List �� ã�ư��� �� 
		// ù�� ° ��带 ã�ư��� �� (ù��° Node �� Head)
		// head ���� ���� x �� ��� ���� 
		Node x = head;
		// x.next �� index �� ��ȣ�� �����ϰ� �ݺ� 
		// x = x.next;
		// x = x.next;
		// index ��ŭ �ݺ��ϱ� 
		for(int i = 0; i<index; i++) {
			x = x.next;
		}
		return x;
	}
	
	// add � Ư���� index �� ���� ���� ���� 
	public void add(int k, Object input) {
		// k ���� 0 �� ��� ù���� ��ġ�� ���� 
		if(k == 0) {
			addFirst(input);
		} else {
			// �߰��� �Ϸ��� �߰��Ϸ��� index �� ���� Node �� �˰� �־�� �� 
			// node �޼���� Node ���������� value ���� ���� �� 
			Node temp1 = node(k-1);	// �����Ϸ��� index �� ���� ��
			Node temp2 = temp1.next; 	// �����Ϸ��� index �� �� 
			Node newNode = new Node(input);	// ���ο� ������ Node ����
			temp1.next = newNode;	// ���� index �� ���� ���� Next �� ���ο� ���� �Ϸ��� ������ ���� 
			newNode.next = temp2;	// ���ο� ��忡 ���� �����δ� temp2 (�����Ϸ��� index�� ���� ������ ����)
			size++;	// ũ�� 1���� Ű�� 
			
			// ���ο� newNode �� ���� ���� null �̸� tail �� ����
			// �� ���ο� �� �ε��� �Ϸ��� ��ġ�� tail index �� 
			if(newNode.next == null) {
				tail = newNode;
			}
		}
	}
	
	public String toString() {
		// Data �� �ϳ��� ���� ��� (null �� ���)
		if(head == null) {
			return "";
		}
		Node temp = head;
		String str = "[";
		// ������ �κ��� null �� ��� �ش� ���� ������ ���� ���� 
		while(temp.next != null) {
			str += temp.data + ", ";
			temp = temp.next;
		}
		str += temp.data;
		return str + "]";
	}
	
	// Java �⺻�� ������ ���� Return �� ���� �� 
	public Object removeFirst() {
		// ���� �� ���� return �����־�� �� 
		Node temp = head;
		head = head.next;
		Object returnData = temp.data;
		temp = null;
		size--;
		return returnData;
	}
	
	// index k �� Node �� ����
	public Object remove(int k) {
		//  �����Ϸ��� index ���� 0 �Ͻ� �׳� removeFirst �޼���� Node ����
		if(k == 0) {
			return removeFirst();
		} else {
			// ������ �Ѵٴ� ���� Linked ���� Link �� ����� 
			// �����Ϸ��� �ϴ� ���� Node �� �˾ƾ� �� 	
			Node temp = node(k-1);
			
			// �����Ϸ��� Node �� temp �� �����Ϸ��� Node �� ���� ���� 
			Node todoDeleted = temp.next;
			
			// ������ ���Ͽ����� ���� ��忡�� ���� ���� �����ϴ� index�� ���� ������ ���� 
			temp.next = temp.next.next; // �̰��̶� temp.next = node(k+1) �� �k ����
			Object returnData = todoDeleted.data;
			
			// ���� �Ϸ��� Node �� tail �� �� tail �� temp �� ���� 
			if(todoDeleted == tail) {
				tail = temp;
			}
			todoDeleted = null;
			size--;
			return returnData;
		}
	}
	
	// ������ Node ���� �� size ���� 1 �� �� �� ������ index �� Node �� ����
	public Object removeLast() {
		return remove(size - 1);
	}
	
	// size �� size ũ�⸦ return �� �� 
	public int size() {
		return size;
	}
	
	// k �ε��� ���� Ư���� ���� return ���� �� 
	public Object get(int k) {
		Node temp = node(k);
		return temp.data;
	}
	
	// � Ư���� ���� index �� return ������
	public int indexOf(Object data) {
		Node temp = head;
		int index = 0;
		while(temp.data != data) {
			temp = temp.next;
			index++;
			// ã�� ���� ���� �� -1 �� return ���� �� (ã�� ���� �������� ���� ��)
			if(temp == null) {
				return -1;
			}
		}
		return index;
	}
	
	public ListIterator listIterator() {
		return new ListIterator();
	}
	
	class ListIterator {
		
		// ó�� ListIteraotr �� ������ �� next �� �ʱ� ȭ
		private Node next;
		private Node lastReturned;
		private int nextIndex;
		
		// �ʱ�ȭ�� ���� ��
		ListIterator() {
			next = head;
		}
		
		// next �޼��� ȣ�� �� ù��° node �� ���� return �� �Ǹ� 
		// �� ���� next ���� ȣ���� �� �� �� ���� ���� ����Ŵ 
		// next �޼��� ȣ�� �� ���� ����Ű�� �ִ� ����� ���� ���� next ������ ���� 
		public Object next() {
			// next ��� ���� �� 
			lastReturned = next;
			next = next.next;
			nextIndex++;
			return lastReturned.data;
		}
		
	}
	
}


