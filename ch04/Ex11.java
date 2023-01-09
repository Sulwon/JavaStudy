package ch04;

import java.util.Iterator;

public class Ex11 {

	public static void main(String[] args) {

		int sum = 0;
		String s = "";
		for (int i = 1; i < 21; i++) {
			if (i % 3 != 0)
				continue;
			sum += i;
			System.out.print(s + i);
			s = " + ";
		}
		s = " = ";
		System.out.print(s + sum);
	}

}