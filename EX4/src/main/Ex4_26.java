package main;

public class Ex4_26 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;

		// i�� 1�� �������Ѽ� sum�� ��� ���س�����.
		while ((sum += ++i) <= 100) { //���� �����ٰ� sum�� 100�� �����ʴ� �ִ� ������ ����
			System.out.printf("%d - %d\n", i, sum);
		}
	}

}
