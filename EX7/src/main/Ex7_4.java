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
	void play() { /* �������*/}
	void stop() { /* �������*/}
	void rew() { /* �������*/}
	void ff() { /* �������*/}
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
