package ch04;

public class Ex8 {

	public static void main(String[] args) {
		// 문제1. 1~30사이의 값중에 3의 배수의 합을 구하시오.
		// 문제2. 1~30사이의 값중에 짝수와 홀수의 합을 각각 구하시오.
		/*
		 * 문제3. 1~50사이의 3,6,9의 합은? Hint : %와 /를 사용. 33/10 => 3 sum : 627
		 */

		int sum[] = new int[4];
		for (int i = 1; i <= 30; i++) {
			if (i % 3 == 0)
				sum[0] += i;
			if (i % 2 == 0)
				sum[1] += i;
			else
				sum[2] += i;
		}
		for (int i = 1; i <= 50; i++) {
			if (i / 10 == 3)
				sum[3] += i;
			else if ((i % 10 != 0) & (i % 10) % 3 == 0)
				sum[3] += i;
		}
		System.out.println("Q1. 3의 배수의 합 : " + sum[0]);
		System.out.println("Q2. 짝수의 합: " + sum[1] + " 홀수의 합 : " + sum[2]);
		System.out.println("Q3. 3, 6, 9의 합: " + sum[3]);
	}
}
