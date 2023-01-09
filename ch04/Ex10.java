package ch04;

public class Ex10 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1;; i++) {
			sum += i;
			if (sum >= 100)
				break;
		}
		System.out.println(sum);

		iot :
		for (int i = 0;; i++) {
			for (int j = 0;; j++) {
				if(i+j>30) break iot;
			}
		}
	}

}
