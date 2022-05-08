package linkedList;

public class List {
	
	// List 의 가장 큰 특징은 데이터가 순서대로 저장이 됨
	// List 는 중복을 허용 
	
	// Array 와 List 는 상당히 유사함 
	// Array 가 가진 기능보다 List 는 더 많음 
	// Array 는 어떤 데이터가 저장 되어있는 위치 index 가 중요함
	// Array 에서는 index 를 이용하여 바로 찾아갈 수 있음
	// List 는 index 를 가지고 있지만 index 보다 중요한 것이 
	// list 는 데이터가 저장되어 있는 순서가 훨씬 더 중요 함
	// 데이터를 추가시에 배열은 index 에 저장 시 그 해당 Value 를 덮어 씀
	// List 는 그 해당 Value 가 한칸 씩 뒤로 밀려남
	
	// 데이터를 삭제시에는 배열은 그냥 비어있는 상태가 됨
	// 데이터를 삭제 시 List 에서는 해당 index 가 사라지면서 뒤에 있던 데이터가 한 칸 앞으로 전진을 하게 됨
	
	// List 의 가장 큰 특징은 데이터가 연속적으로 이루어져있음 (끊기지 않고)
	// List 를 순회 시에 연속적이므로 데이터가 있는지 없는지 체크할 필요가 없음
	// Array 는 중간에 데이터가 비어잇을 수 있으므로 체크를 해주어야 함 
	
	// 배열에서 index 는 그 값에 대하여서 유일무이한 식별자
	
	public static void main(String[] args) {
		
		// List 기능
		// --> 처음, 끝, 중간에 엘리먼트를 추가/삭제 하는 기능 
		// --> 추가 시 데이터가 한칸씩 뒤로 밀려남, 삭제 시 데이터가 한칸 씩 앞으로 댕겨 짐
		// --> List에 데이터가 있는지를 체크하는 기능 
		// --> List 에 모든 데이터에 접근할 수 있는 기능 
		
		// DataStructure 에서 가장 중요한 것은 어떠한 기능을 가지고 있는 것이 아는게 중요
		
		// C 는 list 를 지원해주지 않음 
		// JavaScript 는 c 이후에 나왔으므로 
		// JavaScript 는 list 가 가지고 있는 Operation 을 Array가 제공 
		// JavaScript 에서는 배열이 리스트임 
		
		// Python 을 Array 를 제공해주지 않고 List 를 제공
		// Python 에서는 리스트 가 배열임 
		
		// 최근 언어는 리스트를 기본적으로 지원
		
		// Java 는 C 이후에 등장한 언어이긴 하지만
		// 배열과 리스트를 완전히 다르게 존재
		
		// List 는 ArrayList 객체를 만들어 ArrayList 로 사용 
		// Java 에서는 배열과 리스트를 모두 지원 (완전히 분리되어 있음)
		
		// 배열은 배열에 장점이 잇고 리스트는 리스트에 장점이 있음 
		
		// LindedList, ArrayList --> List 를 만드는 2가지 방법임
		// Java 는 리스트를 2개 지원 LinkedList / ArrayList
		// Array / Linked List 는 서로 다른 장 단점을 가지고 있음
		// ArrayList --> 추가/삭제 느림, index 조회 빠름
		// LinkedList --> 추가/삭제 빠름, index 조회 느림 
		
		// DataStructure 는 언어마다 지원이 다르다 (중요한 것은 Concept 본질임)
		
		
	}
	
}
