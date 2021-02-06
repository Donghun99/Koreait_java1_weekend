package com.kita.first.level2.practice;

public class Practice08 {
	public static void main(String[] args) {
		//10칸짜리 정수(int) 배열 arr 만들어서
		//1,2,3,4,5,6,7,8,9,10과  같이 값을 집어넣기
		//값을 전부 집어넣어 arr 안의 값을 출력
		int[] arr = new int[10]; //arr.length
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=i+1;
		}
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
