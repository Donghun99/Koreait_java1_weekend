package com.kita.first.level1;

public class Print2 {
	public static void main(String[] args) {
		String name = "이동훈";
		int age =200;
		
		
		System.out.println("제 이름은 "+name+"이고"+" 나이는 "+age+"세입니다.");
		//System.out.printf("문자열 형식",변수1, 변수2,...);
		System.out.printf("제 이름은 %s이고 나이는 %5d세 입니다.\n",name,age);//전체 칸을 5개로 만들겠다는 의미 빈칸은 2칸 
		
		double grade = 3.3333333;
		System.out.printf("제 학점은 평균 %.2f입니다.",grade);
	}

}
