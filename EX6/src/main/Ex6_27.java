package main;

public class Ex6_27 {
static {
	System.out.println("static {  }"); //클래스 초기화 블럭이라 한번만 실행
}

{
	System.out.println("{  }"); //인스턴스 초기화블럭이라 반보ㅓㄱ실행
}

public Ex6_27() {
	System.out.println("생성자");
}
	public static void main(String[] args) {
		System.out.println("Ex6_27 ex = new Ex6_27");
		Ex6_27 ex= new Ex6_27();
		
		System.out.println("Ex6_27 ex2 = new Ex6_27");
		Ex6_27 ex2= new Ex6_27();
	}

}
