package main;

class Tv{
	boolean power;//������ �� �����ϴ� ������Ѵ� true�� false��
	int channel;
	
	void power() { power = !power;}
	void channelUp() { ++channel;}
	void channelDown() {--channel;}
}

class CaptionTv extends Tv{
	boolean caption;
	void displayCaption(String text) {
		if(caption) { //ĸ�� ���°� on(true)�� ���� text�� �����ش�
			System.out.println(text);
		}
	}
}

public class Ex7_1 {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel =10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption =true;
		//ctv.caption =false;
		ctv.displayCaption("Hello, World");

	}

}
