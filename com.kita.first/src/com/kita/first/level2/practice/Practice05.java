package com.kita.first.level2.practice;

public class Practice05 {
	public static void main(String[] args) {
		//while
		
//		int i =0;
//		while(true) {
//			int total = 0;
//			total+=i;
//			if(i>101) {
//				break;
//			}
//			System.out.println(total);
//			}
//			
		
		
		int n=1;
		int total = 0;
		while(true) {
			if(n>100) {
				break;
			}
			total =total+n;
			n++;
		}
		System.out.println(total);
		}
	}


