package main;

public class Ex4_33 {

	public static void main(String[] args) {
		// for문에 Loop1이라는 이름을 붙여준다.

		Loop1: for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 5)
					break Loop1;//j가 5가되면 반복문을 빠져나가기 때문에 2*5는 출력대지 않는다.
				//break 문에 Loop1을 달아주지 않았다면 2부터 9까지 5곱하는것빼고 4줄씩 출력한다.
				// break;
				// continue Loop1;
				// continue;
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();

		}

	}

}
