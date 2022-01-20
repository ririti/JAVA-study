package main;

public class Ex6_23 {
class Data1{ //매개벼ㅑㄴ수가없는 생성자
	int value;
}
class Data2{
	int value;
	
	Data2(int x){//매개변수가 있는 생성자
		value = x;
	}
}
	public static void main(String[] args) {
		Data1 d1 = new Data1();//컴파일러가 생성자가 하나도 없으므로 기본 생성자를 추가해줌
		//Data2 d2 = new Data2();//컴파일 에러

	}

}
