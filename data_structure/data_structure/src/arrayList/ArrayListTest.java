package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	
	// List �� Array �� ����� ���ٴ� ģ�� ������
	// List �� �� ������ ������� ���� 
	// List ���� ������ �߰� �� ���۷��̼��� �����Ͱ� ��ĭ �� �ڷ� �и�
	// List ���� ������ ���� �� ���۷��̼��� �����Ͱ� ��ĭ �� ������ �����
	
	// �迭�� �̿��Ͽ� List �� ���� �� �߰�/���� �� �ð��� �����ɸ�
	// ������ ��ȸ��, ��ȸ �ÿ� index �� �̿��Ͽ� ������ ������ �� ����
	
	// ���������� ArrayList �� Size ��� ������ ���� (�߰��� Size ���� +1, ���� �� Size -1)
	// Size ���� ���� ���Ͽ� ArrayList �� �� ��� �����ϴ� �� �� ������  
	
	// Java ���� ArrayList �� Collection Framework ���� ArrayList ��ü�� ����
	
	public static void main(String[] args) {
		// ArrayList ��ü�� ���� (Generic �� ���)
		ArrayList <Integer> numbers = new ArrayList<>();
		
		// ������ �߰�
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
			
		// index �� �߰� (1 index �� 50�� �߰�)
		numbers.add(1, 50);
		
		// 1 ��° index �� 50 �� �߰��� �ǰ� �ڷ� ��ĭ�� �ڷ� �и�
		System.out.println("add �� : " + numbers);
		
		// ������ ���� (���� �� �����͸� ��ĭ�� ������ �����)
		numbers.remove(1);
		System.out.println("remove �� : " + numbers);
		
		// ������ ��ȸ (2 ��° index �� �ش��ϴ� value �� ������)
		int a = numbers.get(2);
		System.out.println(a);
		
		// ������ ũ�� ��ȸ
		int size = numbers.size();
		System.out.println("size : " + size);
		
		// Iterator ��ü �̿��Ͽ� iterator �޼��带 ���
		// Iterator �� ��ȯ�ϸ鼭 ��� ���� 
		// Iterator ������ Ÿ���� �ڹٿ� �ִ� �������̽� 
		// Iterator ��� ��ü�� Return �Ͽ� ������ ����
		
		Iterator it = numbers.iterator();
		
		// Iterator �� ����Ͽ� list �� ���� ������ ���� 
		while(it.hasNext()) {
			// iterator ��ü�� �̿��Ͽ� ��ȸ�� �ϸ鼭
			// ���� ���� ��
			// next �� ó�� ȣ��Ǹ� ó�� list �� ����ִ� ���� return 
			
			// �̷��� DownCasting ���ٴ� iterator ��ü ��ü���� DownCasting ����� ���ݴ� ��� ��
			int value = (Integer)it.next();
			// next �� �̿��Ͽ� value �� ������ �� �� �� �ڿ� ���� �����Ƿ� hasNext() �� false ��  return
			if(value == 30) {
				// Iterator �� ��ü�� remove �� ���Ͽ�
				// �� ���� list ���� ������ 
				// remove �Ӹ� �ƴ϶� add �� ����
				it.remove();
			}
		}
		
		System.out.println("Iter ��ü �� numbers : " + numbers);
		// for �����ε� ����� ���� 
		for(int value: numbers) {
			System.out.println("for �� ����Ʈ : " + value);
		}
		
		for(int i =0; i<numbers.size(); i++) {
			// get Method �� �̿��Ͽ� ���ٵ� ���� 
			System.out.println(numbers.get(i));
		}
		
	}
	
	
}
