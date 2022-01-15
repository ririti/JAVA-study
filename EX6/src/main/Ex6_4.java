package main;

public class Ex6_4 {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3]; // 길이가 3인 티비객체 배열 생성
		
		//티비객체를 생성해서 티비객체 배열의 각요소애ㅔ 저장한다.
		for(int i=0; i <tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i +10;
		}
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d\n", i, tvArr[i].channel);
		}

	}

}

