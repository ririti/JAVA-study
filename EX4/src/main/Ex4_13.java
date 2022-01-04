package main;

public class Ex4_13 {
public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i; // sum = sum+1
			System.out.printf("1부터 %2d 까지의 합: %2d\n", i, sum);
		}

		System.out.printf("합 = %d", sum);
	}

}
