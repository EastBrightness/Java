package day01;

public class LogicalOperator {
	public static void main(String[] args) {
		int i;
		double f;
		
		// 연산 당하는 애들이 5, 4 즉, int라서 반올림되어
		f = 5 / 4;
		System.out.println(f);
		
		// 캐스팅 연산자가 우선순위니까, 얘네는 이미 double로 5.0, 4.0임.
		f = (double) 5 / 4;
		System.out.println(f);
		
		// 둘 다 캐스팅이 1로 되니 2가 나옴.
		i = (int) 1.3 + (int) 1.8;
		System.out.println(i);
	}
}
