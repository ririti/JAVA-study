package main;

public class Ex4_33 {

	public static void main(String[] args) {
		// for���� Loop1�̶�� �̸��� �ٿ��ش�.

		Loop1: for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 5)
					break Loop1;//j�� 5���Ǹ� �ݺ����� ���������� ������ 2*5�� ��´��� �ʴ´�.
				//break ���� Loop1�� �޾����� �ʾҴٸ� 2���� 9���� 5���ϴ°ͻ��� 4�پ� ����Ѵ�.
				// break;
				// continue Loop1;
				// continue;
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();

		}

	}

}
