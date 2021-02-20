package com.kita.first.level2;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = arr1; //주소값동일하여 같은 배열을 나타냄
//		
//		arr2[0] = 0;
//		
//		System.out.println(arr1[0]);
		System.out.println("arr1: " +arr1);
		System.out.println("arr2: " +arr2);
		
		int[] arr3 = new int[arr1.length];//기본값 {0,0,0,0}들어감
		
		for(int i=0; i<arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		
//		for(int i=0; i<arr3.length; i++) {
//			System.out.println(arr3[i] + " ,");
//		}
//		
//		for(int val : arr3) {
//			System.out.println(val+ ", ");
//		}
		
		System.out.println(Arrays.toString(arr3));//그냥 arr만 찍으면 주솟값이 출력
		System.out.println("arr3: " +arr3);
		
		arr3[0] = 0;
		System.out.println("arr1[0]: " + arr1[0]);
	

 }
}
