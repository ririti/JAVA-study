package main;

import java.util.Scanner;

public class Ex4_2 {

	public static void main(String[] args) {
		int input;
		
		System.out.print("숫자를 하나 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); //화면을 통해 입력받은 내용을 tmp에저장
		input = Integer.parseInt(tmp);// 입력받은 tmp를 숫자로 변환
		
		if(input==0)	{
			System.out.println("입력하신 숫자는 0입니다.");
		}
		
		if(input!=0) {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.printf("입력하신 숫자는 %d입니다.", input);
		}
		scanner.close();
	}

}
