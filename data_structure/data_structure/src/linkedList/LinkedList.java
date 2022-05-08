
package linkedList;



public class LinkedList {
	// 첫번째 노드를 가리키는 필드
	private Node head;
	private Node tail;
	private int size = 0;
	
	private class Node {
		public Object data;
		public Node next;
		public Node(Object input) {
			this.data = input;
			this.next = null;
		}
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	
	
}
