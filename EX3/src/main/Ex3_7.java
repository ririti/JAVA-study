package main;

public class Ex3_7 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b);
		
		System.out.println(c); 
		
		//큰 자료형의 값을 작은 자료형의 변수에 저장하려면 명시적으로 형변환 연산자를 사용해서 변환해줘야한다.
		//바이트로는 400을 저장할수없어서 44만 나타나고 값손실이 발생한다.
	}

}
