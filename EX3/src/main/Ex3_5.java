package main;

public class Ex3_5 {

	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d\n",	a, b, a+b);
		System.out.printf("%d - %d = %d\n",	a, b, a-b);
		System.out.printf("%d * %d = %d\n",	a, b, a*b);
		System.out.printf("%d / %d = %d\n",	a, b, a/b); //int타입이라 나머지는 버려졋음 반올림 안됌
		System.out.printf("%d / %f = %f\n",	a, (float)b, a/(float)b); //한쪽을 실수형으로 형변환 해주면 다른쪽도 형변환 되어 실수형 값을 얻음
		
	}
}
