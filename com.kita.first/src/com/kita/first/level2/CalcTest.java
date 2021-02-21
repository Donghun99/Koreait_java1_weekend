package com.kita.first.level2;

public class CalcTest {
	public static void main(String[] args) {
		Calc.powerOn();
		int result1 = Calc.sum(1, 2);
		System.out.println("result1: " + result1);
		
		int result2 = Calc.minus(33, 56);
		System.out.println("result1: " + result1);
		
		int result3 = Calc.multiply(2, 3);
		System.out.println("result3: " + result3);
		
		int result4 = Calc.divide(5, 3);
		System.out.println("result4: " + result4);
		
		Calc.powerOff();
		
		int result5 = Calc.sum(1,2,3,4,6,8,7,4);
		System.out.println("result5: "+ result5);
	}

}
