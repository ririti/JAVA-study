package main;

public class Ex6_8 {

	public static void main(String[] args) {
		System.out.println("main(String[] args)�� ���۵Ǿ���.");
		firstMethod();
		System.out.println("main(String[] args)�� ������.");
	}
	static void firstMethod() {
	System.out.println("firstMethod()�� ���۵Ǿ���.");
	secondMethod();
	System.out.println("firstMEthod()�� ������.");
	}
	static void secondMethod() {
	System.out.println("secodnMethod()�� ���۵Ǿ���.");
	System.out.println("secodnMethod()�� ������.");
	}
}
