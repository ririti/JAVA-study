package main;

public class Ex3_14 {

	public static void main(String[] args) {

		char c = 'a';
		for (int i = 0; i < 26; i++) {
			System.out.print(c++);
		}
		System.out.println();

		c = 'A';
		for (int i = 0; i < 26; i++) {
			System.out.print(c++); //A부터 26개의 문자를 출력

		}
		System.out.println();

		c = '0';
		for (int i = 0; i < 10; i++) { // {]안에 10번 반복
			System.out.print(c++); // '0'부터 10개의 문자를 출력
		}
	}

}
