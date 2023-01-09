package ch06;

class Method2 {
	/* 메서드 오버로딩(Over loading)
	 * 동일한 메서드명으로 매개변수의 개수를 다르게 선언한다.
	 */
	void prn(int a) {
		System.out.println(a);
		return;
	}
	void prn(int a, int b) {
		System.out.println(a + "\t" + b);
	}
	 void prn(int a,int b,int c) {
		 System.out.println(a + "\t" + b + "\t" + c);
	 }
}

public class MethodEx2 {

	public static void main(String[] args) {
		int a = Math.abs(-10);
		double d = Math.abs(3.14);
		Method2 mt = new Method2();
		mt.prn(10);
		mt.prn(10,20);
		mt.prn(10,20,30);
	}

}
