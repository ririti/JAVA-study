package main;

import java.util.Scanner;

public class Ex4_10 { 
	//4_4번 if예제 문제를 swith문으로 바꿔서 만듬 빠르기는 한번만 계산하는 이게빠르지만 case가 많아져서 코드가 더러워짐

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		System.out.print("당신의 점수를 입력하세요.(1~100)>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		score = Integer.parseInt(tmp);//입력받은 문자열을 int형태로 변환
		
		switch(score/10) {//기본점수에서 10을 나누줌으로써 몫만 남기떄문에 간략화 가능
		case 10:
		case 9:
			grade ='A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
			default:
			grade = 'F';
		}
		System.out.println("당신의 학점은 " + grade + "입니다.");
		scanner.close();
	}

}
