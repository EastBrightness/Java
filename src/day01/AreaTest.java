package day01;


// util에 있는 Scanner import를 위해 util의 *(모든것) import
import java.util.*;

public class AreaTest {
	public static void main(String[] args) {
		
		// 변수 선언
		final float PI = 3.141592F;
		
		float radius, area;
		
		// 스캐너 클래스의 input 객체를 생성
		Scanner input = new Scanner(System.in);
		
		// 사용자의 입력 받기
		System.out.println("반지름 입력: ");
		radius = input.nextInt();
		
		// 원의 면적 계산 ( 공식 : 반지름^2 * 원주율 )
		area = radius * radius * PI;
		
		// 출력
		System.out.println("반지름이 " + radius
				+ "인 원의 면적은 " + area + "입니다.");
	}
}
