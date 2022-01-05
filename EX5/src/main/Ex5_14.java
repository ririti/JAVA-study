package main;

public class Ex5_14 {

	public static void main(String[] args) {
		String src = "ABCDE";
		
		for(int i=0; i < src.length(); i++) {
			char ch = src.charAt(i);//src의 i번째 문자를 ch에 저장
			System.out.println("src.charAt("+i+"):"+ch); //인덱스 서치 그위치에있는 배열을 불러옴
		}
		
		//String을 char[]로 변환
		char[] chArr = src.toCharArray();
		
		//char배열을 (char[])을 출력
		System.out.println(chArr);
	}

}
