package main;

import java.util.Scanner;

public class Ex4_8 {

	public static void main(String[] args) {
		System.out.print("����� �ֹι�ȣ�� �Է��ϼ���.(011231-1111222)>");
		
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		
		char gender = regNo.charAt(7); //�Է¹��� ��ȣ�� 8��° ���ڸ� gender�� ���� -�� ī�����ϱ⶧���� 8��°��
		
		switch(gender) {
		case '1': case '3':
			System.out.println("����� �����Դϴ�.");
			break;
		case '2': case '4':
			System.out.println("����� �����Դϴ�.");
			break;
		default:
			System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
		}
		scanner.close();
	}

}
