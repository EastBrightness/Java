package day01;

// 여긴 util의 Scanner만 따로 import했음.
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		// 스캐너
		Scanner input = new Scanner(System.in);
		
		System.out.println("년도 입력 : ");
		// 정의 및 초기화를 한줄로 해보려고 압축해봄.
		final int year = input.nextInt();
		
		// 만약 4로 나누어 떨어진다면( 윤년일 경우 ), True를 출력하라.
		if (year % 4 == 0) {
			System.out.println("True");
		}
		// 그게 아니라면?( 윤년이 아니라면 ), False를 출력하라.
		else {
			System.out.println("False");
		}
		
		
		
		
		
		
		
		
		
		
	}
}
