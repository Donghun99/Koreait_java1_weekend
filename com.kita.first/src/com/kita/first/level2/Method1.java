package com.kita.first.level2;

public class Method1 {
	public static void main(String[] args) {
//		int n1 = 2;
//		int n2 = 3;
//		System.out.println(n1 + n2);
//		
		//Method1.sum(1, 2) 받아주는 변수가 없으면 void형 
		int result = Method1.sum(2,3);//정수값을 result에 담아준다.
		System.out.println(result);
		
		int result2 = Method1.minus(35, 22);
		System.out.println(result2);
	}
//	비 void형 메소드
//	public static 리턴타입 메소드명(매개변수1,매개변수2,....) {
//		코드
//		return 리턴타입 값;
//	}
//	
//	void형 메소드
//	public static void 메소드명(매개변수1,매개변수2,....) {
//		코드
//	}
	
	//비 void형으로 int값을 리턴하는 sum 메소드
	//매개변수는 int값 2개 가짐
	//두 매개변수를 더해서 리턴
    public static int sum(int n1, int n2) {
    	return n1 + n2;
    }//틀을 만들어주는 것이 메서드 역할
    
    //비void형으로 리턴타입이 int인 minus 메소드
    //매개변수1,2전부 int타입
    //매개변수1에서 매개변수2를 뺀 값을 리턴
    
    public static int minus(int n1, int n2) {
    	int result = n1 - n2;
    	return result;
    }
    
	
}
