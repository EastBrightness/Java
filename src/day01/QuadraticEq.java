package day01;
import java.util.Scanner;

public class QuadraticEq {

	public static void main(String[] args) {
		
		// Scanner 객체 생성
		Scanner input = new Scanner(System.in);
				
				// 상수 초기화 및 정의 (과제에서 a는 1.0으로 고정이라길래 F로 Float 지정해줌.)
				final float a = 1.0F;
				final float b;
				final float c;
				
				// 값 b, c들 입력받기
				System.out.println("x^2 + bx + c 의 이차방정식 중에서, \nb 값을 입력해주십시오 : ");
				b = input.nextFloat();
				
				System.out.println("c 값을 입력해주십시오 : ");
				c = input.nextFloat();
				
				// 근을 구하는 계산 ( 공식 : (-b +- 루트(b^2 - 4ac) ) / 2a )
				// 연산 결과를 타입 캐스팅 해줬음.
				float result1 = (float) ((-b + Math.sqrt(b * b-4 * c)) / 2);
				float result2 = (float) ((-b - Math.sqrt(b * b-4 * c)) / 2);
				
				System.out.println("입력하신 식의 근은 " + result1 + "와(과), " + result2 + "입니다.");

	}

}
