package com.kita.first.level1.practice;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {
		//switch로 해결
		//월을 입력해 주세요 : (1~12)
		//3~5를입력했다면"봄입니다"
		//6~8를 입력했다면 "여름입니다."
		//9~11를 입력했다면 "가을입니다."
		//1,2,12를 입력했다면 "겨울입니다."
		//1~12가 아닌 값을 입력했다면 "잘못 입력하셨습니다."
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("월을 입력해 주세요(1~12) : ");
		
		String month = sc.next();
		sc.close();
		
		int monthNum = Integer.parseInt(month);
		String season = "";
		
		
		
		
		switch(monthNum) {
		case 3: case 4: case 5:
			season = "봄";
			break;
			
		case 6: case 7: case 8:
			season = "여름";
			break;
		
		case 9: case 10: case 11:
			season = "가을";
			break;
		
		case 1: case 2: case 12:
			season = "겨울";
			break;
		
		default:
			System.out.println("잘못 입력하셨습니다.");
	}
		
		if(monthNum >= 1 && monthNum <= 12) {
			System.out.printf("%d월은 %s입니다.", monthNum, season);
		}
		
		
	}

}
