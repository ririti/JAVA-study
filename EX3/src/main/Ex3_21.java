package main;

public class Ex3_21 {

	public static void main(String[] args) {
		System.out.printf("10 == 10.0f   \t %b\n", 10==10,0f);
		System.out.printf("'0' == 0      \t %b\n", '0'== 0); //문자열 '0'은 유니코드로 바꿀시 48이다
		System.out.printf("'A'== 65      \t %b\n", 'A'== 65);
		System.out.printf("'A' > 'B'     \t %b\n", 'A' > 'B');  // 유니코드로 바꾸면 65 > 66이기 떄문에 false
		System.out.printf("'A'+1 != 'B'  \t %b\n", 'A'+1 != 'B'); // 유니코로 바꾸면 66 != 66이기 때문에 false ==연산자를 써줘야함

	}

}
