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
		// Node 라는 Class 가 객체화 됨 
		// 내부적으로 데이터 값은 30 Next 는 Null 로 지정이 됨
		Node newNode = new Node(input);
		
		// Node 는 Head / Tail / Size 는 List 가 내부적으로 유지하는 변수들임
		newNode.next = head;
		head = newNode;
		size++;
		// next 가 존재하지 않는다면 단일 노드라서 head 가 곧 tail
		if(head.next == null) {
			tail = head;
		}
	}
	
	public void addLast(Object input) {
		Node newNode = new Node(input);
		// size 가 0 이면 기존에 데이터가 존재 하지 않음
		// 데이터가 없는 상태이면 데이터를 앞쪽에 넣던 뒷쪽에 넣던 상관이 없으므로
		// addFirst 를 이용하여 데이터를 삽입
		if(size == 0) {
			addFirst(input);
		} else {
			// 데이터가 없는 상태 일 시 tail 이 존재 하지 않음 
			// 제일 끝에 있는 노드 뒤에 붙게 해 줌 
			tail.next = newNode ;
			tail = newNode;
			size++;
		}
	}
	
	// public 붙을 시 외부에서 사용 가능성이 있어 public 은 지워주기 
	Node node (int index) {
		// 탐색을 위하여서는 첫번째 List 를 찾아가야 함 
		// 첫번 째 노드를 찾아가야 함 (첫번째 Node 는 Head)
		// head 값을 변수 x 에 담아 놓음 
		Node x = head;
		// x.next 를 index 에 번호와 동일하게 반복 
		// x = x.next;
		// x = x.next;
		// index 만큼 반복하기 
		for(int i = 0; i<index; i++) {
			x = x.next;
		}
		return x;
	}
	
	// add 어떤 특정한 index 에 값을 끼워 넣음 
	public void add(int k, Object input) {
		// k 값이 0 인 경우 첫번쨰 위치에 넣음 
		if(k == 0) {
			addFirst(input);
		} else {
			// 추가를 하려면 추가하려는 index 에 이전 Node 를 알고 있어야 함 
			// node 메서드는 Node 내부적으로 value 값을 가져 옴 
			Node temp1 = node(k-1);	// 삽입하려는 index 에 이전 값
			Node temp2 = temp1.next; 	// 삽입하려는 index 에 값 
			Node newNode = new Node(input);	// 새로운 삽입할 Node 생성
			temp1.next = newNode;	// 삽입 index 에 이전 값에 Next 는 새로운 대입 하려는 값으로 지정 
			newNode.next = temp2;	// 새로운 노드에 다음 값으로는 temp2 (삽입하려눈 index에 다음 값으로 지정)
			size++;	// 크기 1으로 키움 
			
			// 새로운 newNode 에 다음 값이 null 이면 tail 로 지정
			// 즉 새로운 값 인덱스 하려는 위치가 tail index 임 
			if(newNode.next == null) {
				tail = newNode;
			}
		}
	}
	
	public String toString() {
		// Data 가 하나도 없는 경우 (null 인 경우)
		if(head == null) {
			return "";
		}
		Node temp = head;
		String str = "[";
		// 마지막 부분이 null 인 경우 해당 구문 실행이 되지 않음 
		while(temp.next != null) {
			str += temp.data + ", ";
			temp = temp.next;
		}
		str += temp.data;
		return str + "]";
	}
	
	// Java 기본은 삭제한 값을 Return 을 시켜 줌 
	public Object removeFirst() {
		// 삭제 한 값을 return 시켜주어야 함 
		Node temp = head;
		head = head.next;
		Object returnData = temp.data;
		temp = null;
		size--;
		return returnData;
	}
	
	// index k 에 Node 를 삭제
	public Object remove(int k) {
		//  삭제하려는 index 값에 0 일시 그냥 removeFirst 메서드로 Node 삭제
		if(k == 0) {
			return removeFirst();
		} else {
			// 삭제를 한다는 것은 Linked 에서 Link 가 사라짐 
			// 삭제하려고 하는 이전 Node 를 알아야 함 	
			Node temp = node(k-1);
			
			// 삭제하려는 Node 임 temp 는 삭제하려는 Node 에 이전 값임 
			Node todoDeleted = temp.next;
			
			// 삭제를 위하여서는 이전 노드에서 다음 값을 삭제하는 index에 다음 값으로 지정 
			temp.next = temp.next.next; // 이것이랑 temp.next = node(k+1) 랑 똩 같음
			Object returnData = todoDeleted.data;
			
			// 삭제 하려는 Node 가 tail 일 시 tail 을 temp 로 지정 
			if(todoDeleted == tail) {
				tail = temp;
			}
			todoDeleted = null;
			size--;
			return returnData;
		}
	}
	
	// 마지막 Node 삭제 시 size 에서 1 을 뺴 준 마지막 index 에 Node 를 삭제
	public Object removeLast() {
		return remove(size - 1);
	}
	
	// size 는 size 크기를 return 해 줌 
	public int size() {
		return size;
	}
	
	// k 인덱스 값에 특정한 값을 return 시켜 줌 
	public Object get(int k) {
		Node temp = node(k);
		return temp.data;
	}
	
	// 어떤 특정한 값에 index 를 return 시켜줌
	public int indexOf(Object data) {
		Node temp = head;
		int index = 0;
		while(temp.data != data) {
			temp = temp.next;
			index++;
			// 찾는 값이 없을 시 -1 을 return 시켜 줌 (찾는 값이 존재하지 않을 시)
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
		
		// 처음 ListIteraotr 가 생성될 시 next 값 초기 화
		private Node next;
		private Node lastReturned;
		private int nextIndex;
		
		// 초기화를 시켜 줌
		ListIterator() {
			next = head;
		}
		
		// next 메서드 호출 시 첫번째 node 의 값이 return 이 되며 
		// 그 다음 next 값이 호출이 될 시 그 다음 값을 가르킴 
		// next 메서드 호출 시 현재 가르키고 있느 노드의 다음 노드로 next 값으로 변경 
		public Object next() {
			// next 라는 변수 는 
			lastReturned = next;
			next = next.next;
			nextIndex++;
			return lastReturned.data;
		}
		
	}
	
}


