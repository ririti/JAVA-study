package main;

public class Ex5_14 {

	public static void main(String[] args) {
		String src = "ABCDE";
		
		for(int i=0; i < src.length(); i++) {
			char ch = src.charAt(i);//src�� i��° ���ڸ� ch�� ����
			System.out.println("src.charAt("+i+"):"+ch); //�ε��� ��ġ ����ġ���ִ� �迭�� �ҷ���
		}
		
		//String�� char[]�� ��ȯ
		char[] chArr = src.toCharArray();
		
		//char�迭�� (char[])�� ���
		System.out.println(chArr);
	}

}
