package main;

public class Ex5_10버블정렬로_정렬함 {

	public static void main(String[] args) { // 정렬하기 예제
		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int) (Math.random() * 10));
		}
		System.out.println();

		for (int i = 0; i < numArr.length - 1; i++) {
			boolean changed = false; // 자리바꿈이 발생했는지를 체크한다.

			for (int j = 0; j < numArr.length - 1 - i; j++) {
				if (numArr[j] > numArr[j + 1]) {// 옆의 값이 작으면 서로 바꿔준다.
					int temp = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = temp;
					changed = true; // 자리바꿈이 발생했으니 change를 true로
				}
			}
			
			if (!changed) break;

			for (int k = 0; k < numArr.length; k++)
				System.out.print(numArr[k]);// 정렬된 결과를 출력한다.
			System.out.println();
		}
	}

}//버블정렬 알고리즘
