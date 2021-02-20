package com.kita.first.level2.practice;

public class Practice10 {
	public static void main(String[] args) {
		//int배열 9칸짜리로 만들고
		//랜덤으로 값을 뽑아 배열에 집어넣기
		//랜덤값 겹치지 않게 값을 뽑아 배열에 집어넣기
		
		
		int[] arr = new int[9];
		
		int max = 9;
		int min = 1;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * (max-min+1)+min);
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--;
		            break;
				}
			}
		}
		
		for(int val : arr) {
			System.out.print(val + ", ");
		}
	}

}

