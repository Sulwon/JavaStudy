package ch05;

public class Ex2 {

	public static void main(String[] args) {
		int sum = 0, count = 0;
		double avg = 0.0;
		int arr2[][] = {{1,2},{3,4,5},{6},{1,2,3,4},{2,3,4}};		
		double arr3[][] = {{1.0},{2.3,3.4},{4.5,6.2,4.3},{9.0}};
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				sum += arr2[i][j];
			}
		}
		
		System.out.println("Q1. arr2의 모든값의 합 : " + sum);
		
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				avg += arr3[i][j];
				count++;
			}
		}
		avg /= count;
		System.out.printf("Q2. arr3의 평균값 : %.2f", avg);
		
	}

}
