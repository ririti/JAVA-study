package main;

public class Ex3_2 {

	public static void main(String[] args) {
		int i = 5, j = 0;

		j = i++;
		System.out.println("j=i++; 실행 후, i="+ i +", j="+ j); // 6, 5
		
		i = 5; //비교하기 위해서 i와 j를 다시 바꿈
		j = 0;

		j = i++;
		System.out.println("j=++i; 실행 후, i="+ i +", j="+ j);

	}

}
