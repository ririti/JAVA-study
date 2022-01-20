package main;

class Cars {//이미 정의되어있던건 6_24에서 먼저 정의를 했기 때문이다.
	String color;
	String gearType;
	int door;
	
	Cars(){
		this("white", "auto", 4);
	}
	
	Cars(Cars c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	Cars(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
	

public class Ex6_26 {

	public static void main(String[] args) {
		Cars c1 = new Cars();
		Cars c2 = new Cars(c1);
		
		System.out.println("c1의 color=" + c1.color + ", geatType="+ c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", geatType="+ c2.gearType + ", door=" + c2.door);
		
		c1.door = 100;// c1의 인스턴스변수 door의 값을 변경한다.
		System.out.println("c1.door=100; 수행 후");
		System.out.println("c1의 color=" + c1.color + ", geatType="+ c1.gearType + " , door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", geatType="+ c2.gearType + ", door=" + c2.door);
		//복사하여 생성된 것이므로 서로 같은 생태를 갖지만 서로 독립적인 메모리공간이 존재하는 인스턴스므로 c1의 값들이 변경되어도 c2에는 영향이 없음
	}

}
