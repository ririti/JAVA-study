package main;

public class Ex3_21 {

	public static void main(String[] args) {
		System.out.printf("10 == 10.0f   \t %b\n", 10==10,0f);
		System.out.printf("'0' == 0      \t %b\n", '0'== 0); //���ڿ� '0'�� �����ڵ�� �ٲܽ� 48�̴�
		System.out.printf("'A'== 65      \t %b\n", 'A'== 65);
		System.out.printf("'A' > 'B'     \t %b\n", 'A' > 'B');  // �����ڵ�� �ٲٸ� 65 > 66�̱� ������ false
		System.out.printf("'A'+1 != 'B'  \t %b\n", 'A'+1 != 'B'); // �����ڷ� �ٲٸ� 66 != 66�̱� ������ false ==�����ڸ� �������

	}

}
