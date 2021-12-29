package main;

public class Ex3_22 {

	public static void main(String[] args) {
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double)f;
		
		System.out.printf("10.0 == 10.0f %b\n", 10.0==10.0f);
		System.out.printf("0.1  == 0.1f %b\n", 0.1==0.1f); //실수형은 근사값이 저장되므로 오차가 발생해서 false가 뜬다.
		System.out.printf("f  =%19.17f\n", f); // 전체19개 자리고 소수자리는 17개고 .도 한자리를 차지하므로 0. 빼고 나머지는 소수자리로 나타내준다
		System.out.printf("d  =%19.17f\n", d);
		System.out.printf("d2 =%19.17f\n", d2);
		System.out.printf("d==f   %b\n", d==f);
		System.out.printf("d==f2  %b\n", d==d2);
		System.out.printf("d2==f  %b\n", d2==f);
		System.out.printf("(float)d==f  %b\n", (float)d==f);
	}

}
