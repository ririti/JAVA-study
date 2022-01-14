package main;

public class Ex6_5 {

	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.heigth = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Sparde";
		c2.number = 4;//인스턴스변수의 값을 변경한다.
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는(" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는(" + c2.width + ", " + c2.height + ")");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		
		c1.width = 50;
		c1.height = 80;//클래스변수의 값을 변경한다. 클래스변수기 때문에 모든 인스턴스가 하나의 저장공간을 공유하므로 항상 공통된 값을 갖는다. 
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는(" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는(" + c2.width + ", " + c2.height + ")");
	}

}

class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250; //스태틱이 붙으면 클래스변수
}
