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
	
	
	
	
	
	
}
