package ch06;

//상성자 정의
class Constructor1 extends Object {
	//기본 생성자 : 컴파일 시점에 JVM에 제공	
	public Constructor1() {
		System.out.println("생성자 호출");
	}
	public Constructor1(int i) {
		System.out.println("매개변수 int 생성자 호출");
	}
	public Constructor1(String s) {
		System.out.println("매개변수 String 생성자 호출");
	}
}

//생성자(Constructor) : 객체를 생성할 때
public class ConstructorEx1 {

	public static void main(String[] args) {
		Constructor1 c1 = new Constructor1();
		Constructor1 c2 = new Constructor1(22);
		Constructor1 c3 = new Constructor1("하하");
	}

}
