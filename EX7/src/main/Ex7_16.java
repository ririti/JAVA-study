package main;

public class Ex7_16 {

	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car; //���⼭ �������� �����ε� ������ �߻�
		fe.drive();
		car2 = fe; 
		car2.drive();
	}

}
