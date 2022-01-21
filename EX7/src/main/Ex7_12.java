package main;

class Card2{ //final선언 받은것을 생성자를 통해 초기화시킴
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int heiht = 250;
	Card2(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	
	Card2(){
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
	
}


public class Ex7_12 extends Card2{

	public static void main(String[] args) {
		Card2 c = new Card2("HEART", 10);
	//	c.NUMBER = 5;
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
		
	}

}
