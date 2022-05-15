package arrayList;

public class ArrayListEx {
	
	// ���ο����� ����Ұ��̱⿡ private ���� ���� 
	// Object Ÿ�Կ� �����͸� ���� �Ͽ� private �����ڸ� ����
	// �ش� �迭�� ���� �� �� �ִ� ���� 100 ����, 100 ���� �����͸� ������ �� �ִ� �迭 
	// ���� �� ���¿��� 100 �� �̻� �߰� �� �� Error �߻�
	// Java ���� Collection Framework ArrayList �� �ڵ������� Ŀ�� 
	
	// �� �迭�ȿ� ����Ǿ� �ִ� ������ ����� �� �� �ְ� size ��� ������ ���������� ����
	private int size = 0;
	private Object[] elementData = new Object[100];
	
	// 0 ��° ��ġ�� �����͸� �߰��ϸ鼭 ������ �����͵��� �ϳ��� �ڷ� ���� 
	public boolean addFirst(Object element) {
		return add(0, element);
	}
	
	// ������ element �� ��� element �� �߰� ���� ��
	// �����͸� ���������� �� ���� �߰� ���� �� 
	public boolean addLast(Object element) {
		// ������ �߰� �ÿ��� elementData �� ����Ű�� ������ �߰��� �Ǿ�� ��
		// size �� ArrayList ���������� ���̴� ���� size �� ����
		// �����Ͱ� �ϳ��� ���� �� size �� 0 ���� �ʱ�ȭ�� �Ǿ�����
		elementData[size] = element;
		// size �� ���� 1�� ���� ������ 
		size++;
		return true;
	}
	
	// �����͸� �߰��� �߰� �ϴ� ��� ����
	// �߰� �ϴ� ����� �ش� �ε����� ���� �ְ� �����͵��� ��ĭ�� �ڷ� ��ܾ� �� 
	public boolean add(int index, Object element) {
		// elementData �� �ȿ��ִ� private ������ ������
		// �� ĭ �� �ڷ� ����ִ� ���� �ݺ������� �ٲپ��� 
		
		// size ������ 1�� �� �� �� 
		// ex -->  elementData[4] = elementData[3];
		
		for(int i=size-1; i >= index; i--) {
			elementData[i+1] = elementData[i];
		}
		
		// index �� �ش��ϴ� ��ġ�� elementData �� ���� (�߰�)
		elementData[index] = element;
		// size �� 1�� ���� (elementData �� �����Ͱ� �߰� �Ǿ����� ��)
		size++;
		return true;
	}
	
	// toString �̶�� �޼��带 ��� ���� ���� ���·� �����͸� ����� ���� 
	// Java ������ toString �̶�� �޼��带 ����Ͽ� 
	public String toString() {
		String str = "[";
		for(int i=0; i<size; i++) {
			// ����� �� �ְ� elementData[i] ���� ���
			str += elementData[i];
			// �� �������� Comma �� ������ �ʵ��� �� 
			if(i < size - 1) {
				str += ",";
			}
		}
		return str +  "]";
	}
	
	// �ش� index �� �����͸� ����
	public Object remove(int index) {
		// �����͸� ���� �ÿ��� �߰��ϴ� �Ͱ��� �� �ݴ�� �۵� 
		// �ش� index �� ������ �����ϸ� ���ڸ��� ����Ƿ�
		// �� �ڸ��� �޲پ�� �ϹǷ� ���ڸ��� ���� ���� ������ ��ĭ�� ��ܾ� ��
		
		// ���� �Ϸ��� ���� �ӽ÷� ����
		Object removed = elementData[index];
		
		for(int i=index+1; i<=size-1; i++) {
			elementData[i-1] = elementData[i];
		}
		// ���� �Ͽ��⿡ size �� ���� 1�� ���� ��Ŵ
		size--;
		// �� ���� ���� null �� ����
		elementData[size] = null;
		
		return removed;
	}
	
	public Object removeFirst() {
		// ù��° ���� ����
		return remove(0);
	}
	
	public Object removeLast() {
		// size �� ���̿��� 1�� ���ذ� return (�� ���� ���Ҹ� �����ϰ� return)
		return remove(size-1);
	}
	
	public Object get(int index) {
		return elementData[index];
	}

	// ������ ������� �ʰ� �޼���� �����ϴ� ������ �ܺο��� ������� ������ ����
	public int size() {
		return size;
	}
	
	public int indexOf(Object o) {
		for(int i=0; i<size; i++) {
			if(o.equals(elementData[i])) {
				// return �� for ���� ���� ����
				return i;
			}
		}
		
		// ã�� �� ���ٸ� �� Return ���� ���� �ϰ� ���� �� -1 �� return 
		return -1;
	}
	
	public ListIterator listIterator() {
		// ���ο� ListIterator ��ü�� ����� return
		return new ListIterator();
	}
	
	class ListIterator {
		
		private int nextIndex = 0;
		
		// ���� ������ �ִ� index �� size() �� ��
		public boolean hasNext() {
			return nextIndex < size();
		}
		
		// ȣ�� �� �� ���� 0 ���� �����Ͽ� 1 �� ����
		// ���� ��Ҹ� ������
		public Object next() {
//			Object returnData = elementData[nextIndex];
//			nextIndex++;	
//			return returnData;
			// ������ ���� ���� �� null �� ����
			return elementData[nextIndex++];
			
		}
		
		// ���� nextIndex ���� ���� ���� �������� ���� ��
		public Object previous() {
			// ���� ó�� ���Ҵ� ������ -1 �̹Ƿ� ������ index�� ����
			return elementData[--nextIndex];
		}
		
		public boolean hasPrevious() {
			// nextIndex �� 0 ���� ū �� 0 �̸� ���� ��Ұ� ����
			return nextIndex > 0;
		}
		
		public void add(Object element) {
			ArrayListEx.this.add(nextIndex++, element);
		}
		
		public void remove() {
			ArrayListEx.this.remove(nextIndex-1);
			nextIndex--;
		}
		
		
	}
	
}
