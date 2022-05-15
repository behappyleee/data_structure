package arrayList;

public class ArrayListEx {
	
	// 내부에서만 사용할거이기에 private 으로 선언 
	// Object 타입에 데이터를 생성 하여 private 접근자를 생성
	// 해당 배열에 수용 할 수 있는 값은 100 개임, 100 개에 데이터만 수용할 수 있는 배열 
	// 현재 이 상태에서 100 개 이상 추가 될 시 Error 발생
	// Java 에서 Collection Framework ArrayList 는 자동적으로 커짐 
	
	// 이 배열안에 저장되어 있는 값들은 몇개인지 알 수 있게 size 라는 변수를 내부적으로 유지
	private int size = 0;
	private Object[] elementData = new Object[100];
	
	// 0 번째 위치에 데이터를 추가하면서 나머지 데이터들을 하나씩 뒤로 밀음 
	public boolean addFirst(Object element) {
		return add(0, element);
	}
	
	// 마지막 element 에 요소 element 를 추가 시켜 줌
	// 데이터를 순차적으로 맨 끝에 추가 시켜 줌 
	public boolean addLast(Object element) {
		// 데이터 추가 시에는 elementData 가 가리키는 변수에 추가가 되어야 함
		// size 는 ArrayList 내부적으로 쌓이는 값을 size 가 관리
		// 데이터가 하나도 없을 시 size 는 0 으로 초기화가 되어있음
		elementData[size] = element;
		// size 의 값을 1을 증가 시켜줌 
		size++;
		return true;
	}
	
	// 데이터를 중간에 추가 하는 기능 구현
	// 추가 하는 기능은 해당 인덱스에 값을 넣고 데이터들을 한칸씩 뒤로 댕겨야 함 
	public boolean add(int index, Object element) {
		// elementData 는 안에있는 private 데이터 변수임
		// 한 칸 씩 뒤로 댕겨주는 것을 반복문으로 바꾸어줌 
		
		// size 값에서 1을 뺀 값 이 
		// ex -->  elementData[4] = elementData[3];
		
		for(int i=size-1; i >= index; i--) {
			elementData[i+1] = elementData[i];
		}
		
		// index 에 해당하는 위치에 elementData 를 대입 (추가)
		elementData[index] = element;
		// size 를 1을 증가 (elementData 에 데이터가 추가 되었으면 서)
		size++;
		return true;
	}
	
	// toString 이라는 메서드를 사용 보기 편한 형태로 데이터를 출력이 가능 
	// Java 에서는 toString 이라는 메서드를 사용하여 
	public String toString() {
		String str = "[";
		for(int i=0; i<size; i++) {
			// 출력할 수 있게 elementData[i] 값을 출력
			str += elementData[i];
			// 맨 마지막에 Comma 를 붙이지 않도록 함 
			if(i < size - 1) {
				str += ",";
			}
		}
		return str +  "]";
	}
	
	// 해당 index 에 데이터를 삭제
	public Object remove(int index) {
		// 데이터를 삭제 시에는 추가하는 것과는 정 반대로 작동 
		// 해당 index 에 값들을 삭제하면 빈자리가 생기므로
		// 빈 자리를 메꾸어야 하므로 빈자리에 다음 값을 앞으로 한칸씩 당겨야 함
		
		// 삭제 하려는 값을 임시로 저장
		Object removed = elementData[index];
		
		for(int i=index+1; i<=size-1; i++) {
			elementData[i-1] = elementData[i];
		}
		// 제거 하였기에 size 의 값을 1을 감소 시킴
		size--;
		// 맨 끝의 값을 null 로 지정
		elementData[size] = null;
		
		return removed;
	}
	
	public Object removeFirst() {
		// 첫번째 값을 삭제
		return remove(0);
	}
	
	public Object removeLast() {
		// size 의 길이에서 1을 빼준걸 return (맨 끝에 원소를 제거하고 return)
		return remove(size-1);
	}
	
	public Object get(int index) {
		return elementData[index];
	}

	// 변수를 사용하지 않고 메서드로 접근하는 이유는 외부에서 마음대로 수정을 방지
	public int size() {
		return size;
	}
	
	public int indexOf(Object o) {
		for(int i=0; i<size; i++) {
			if(o.equals(elementData[i])) {
				// return 은 for 문을 강제 종료
				return i;
			}
		}
		
		// 찾을 수 없다면 이 Return 문을 실행 하고 없을 시 -1 을 return 
		return -1;
	}
	
	public ListIterator listIterator() {
		// 새로운 ListIterator 객체를 만들어 return
		return new ListIterator();
	}
	
	class ListIterator {
		
		private int nextIndex = 0;
		
		// 현재 가지고 있는 index 와 size() 와 비교
		public boolean hasNext() {
			return nextIndex < size();
		}
		
		// 호출 될 때 마다 0 부터 시작하여 1 씩 증가
		// 다음 요소를 가져옴
		public Object next() {
//			Object returnData = elementData[nextIndex];
//			nextIndex++;	
//			return returnData;
			// 가져올 값이 없을 때 null 을 리턴
			return elementData[nextIndex++];
			
		}
		
		// 지금 nextIndex 에서 이전 값을 가져오고 싶을 시
		public Object previous() {
			// 가장 처음 원소는 이전이 -1 이므로 가져올 index가 없음
			return elementData[--nextIndex];
		}
		
		public boolean hasPrevious() {
			// nextIndex 가 0 보다 큰 지 0 이면 이전 요소가 없음
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
