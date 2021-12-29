package main;

public class Ex3_9 {
	public static void main(String[] args) {
		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;

		System.out.println("a="+a);
		System.out.println("b="+b); //롱타입으로 변환 해주었기때문에 올바른 값이 나옴
		
	}
}
