package com.kita.first.level1;

public class Operator2 {
	public static void main(String[] args) {
		int n1 =3;
		System.out.println(n1++); //이 줄 완료된 이후 1을 더한다 //3
		System.out.println(n1); //4
		System.out.println(++n1); //++값을 먼저 처리한다 //5
		
		System.out.println(n1--); //5
		System.out.println(n1); //4
		System.out.println(--n1);//3
		
		
	}

}
