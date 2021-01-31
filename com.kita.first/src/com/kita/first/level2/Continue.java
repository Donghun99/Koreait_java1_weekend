package com.kita.first.level2;

public class Continue {
	public static void main(String[] args) {
		for(int i=0; i<9; i++) {
			if(i==5) {
				System.out.println("Continue를 만납니다.");
				continue;//그 회차만 종료시키고 가장 가까운 for문의 증감식으로 간다
			}
			System.out.printf("i는 %d입니다\n",i);
			}
		
		for(int i=0;i<4;i++) {
			for(int z=0;z<135;z++) {
				if(z==2) {
					//continue;
					break; //가장 가까운 반복문을 빠져나간다
				}
				System.out.printf("i: %d, z: %d\n",i,z);
			}
		}
	}

}
