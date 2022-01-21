package main;

class Tv1{
	boolean power;
	int channel;
	
	void power()	{ power = !power;}
	void channerUp() { ++channel;}
	void channerDawn() { --channel;}
}

class VCR{
	boolean power;
	int counter = 0;
	void power() { power = !power;}
	void play() { /* 내용생략*/}
	void stop() { /* 내용생략*/}
	void rew() { /* 내용생략*/}
	void ff() { /* 내용생략*/}
}



public class Ex7_4 extends Tv1{
	VCR vcr = new VCR();
	
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}
	
	void ff() {
		vcr.ff();
	}

}
