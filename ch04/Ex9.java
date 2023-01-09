package ch04;

public class Ex9 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(i<11) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		while(true) {
			System.out.println("while문 실행");
			if(true) {
				break;
			}
		}
		
	}
}
