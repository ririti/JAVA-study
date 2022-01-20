package main;


class Car {//이미 정의되어있던건 6_24에서 먼저 정의를 했기 때문이다.
	String color;
	String gearType;
	int door;
	
	Car(){
		this("white", "auto", 4);
	}
	Car(String color){
		this(color, "auto", 4);
	}
	Car(String color, String gearTpye, int door){
		this.color = color;
		this.gearType = gearTpye;
		this.door = door;
	}
}
	
public class Ex6_25 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("blue");
		
		System.out.println("c1의 color=" + c1.color + ", geatType="+ c1.gearType + " , door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", geatType="+ c2.gearType + ", door=" + c2.door);
	}

}
