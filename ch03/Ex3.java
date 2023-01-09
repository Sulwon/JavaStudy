package ch03;

public class Ex3 {

	public static void main(String[] args) {
		
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		//System.out.println(args[2]);
		//동일한 데이터 타입을 하나의 변수로 묶어놓은 기능
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		int a = 1;
		int b = 2;
		int c = 3;
		
		int arr[] = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
	}

}
