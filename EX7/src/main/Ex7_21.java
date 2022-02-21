package main;

class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}

	public String toString() {
		return "Tv";
	}
}

class Tv3 extends Product {
	Tv3() {
		// ����Ŭ������ ������ product(int price)
		super(100);// Tv������ 100�������� ���Ѵ�.
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
}

public class Ex7_21 {

	public static void main(String[] args) {
		Buyer b = new Buyer();

		b.buy(new Tv3());
		b.buy(new Computer());

		System.out.println("���� ���� ���� " + b.money + "�����Դϴ�.");
		System.out.println("���� ���ʽ������� " + b.bonusPoint + "���Դϴ�.");

	}

}
