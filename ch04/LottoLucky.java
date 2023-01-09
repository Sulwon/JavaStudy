package ch04;

import java.util.Arrays;

public class LottoLucky {

	public static void main(String[] args) {
		int lotto[] = getLotto();
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "\t");
		}		
	}
	
	public static int[] getLotto() {
		int rnd;
		boolean dummy[] = new boolean[45];
		int lotto[] = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			while(true) {
				rnd = (int)(Math.random()*45);
				if(!dummy[rnd]) {
					dummy[rnd] = true;
					lotto[i] = rnd+1;
					break;
				}
			}
		}	
		Arrays.sort(lotto);
		return lotto;
	}
	

}
