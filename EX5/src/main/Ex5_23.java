package main;

import java.util.Scanner;

public class Ex5_23 {

	public static void main(String[] args) {
		String[][] words = {
				{"chair","의자"},
				{"computer", "컴퓨터"},
				{"integer", "상수"}
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]); //words[i][0]은 문제를 뜻함
			
			String tmp = scanner.nextLine();
			
			if(tmp.equals(words[i][1])) {//wordspi[][1]은 정답을 뜻함
				System.out.printf("정답입니다\n\n");
			}else {
				System.out.printf("틀렸습니다. 정답은 %s입니다. \n\n",words[i][1]);
			}
		}

	}

}
