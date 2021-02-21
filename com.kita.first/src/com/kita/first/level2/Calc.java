package com.kita.first.level2;

public class Calc {
//	public static (리턴타입 or void) 메소드명동사형(매개변수){
//		실행코드
//		return 리턴타입 값;
//	}
	
	public static void powerOn() {
		System.out.println("전원을 킵니다.");
	}
	//전원 끄는 메소드
	public static void powerOff() {
		System.out.println("전원을 끕니다");
	}

	
	
	//int값을 2개 받아서 둘을 더한 값을 돌려주는 메소드
	public static int sum(int n1, int n2){
		int result = n1 + n2;
		return result;
	}
	
	//매개변수갯수, 타입, 
	public static double sum(double n1, double n2){ //오버로딩 매개변수의 차이에 따라 같은 이름의 매소드(sum)를 다르게 쓸수 있다,다른 매소드로 인식
		double result = n1 + n2;
		return result;
	}
	
	public static int sum(int... arr) {//매개변수를 모를때 , 배열로 만들어준다
		int result =0;
		for(int i=0; i<arr.length; i++) {
			result+= arr[i];
		}//괄호가 끝나면 result의 값이 사라지기 때문에 32번줄에 변수를 올려둔다.
		return result;
	}
	
	//int값을 2개 받아서 둘을 뺀값을 돌려주는 메소드
	//단, 두 값 중에 큰 수에서 작은수를 빼서
	//결과가 무조건 양수로 나오게 만드시오
	public static int minus(int n1, int n2){
		int result;
		
		if(n1>n2) {
			result = n1 - n2;
		}else {
			 result = n2 - n1;
		}
		return result;
	}
	
	//int값을 2개 받아서 둘을 곱한 값을 돌려주는 메소드
	public static int multiply(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	
	
	//int값을 2개 받아서 둘을 나눈 값(실수)를 돌려주는 메소드
	public static int divide(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}
	
	

}
