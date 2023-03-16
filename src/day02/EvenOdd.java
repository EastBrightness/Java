package day02;

import java.util.*;

public class EvenOdd {
	public static void main(String[] args) {
		System.out.println("숫자 입력 : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
	}
}
