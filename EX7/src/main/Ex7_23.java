package main;

import java.util.*;

class Product2 {
	int price;
	int bonusPoint;

	Product2(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
	Product2() {
		price = 0;
		bonusPoint = 0;
	}
}

class Tv5 extends Product2 {
	Tv5() {super(100);}
	public String toString() { return "Tv";}
}

class Computer2 extends Product2 {
	Computer2() {super(200);}
	public String toString() {return "Computer";}
}

class Audio1 extends Product2 {
	Audio1() {super(250);}
	public String toString() {return "Audio";}
}

class Buyer2{
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector(); //������ ��ǰ�� �����ϴµ� ���� Vector��ü
	
	void buy(Product2 p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
	
	void refund(Product2 p) { //������ ��ǰ�� ȯ���ϴ� ��
		if(item.remove(p)) { //��ǰ�� Vector���� ����
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "��/�� ��ǰ�ϼ̽��ϴ�..");
		} else {	//���ſ� ������ ���
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
		}
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
		//�ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
		for(int i=0; i<item.size(); i++) {
			Product2 p =(Product2)item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " +p;
		}
		System.out.println("�����Ͻ� �R���� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}
}

public class Ex7_23 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		Tv5 tv = new Tv5();
		Computer2 com = new Computer2();
		Audio1 audio = new Audio1();

		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();

	}

}
