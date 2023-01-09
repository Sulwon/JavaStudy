package ch06;

import common.util.StringUtil;

class Static3 {
	//동일한 클래스의 모든 객체가 공유의 목적으로 하나만 메모리에 저장된다.
	static int a;
	static int b;
	
}


public class StaticEx3 {

	public static void main(String[] args) {
		Static3 st1 = new Static3();
		Static3 st2 = new Static3();
		st1.b = 10;
		st2.b = 5;
		System.out.println(st1.b);
		System.out.println(st2.b);
		//////////////////////////////
		st1.a = 10;
		st2.a = 20;
		System.out.println(st1.a);
		System.out.println(st2.a);
		System.out.println(st2.b);
		String str = "1000000000000";
		System.out.println(StringUtil.addComma(str));
	}

}
