package arrayList;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListMain {
	
	// ArrayList �� ���������� �迭�� ��� 
	
	public static void main(String[] args) {
		// ArrayList ��ü ��� 
		ArrayListEx numbers = new ArrayListEx();
		
		// addLast ���� (���� �������� add ��� ����)
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		
		// �����͸� �߰��� �߰� �ϴ� �޼��� ����
		// 1 index �� 15 ���� �߰� �ϱ� 
		numbers.add(1, 15);
		
		numbers.add(4, 70);
		
		// ù��° ��ġ�� �����͸� �߰�
		numbers.addFirst(5);
		numbers.addFirst(35);
		
		// ���� �� ���� return 
		System.out.println("���� �� : " + numbers.remove(1));
		System.out.println("���� �� : " + numbers.remove(2));
		
		
		// toString �޼��带 �����Ͽ����Ƿ� �����Ѵ�� ���� ����� �� 
		System.out.println(numbers);
		
		// index 2 ��°���� get �ϱ� 
		System.out.println(numbers.get(2));
		
		// �� �ش� List �� ��� Element �� ������ �ִ���
		System.out.println(numbers.size());
		
		// �˻� ����� ���� (��ȸ �ÿ��� ��ü List �� ��ȸ�ϸ鼭 �ִ��� ������ Check)
		System.out.println(numbers.indexOf(20));
		JOptionPane a = new JOptionPane();
		
		// a.showMessageDialog(a, "Jso");
		
		
		
		// Java �⺻ Collection Framework ArrayList �� ����� ���� ���� 
		ArrayList ex = new ArrayList();
		
	}
	
	
}
