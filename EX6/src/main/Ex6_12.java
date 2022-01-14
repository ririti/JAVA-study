package main;

public class Ex6_12 {

	public static void main(String[] args) {
		int[] arr = new int[] {3,2,1,6,5,4};
		
		printArr(arr);//배열 모두출력
		sortArr(arr);//배열 정렬
		printArr(arr);//정렬후 배열 출력
		System.out.println("sum="+sumArr(arr)); //배열의 총합

	}
	static void printArr(int[] arr) {//배열의 모든 요소 출력
		System.out.print("[");
		
		for(int i : arr)
			System.out.print(i+",");
		System.out.println("]");
	}
	static int sumArr(int[] arr) {
		int sum = 0;
		
		for(int i=0; i<arr.length; i++)
			sum += arr[i];
		return sum;
	}
	static void sortArr(int[] arr) {
		for(int i=0; i<arr.length-1; i++)
			for(int j=0; j<arr.length-1-i; j++)
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
	}//sortArr(int[] arr)

}
