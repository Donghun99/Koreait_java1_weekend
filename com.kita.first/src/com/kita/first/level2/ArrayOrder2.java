package com.kita.first.level2;

public class ArrayOrder2 {
	public static void main(String[] args) {
		int[] arr = {34, 67, 2, 11, 6, 90};
		int min; //가장 작은 값의 인덱스 담을 변수
		int temp; //임시로 값 저장하는 변수
		
		//arr를 선택정렬로 정렬후에 
		
		for(int i=0; i<arr.length-1; i++) {
			min = i;
			
			for(int j=i+1; j<arr.length; j++) {	
				if(arr[min]>arr[j]) {
					min = j;
				}
			}

			//temp 사용하여 값 교환
			if(min!=i) {
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
			
		} //forEach문 사용해서 arr안의 값 출력
			for(int val : arr) {
				System.out.print(val + ", ");
			}
			
		}
}
