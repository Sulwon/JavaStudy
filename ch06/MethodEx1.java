package ch06;

class Method1 {
	int abs(int num) {
		return num > 0 ? num : -num;
	}
	void prn(int a, int b) {
		int c = a + b;
		System.out.println(a + " + " + b + " = " + c);		
	}
}


public class MethodEx1 {

	public static void main(String[] args) {
		Method1 m = new Method1();
		int a = m.abs(-10);
		m.prn(a,2);
		
		
		
	}

}
