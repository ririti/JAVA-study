package main;

public class Ex3_29 {

	public static void main(String[] args) {
		byte p = 10;
		byte n = -10;

		System.out.printf(" p  =%d \t%s\n", p, toBinaryString(p)); //부호가 바뀌며 1의보수연산자로고도 한다
		System.out.printf("~p  =%d \t%s\n", ~p, toBinaryString(~p)); // -11
		System.out.printf("~p+1=%d \t%s\n", ~p + 1, toBinaryString(~p + 1)); //-10
		System.out.printf("~~p =%d \t%s\n", ~~p, toBinaryString(~~p)); //10
		System.out.println();
		System.out.printf(" n  =%d\n", n); //-10
		System.out.printf("~(n-1)=%d\n", ~(n - 1)); //10
	}

	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length() - 32);
	}
}
