package ch04;

import java.util.TreeSet;

public class LottoTree {

	public static void main(String[] args) {
		Object lotto[] = getLotto();
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	public static Object[] getLotto() {
		TreeSet<Integer> tr = new TreeSet<Integer>();
		for (int i = 0; tr.size() < 6; i++) {
			tr.add((int)(Math.random()*45)+1);
		}
		Object lotte[] = tr.toArray();
		return lotte;
	}

}
