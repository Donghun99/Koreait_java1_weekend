package com.kita.first.level2;

public class While {
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			System.out.println(i);
		}
//		while(조건식) {
//			실행식
//		}
		
		int i =0;//초기식
		while(i<3) {
			i++;
			System.out.println(i);
		}
		
//		while(true) {
//			if(조건식) {
//				실행식
//				break; //가장 가까운 반복문을 빠져나간다
//			}
//		}
	}

}
