package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	
	// List 와 Array 는 대비대기 보다는 친한 사이임
	// List 는 빈 공간을 허용하지 않음 
	// List 에서 데이터 추가 시 오퍼레이션은 데이터가 한칸 씩 뒤로 밀림
	// List 에서 데이터 삭제 시 오퍼레이션은 데이터가 한칸 씩 앞으로 댕겨짐
	
	// 배열을 이용하여 List 로 만들 시 추가/삭제 시 시간이 오래걸림
	// 장점은 조회임, 조회 시에 index 를 이용하여 빠르게 가져올 수 있음
	
	// 내부적으로 ArrayList 는 Size 라는 변수를 유지 (추가시 Size 변수 +1, 삭제 시 Size -1)
	// Size 변수 값을 통하여 ArrayList 안 에 몇개가 존재하는 지 알 수있음  
	
	// Java 에서 ArrayList 는 Collection Framework 에서 ArrayList 객체를 내장
	
	public static void main(String[] args) {
		// ArrayList 객체를 생성 (Generic 을 사용)
		ArrayList <Integer> numbers = new ArrayList<>();
		
		// 데이터 추가
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
			
		// index 에 추가 (1 index 에 50을 추가)
		numbers.add(1, 50);
		
		// 1 번째 index 에 50 이 추가가 되고 뒤로 한칸씩 뒤로 밀림
		System.out.println("add 값 : " + numbers);
		
		// 데이터 삭제 (삭제 시 데이터를 한칸씩 앞으로 당겨짐)
		numbers.remove(1);
		System.out.println("remove 값 : " + numbers);
		
		// 데이터 조회 (2 번째 index 에 해당하는 value 를 가져옴)
		int a = numbers.get(2);
		System.out.println(a);
		
		// 사이즈 크기 조회
		int size = numbers.size();
		System.out.println("size : " + size);
		
		// Iterator 객체 이용하여 iterator 메서드를 사용
		// Iterator 는 순환하면서 어떠한 값을 
		// Iterator 데이터 타입은 자바에 있는 인터페이스 
		// Iterator 어떠한 객체를 Return 하여 변수에 담음
		
		Iterator it = numbers.iterator();
		
		// Iterator 를 사용하여 list 에 전부 접근이 가능 
		while(it.hasNext()) {
			// iterator 객체를 이용하여 순회를 하면서
			// 값을 리턴 함
			// next 가 처음 호출되면 처음 list 에 담겨있는 값을 return 
			
			// 이렇게 DownCasting 보다는 iterator 객체 자체에서 DownCasting 방법이 조금더 모던 함
			int value = (Integer)it.next();
			// next 를 이용하여 value 를 가져온 뒤 에 맨 뒤에 값은 없으므로 hasNext() 를 false 로  return
			if(value == 30) {
				// Iterator 에 객체안 remove 를 통하여
				// 그 값을 list 에서 삭제함 
				// remove 뿐만 아니라 add 도 존재
				it.remove();
			}
		}
		
		System.out.println("Iter 객체 후 numbers : " + numbers);
		// for 문으로도 출력이 가능 
		for(int value: numbers) {
			System.out.println("for 문 리스트 : " + value);
		}
		
		for(int i =0; i<numbers.size(); i++) {
			// get Method 를 이용하여 접근도 가능 
			System.out.println(numbers.get(i));
		}
		
	}
	
	
}
