package main;

public class Ex3_10 {

	public static void main(String[] args) {
		int a = 1000000;
		
		int result1 = a * a / a;
		int result2 = a / a * a;
		
		System.out.println(result1);//값손실
		System.out.println(result2);//정상값

	}

}
