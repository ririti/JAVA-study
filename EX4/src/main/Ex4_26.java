package main;

public class Ex4_26 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;

		// i를 1씩 증가시켜서 sum에 계속 더해나간다.
		while ((sum += ++i) <= 100) { //더해 나가다가 sum이 100을 넘지않는 최대 수에서 멈춤
			System.out.printf("%d - %d\n", i, sum);
		}
	}

}
