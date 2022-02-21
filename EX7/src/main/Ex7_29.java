package main;

public class Ex7_29 {

	public static void main(String[] args) {
		A2 a = new A2();
		a.methodA2();
	}

}

class A2{
	void methodA2() {
		I2 i = InstanceManager.getInstance();
		i.methodB2();
		System.out.println(i.toString());
	}
}

interface I2{
	public abstract void methodB2();
}

class B2 implements I2{
	public void methodB2() {
		System.out.println("methodB2 in B2 class");
	}
	public String toString() {return "class B2";}
}

class InstanceManager {
	public static I2 getInstance() {
		return new B2();
		
	}
}