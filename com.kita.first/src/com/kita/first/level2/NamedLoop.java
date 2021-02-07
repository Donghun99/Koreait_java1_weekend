package com.kita.first.level2;

public class NamedLoop {//이름을 가진 반복
	public static void main(String[] args) {
		Parent:
		for(int i=0; i<5; i++) {
			Child:
			for(int z=0; z<3; z++) {
				if(z==1) {
				//	break Parent;//가까운 반복을 빠져나감
					continue Parent;
				}
				System.out.printf("i: %d, z: %d\n", i, z);
			}
		}
	}

}
