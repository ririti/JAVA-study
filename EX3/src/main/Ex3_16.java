package main;

public class Ex3_16 {

	public static void main(String[] args) {
		float pi =3.141592f;
		float shortPi = (int)(pi * 1000) / 1000f;
		// 순서 : 3141로 int형태로 나오고 다음에 1000f 실수형태로 나눠주기때문에 3.141가 된다.
		System.out.println(shortPi);

	}

}
