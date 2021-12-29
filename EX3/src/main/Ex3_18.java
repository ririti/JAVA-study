package main;

public class Ex3_18 {

	public static void main(String[] args) {
		
		double pi = 3.141592;
		double shorPi = Math.round(pi * 1000) / 1000.0;
		//round 메서드를 이용하여 편하게 첫째자리에서 반올림 시켜줌
		System.out.println(shorPi); //3.142
	}

}
