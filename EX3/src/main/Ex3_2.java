package main;

public class Ex3_2 {

	public static void main(String[] args) {
		int i = 5, j = 0;

		j = i++;
		System.out.println("j=i++; ���� ��, i="+ i +", j="+ j); // 6, 5
		
		i = 5; //���ϱ� ���ؼ� i�� j�� �ٽ� �ٲ�
		j = 0;

		j = i++;
		System.out.println("j=++i; ���� ��, i="+ i +", j="+ j);

	}

}
