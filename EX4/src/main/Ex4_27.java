package main;

import java.util.Scanner;

public class Ex4_27 {

	public static void main(String[] args) {
		int num;
		int sum = 0;
		boolean flag = true;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)");
		
		while(flag) {
			System.out.print(">>");
			
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num!=0) {
				sum += num; //넘이 0이아니면 계속 더한다.
			}else {
				flag = false; //남ㅇ; 0이면 flag의 값을 false로 변경
			}
			
		}
		System.out.println("합계:"+sum);
		scanner.close();
	}

}
