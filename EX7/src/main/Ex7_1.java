package main;

class Tv{
	boolean power;//전원을 온 오프하는 기능을한다 true와 false로
	int channel;
	
	void power() { power = !power;}
	void channelUp() { ++channel;}
	void channelDown() {--channel;}
}

class CaptionTv extends Tv{
	boolean caption;
	void displayCaption(String text) {
		if(caption) { //캡션 상태가 on(true)일 때만 text를 보여준다
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
