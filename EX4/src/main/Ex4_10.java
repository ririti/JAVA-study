package main;

import java.util.Scanner;

public class Ex4_10 { 
	//4_4�� if���� ������ swith������ �ٲ㼭 ���� ������� �ѹ��� ����ϴ� �̰Ժ������� case�� �������� �ڵ尡 ��������

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		System.out.print("����� ������ �Է��ϼ���.(1~100)>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		score = Integer.parseInt(tmp);//�Է¹��� ���ڿ��� int���·� ��ȯ
		
		switch(score/10) {//�⺻�������� 10�� ���������ν� �� ���⋚���� ����ȭ ����
		case 10:
		case 9:
			grade ='A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
			default:
			grade = 'F';
		}
		System.out.println("����� ������ " + grade + "�Դϴ�.");
		scanner.close();
	}

}
