package com.kita.first.level2.practice;

import java.util.Scanner;

public class Practice15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int LEN = 3; //게임 칸 개수
		int[] rArr = new int[LEN];//컴퓨터가 뽑는 값 배열
		int[] myArr = new int[LEN];// 내가 입력란 값 배열
		int max =9;
		int min =1;
		int Strike;
		int ball;
		
		System.out.println("숫자야구게임을 시작합니다");

		for(int i=0; i<LEN; i++) {
			rArr[i] = (int)(Math.random() * (max-min)+1)+min;
			for(int z=0; z<i; z++) {
				if(rArr[i] == rArr[z]) {
					i--;
					break;
				}
			}
		}

		
		while(true) {
			Strike =0;
			ball =0;
			
			for(int i=0;i<LEN;i++) {
				System.out.printf("값%d: ", i+1);
				myArr[i] = sc.nextInt();
				if(max < myArr[i] || min > myArr[i]) {
					System.out.println("범위 밖의 숫자입니다.");
					i--;
					continue;
				}
			     for(int j=0;j<i;j++) {
				    if(myArr[i]==myArr[j]) {
					   System.out.println("숫자가 중복되었습니다");
					   i--;
					   break;
				}
		       }
				
			}
			
			
			
			for(int i=0; i<LEN;i++) {
				if(myArr[i] == rArr[i]) {
					Strike++;
					continue;
				}
				for(int j=0; j<LEN;j++) {
					if(myArr[i] ==rArr[j]) {
						ball++;
					}
				}
			
			}
			if(Strike == LEN) {
				break;
			}
			System.out.printf("s: %d, b: %d ,o: %d\n",Strike, ball, LEN-Strike-ball);
		}
		
		System.out.println("종료");
	}

}
