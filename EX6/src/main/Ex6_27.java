package main;

public class Ex6_27 {
static {
	System.out.println("static {  }"); //Ŭ���� �ʱ�ȭ ���̶� �ѹ��� ����
}

{
	System.out.println("{  }"); //�ν��Ͻ� �ʱ�ȭ���̶� �ݺ��ä�����
}

public Ex6_27() {
	System.out.println("������");
}
	public static void main(String[] args) {
		System.out.println("Ex6_27 ex = new Ex6_27");
		Ex6_27 ex= new Ex6_27();
		
		System.out.println("Ex6_27 ex2 = new Ex6_27");
		Ex6_27 ex2= new Ex6_27();
	}

}
