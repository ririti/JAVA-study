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
	Vector item = new Vector(); //구입한 제품을 저장하는데 사용될 Vector객체
	
	void buy(Product2 p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void refund(Product2 p) { //구입한 제품을 환불하는 문
		if(item.remove(p)) { //제품을 Vector에서 제거
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다..");
		} else {	//제거에 실패한 경우
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		//반복문을 이요해서 구입한 물품의 총 가격과 목록을 만든다.
		for(int i=0; i<item.size(); i++) {
			Product2 p =(Product2)item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " +p;
		}
		System.out.println("구입하신 뭃픔의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
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
