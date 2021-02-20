package com.kita.first.level2.practice;

public class Practice14 {
	public static void main(String[] args) {
		//성적 배열 만들기 
		int[][] arr = {
				{67,90,87}, //국어성적
				{89,92,56,88,90}, //수학성적
				{76,90,98} //영어성적
		};
		
		String[] clsArr = {"국어","수학","영어"};
		int[] sumArr = new int[clsArr.length];
//		국어합계: ?, 평균: ? 00.0
//		수학합계: ?, 평균 : ?
//		영어합계: ?, 평균 : ?
//		전체합계: ?, 전체평균 : ?
		
		for(int i=0; i<arr.length; i++) {
			for(int z=0; z<arr[i].length; z++) {
				sumArr[i] += arr[i][z];
			}
			System.out.printf("%s합계: %d, 평균: %.1f\n", clsArr[i], sumArr[i], (float)sumArr[i]/arr[i].length);
		}
		
		int tSum = 0;
		int tCnt = 0;
		for(int i=0; i<sumArr.length; i++) {
			tSum += sumArr[i];
			tCnt += arr[i].length;
		}
		System.out.printf("전체합계: %d, 평균: %.1f\n", tSum, (float)tSum/tCnt);
		
		
	}

}
