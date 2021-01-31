package com.kita.first.level2.practice;

import java.util.Scanner;

public class Practice06 {
	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);

	int total=0;
	while(true) {
		System.out.print("숫자를 입력하세요(0 입력 시 종료): ");
		int num = sc.nextInt();
		if(num == 0) {
			break;
		}
		total += num; 
	}
	sc.close();
	System.out.println("합계: " + total);
	}
}

