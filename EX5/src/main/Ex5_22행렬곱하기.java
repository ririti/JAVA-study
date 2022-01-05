package main;

public class Ex5_22행렬곱하기 {

	public static void main(String[] args) {//두 행렬의 곱셈이 가능하려면 배열m1의 열의 길아와 배열 m2의 행길이가 같아야한다.
		int[][] m1 = { { 1, 2, 3 }, 
					   { 4, 5, 6 } };
		
		int[][] m2 = { { 1, 2 }, 
					   { 3, 4 }, 
					   { 5, 6 } };

		final int ROW = m1.length; // 행
		final int COL = m2[0].length; //열
		final int M2_ROW = m2.length; //행열의 길이

		int[][] m3 = new int[ROW][COL];

		// 행렬곱 m1 x m2의 결과를 m3에 저장
		for (int i = 0; i < ROW; i++)
			for (int j = 0; j < COL; j++)
				for (int k = 0; k < M2_ROW; k++)
					m3[i][j] += m1[i][k] * m2[k][j];

		// 행렬 m3를 출력
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				System.out.printf("%3d ", m3[i][j]);
			}
			System.out.println();
		}

	}

}
