package com.kita.first.level2.practice;

import java.util.Scanner;

public class Practice07 {
	public static void main(String[] args) {
		//랜덤값 10~90을 맞추는 게임
		//UP / DOWN / Great!!
		Scanner sc = new Scanner(System.in); //컨트롤+쉬프트+o
		int max = 90;
		int min = 10;
		int rNum = (int)(Math.random() *(max - min +1)+min);
		int myNum;
		
		while(true) {
			System.out.print("숫자를 입력하세요 :");
			myNum = sc.nextInt();
			
			if(myNum > max || myNum < min) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			if (rNum >myNum) {
				System.out.println("UP");
			}else if (rNum > myNum) {
				System.out.println("DOWN");
			}else {
				sc.close();
				System.out.println("GREAT!!");
				break;
			}
		}
	}

}
