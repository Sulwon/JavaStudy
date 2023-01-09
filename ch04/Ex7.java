package ch04;

public class Ex7 {

	public static void main(String[] args) {
		
		int a; 
		int total = 0;
		for (int i = 1,j = 0;i<11;i++,j++) {
			total += i;
		}
		System.out.println(total);
		int j = 0;
		for (;j<11;j++) {
			System.out.println("j:" + j);
		}
		for(;;) {
			System.out.println("무한반복");
		}
	}

}

