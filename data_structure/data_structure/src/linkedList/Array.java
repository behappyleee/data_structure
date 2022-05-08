package linkedList;

import java.util.Arrays;

public class Array {
	
	// 배열은 대부분 언어에서 지원하는 DataStructure
	// 배열 같은 것들이 DataStructure 임 
	// 배열은 내부적으로 데이터를 저장 하기 위한 도구로 사용	
	
	// 배열은 데이터 적을 때 가 아닌 많을 때 사용
	// 데이터가 많아 질 시 그룹관리의 필요성이 생김
	// 이럴 때 사용 하는 것이 배열 Array	
	// 여러 데이터를 하나의 이름으로 그룹핑하여 관리하기 위한 데이터 스트럭쳐
		
	// 배열 사용시 장점은 그룹핑화 되어있는 데이터들을 그룹으로 관리가 가능
	
	public static void main(String[] args) {
		
		// 배열 선언 시
		// 타입 [] 변수명 = new 타입 [elements 갯수];
		int[] numbers1 = new int[4];
		
		numbers1[0] = 10;
		numbers1[1] = 20;
		numbers1[2] = 30;
		
		System.out.println(Arrays.toString(numbers1));
		// finalize();
		
	}
	
	/*
	 * @Override public static void finalize() { System.out.println("Finalize !!");
	 * 
	 * }
	 */
	
	
	
	
	
	
}
