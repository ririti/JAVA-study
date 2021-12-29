package main;

public class Ex3_24 {

	public static void main(String[] args) {
		int x = 0;
		char ch = '	';

		x = 15;
		System.out.printf("x=%2d, 10 < x && x < 20 =%b\n", x, 10 < x && x < 20);
		// %2d는 2자리 숫자 자리를 만들어준다 만약 6이면 앞에 한글자를 띄우고 나타냄 ex_6

		x = 6;
		System.out.printf("x=%2d, x%%2==0 || x%%3==0  &&  x%%6!=0 =%b\n", x, x % 2 == 0 || x % 3 == 0 && x % 6 != 0);
		//앞에는 출력문이기때문에 %%를 두번써준다 %나머지를 구하는것이 아니라 x의 배수를 뜻하는것     참 || 참 && 거짓  -&&부터 입력드어감 참 || 거짓 -> 참
		System.out.printf("x=%2d, (x%%2==0 || x%%3==0)	&& x%%6!=0 =%b\n", x, (x % 2 == 0 || x % 3 == 0) && x % 6 != 0);
		// (참 || 참) && 거짓 -> 참 && 거짓 -> 거짓
		
		ch = '1';
		System.out.printf("ch='%c', '0' <= ch && ch <= '9' = %b\n", ch, '0' <= ch && ch <= '9'); // 참 1

		ch = 'a';
		System.out.printf("ch='%c', 'a' <= ch && ch <= 'z' = %b\n", ch, 'a' <= ch && ch <= 'z');// 참 97

		ch = 'A';
		System.out.printf("ch='%c', 'A' <= ch && ch <= 'Z' = %b\n", ch, 'A' <= ch && ch <= 'Z');// 참 65

		ch = 'q';
		System.out.printf("ch='%c', ch=='q' || ch=='Q' = %b\n", ch, ch == 'q' || ch == 'Q');// 참
	}

}
