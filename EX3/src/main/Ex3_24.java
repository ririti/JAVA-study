package main;

public class Ex3_24 {

	public static void main(String[] args) {
		int x = 0;
		char ch = '	';

		x = 15;
		System.out.printf("x=%2d, 10 < x && x < 20 =%b\n", x, 10 < x && x < 20);
		// %2d�� 2�ڸ� ���� �ڸ��� ������ش� ���� 6�̸� �տ� �ѱ��ڸ� ���� ��Ÿ�� ex_6

		x = 6;
		System.out.printf("x=%2d, x%%2==0 || x%%3==0  &&  x%%6!=0 =%b\n", x, x % 2 == 0 || x % 3 == 0 && x % 6 != 0);
		//�տ��� ��¹��̱⶧���� %%�� �ι����ش� %�������� ���ϴ°��� �ƴ϶� x�� ����� ���ϴ°�     �� || �� && ����  -&&���� �Էµ� �� || ���� -> ��
		System.out.printf("x=%2d, (x%%2==0 || x%%3==0)	&& x%%6!=0 =%b\n", x, (x % 2 == 0 || x % 3 == 0) && x % 6 != 0);
		// (�� || ��) && ���� -> �� && ���� -> ����
		
		ch = '1';
		System.out.printf("ch='%c', '0' <= ch && ch <= '9' = %b\n", ch, '0' <= ch && ch <= '9'); // �� 1

		ch = 'a';
		System.out.printf("ch='%c', 'a' <= ch && ch <= 'z' = %b\n", ch, 'a' <= ch && ch <= 'z');// �� 97

		ch = 'A';
		System.out.printf("ch='%c', 'A' <= ch && ch <= 'Z' = %b\n", ch, 'A' <= ch && ch <= 'Z');// �� 65

		ch = 'q';
		System.out.printf("ch='%c', ch=='q' || ch=='Q' = %b\n", ch, ch == 'q' || ch == 'Q');// ��
	}

}
