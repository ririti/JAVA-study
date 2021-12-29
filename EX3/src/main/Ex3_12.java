package main;

public class Ex3_12 {

	public static void main(String[] args) {
		char c1 = 'a'; //c1에는 문자 a의 코드값인 97이 저장된다.
		char c2 = c1;	//c1에 저장되어 있는 값이 c2에 저장된다.
		char c3 = '	';	//c3를 공백으로 초기화 한다.
		
		int i = c1 + 1; //a+1 = 98
		
		c3 = (char) (c1 + 1);
		c2++; //c2 = c2+1을 사용할 경우 오류가난다 c2+1은 int형이기때문에 char형으로 형변환 시켜줘야한다.
		c2++;
		
		System.out.println("i=" + i); //98
		System.out.println("c2=" + c2); // 97 +1 +1 = 99 문자형으로는 3번째인 c가 오게된다
		System.out.println("c3=" + c3); // 98 = b

	}

}
