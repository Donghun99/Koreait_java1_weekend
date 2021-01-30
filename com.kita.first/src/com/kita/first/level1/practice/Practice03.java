package com.kita.first.level1.practice;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("수학 응시 유형을 입력해 주세요: ");
//		String gana = sc.next();
//		System.out.print("점수를 입력해 주세요: ");
//		int score = sc.nextInt();
		
//		if(gana == "가" && score ==60) {
//			System.out.println("평균입니다.");
//		}else if(gana=="가 " && score >60) {
//			System.out.println("평균 초과 입니다.");
//		}else if(gana=="가 " && score <60) {
//			System.out.println("평균 미만 입니다.");
//		}else if(gana == "나" && score ==70) {
//			System.out.println("평균입니다.");
//		}else if(gana=="나 " && score >70) {
//			System.out.println("평균 초과 입니다.");
//		}else {
//			System.out.println("평균 미만 입니다.");
//			
//		}
		
        Scanner sc = new Scanner(System.in);
		
		System.out.print("수학 응시 유형을 입력해 주세요: ");
		String type = sc.next();
		System.out.print("점수를 입력해 주세요: ");
		int score = sc.nextInt();
		
		int avg = 0;
		
		
		if("가".equals(type)) {
			   avg = 60;
			if(score < 60) {
				System.out.println("평균미만입니다.");
			}else if(score >60) {
				System.out.println("평균 초과 입니다.");
			}else {
				System.out.println("평균입니다");
			}
			
		}else if("나".equals(type)){
			if(score < 70) {
				System.out.println("평균미만입니다.");
			}else if(score >70) {
				System.out.println("평균 초과 입니다.");
			}else {
				System.out.println("평균입니다");
			}
		}else {
			System.out.println("잘못 입력했습니다.");
		}
		
		
		
		
		
		
		
		
	}

}
