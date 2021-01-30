package com.kita.first.level1.practice;

import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값 하나를 입력하세요: ");
		int num = sc.nextInt();
		int result;
		
		if(num % 2 == 1) {
			result =1;
		}else {
			result =2;
		}
		
		switch(result) {
		case 1 :
			System.out.println("홀수입니다");
			break;
		case 2 :
			System.out.println("짝수입니다.");
			break;
		}
		
	}

}
