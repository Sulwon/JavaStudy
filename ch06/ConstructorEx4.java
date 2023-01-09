package ch06;

class SuperClass4 {
	//super라는 키워드는 부모를 지정하는 것
	//super()는 반드시 첫번째 라인에 삽입
	public SuperClass4(int i) {
		
	}
	
}
class SubClass4 extends SuperClass4 {
	public SubClass4() {
		super(22);
	}
}


public class ConstructorEx4 {

	public static void main(String[] args) {
		SubClass4 s1 = new SubClass4();
		
	}

}
