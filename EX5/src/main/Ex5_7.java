package main;

public class Ex5_7 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i=0; i < numArr.length; i++) {
			numArr[i] = i;
			System.out.print(numArr[i]);
		}
		
		System.out.println();
		
		for(int i=0; i <100; i++) {					
	  //for(int i=0; i ,numArr.length; i++)로 바꿔주면 효율적
			int n = (int)(Math.random() * 10);
			int tmp = numArr[0];
			numArr[0] = numArr[n];				//numArr[0]과 numArr[n]의 값을 서로 바꾼다
			numArr[n] = tmp;
		}
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i]);
		}
	}

}
