package main;

class Cars {//�̹� ���ǵǾ��ִ��� 6_24���� ���� ���Ǹ� �߱� �����̴�.
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
		
		System.out.println("c1�� color=" + c1.color + ", geatType="+ c1.gearType + ", door=" + c1.door);
		System.out.println("c2�� color=" + c2.color + ", geatType="+ c2.gearType + ", door=" + c2.door);
		
		c1.door = 100;// c1�� �ν��Ͻ����� door�� ���� �����Ѵ�.
		System.out.println("c1.door=100; ���� ��");
		System.out.println("c1�� color=" + c1.color + ", geatType="+ c1.gearType + " , door=" + c1.door);
		System.out.println("c2�� color=" + c2.color + ", geatType="+ c2.gearType + ", door=" + c2.door);
		//�����Ͽ� ������ ���̹Ƿ� ���� ���� ���¸� ������ ���� �������� �޸𸮰����� �����ϴ� �ν��Ͻ��Ƿ� c1�� ������ ����Ǿ c2���� ������ ����
	}

}
