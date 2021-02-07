package com.kita.first.level2;

public class ForEach {
	public static void main(String[] args) {
		int[] arr = {34, 67, 2, 11, 6, 90};
		
		//arr 안의 값들 순차적으로 출력
		for(int i = 0; i<arr.length; i++) {
			int val = arr[i];
			System.out.print(val + ", ");
		}
		System.out.println();
		for(int val : arr) {//배열안의 값을 담아서 순차적으로 돌리는 의미,배열의 길이만큼
			System.out.print(val + ", ");
		}
	}

}
