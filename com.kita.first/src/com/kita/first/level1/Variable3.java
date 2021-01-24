package com.kita.first.level1;

public class Variable3 {
	public static void main(String[] args) {
		// int<long<float<double<String
		int v1 = 3;
		int v2 = 5;
		System.out.println(v1 + v2);
		
		int result1 = v1 + v2;
		System.out.println(result1);
		
		double v3 = 2.4;
		int result2 = v1 + (int)v3;
		System.out.println(result2);
		
		long v4 = 12L;
		double result3 = v4;
		float result4 = v4; //자동 형변환
		
		System.out.println(1+2+3);
		System.out.println(1+2+"3");
		System.out.println(1+"2"+3);
		System.out.println("1"+2+3);
		
		String s1 ="123";
		int n4 = Integer.parseInt(s1); //문자열을 정수형으로 변환할 때
		double n6 = Double.parseDouble(s1);
		int n5 = 1;
		System.out.println(n4 + n5);
	}

}
