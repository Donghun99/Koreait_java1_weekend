package com.kita.first.level2;

public class Random {
	public static void main(String[] args) {
		double n = Math.random(); //0 ~ 0.9999999999 사이의 난수를 하나 발생시켜줌  0 <= n <1
		System.out.println("n : " +n);
		
		//1~10 사이의 수가 나옴
		int n2 =(int)(Math.random()* 10 + 1); //강제형변환
		System.out.println("n2 : "+n2);
		
		//1~5사이의 수
		int n3 =(int)(Math.random() * 5 + 1);
		System.out.println("n3 :" + n3);
		
		//2~13사이의 수
		//0~ 11   //0+2 <= n * 12 +2 <12 +2
		int n4 =((int)(Math.random() * 12 + 2));
        System.out.println("n4 :"+ n4);
		
		//17~51사이의 수
		//0~34 0+17<= n * 35+17 <35+17
		int n5 = (int)(Math.random() *35 +17);
		System.out.println("n5: "+n5);
		
		int max = 51;
		int min = 17;
		int rNum = (int)(Math.random() *(max - min +1)+min); //공식!!
		
		
	
	}

}
