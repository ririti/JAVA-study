package main;

import java.util.Arrays;

public class Ex5_2나중에다시해보기 {

	public static void main(String[] args) {
		int[] iArrl = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[] {100, 95, 80, 70, 60}
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};
		for (int i=0; i < iArrl.length ; i++) {
			iArrl[i] = i +1;
		}
		
		for (int i=0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10) + 1;//1~10의 값을 배열에 저장
		}
		
		for(int i=0; i < iArrl.length; i++) {
			System.out.print(iArrl[i] + ",");
		}
		System.out.println();
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3);
		System.out.println(chArr);
	}

}
