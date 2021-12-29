package main;

public class Ex3_8 {
	public static void main(String[] args) {
		int a = 1_000_000; // 1백만
		int b = 2_000_000; // 2백만
		
		long c = a* b;
		System.out.println(c);
		//올바른 값을 얻고 싶으면 a나 b둘중 하나를 long으로 형변환 시켜줘야한다
	}
}
