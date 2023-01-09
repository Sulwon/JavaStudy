package ch06;

/*
final : 클래스, 필드(인스턴스변수), 메서드
1. 클래스 : sub클래스가 없는 클래스
2. 변수 : 상수선언(필드, 매개변수, 지역변수)
3. 메서드 : 오버라이딩 불가
                   └ 상위클래스에서 정의한 메소드를 하위클래스에서 다시 재정의. 
*/

final class Final1 {
	
}
//class Final2 extends Final1{}

class Final3 {
	final int KIA = 1;
	final int SK = 2;
	int k;
	
	public Final3(final int a) {
		System.out.println(k);
	}
	
	public void prn(final int a) {
		final int b = 10;
		int c;
		int d = 10;
		int e;
		e = 10;
	}
}

class Final4{
	void prn1() {}
	final void prn2() {}
}

class Final5 extends Final4 {
	@Override
	void prn1() {
		
	}
}

public class FinalEx1 {

	public static void main(String[] args) {
		
	}

}
