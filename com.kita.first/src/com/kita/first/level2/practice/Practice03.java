package com.kita.first.level2.practice;

public class Practice03 {
	public static void main(String[] args) {
		//2~9단찍기
		
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i + "*"+j + "=" +(i*j));
			}
			System.out.println();
		}
		
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.printf("%d  *  %d  =  %d\t",i,j,(i*j));
			}
			System.out.println();
		}
		
	}

}
