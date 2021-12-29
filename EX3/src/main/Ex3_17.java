package main;

public class Ex3_17 {

	public static void main(String[] args) {
		
		double pi = 3.141592;
		double shorPi = (int)(pi * 1000 + 0.5) / 1000.0;
		//이렇게 반올림할수도있다. Math.round로 편하게도 가능 메서드이용
		System.out.println(shorPi);

	}

}
