package Goorm.DFSBFS;

import java.util.Arrays;

public class test2 {
public static void main(String[] args) {
	int day=3;//공사 기간 일수 
	int width=10;//작업 영역의 너비
	
	//사용한 시멘트의 양을 출력하자!!
	int[][] blocks= {{6,12,0,2,8,4,0,7,3,6},{6,1,3,0,2,8,0,0,13,8},{6,3,0,10,6,5,7,0,0,3}};//1일차에 쌓을 벽돌의 개수
//	{{6,2,11,0,3,5},{6,3,0,9,0,5}}
	//2일차에 쌓을 벽돌의 개수 
//	int[] line = new int[width];
	int[] line = {6,12,0,2,8,4,0,7,3,6};
	int max=0;
	int maxidx=0;
	for(int j=0;j<width;j++) {
		if(max<=line[j]) {
			max=line[j];
			maxidx=j;
		}
	}
	
	System.out.println(Arrays.toString(line));
	System.out.println(max);
	System.out.println(maxidx);

	//	for (int i = 0; i < blocks.length; i++) {
//		int max=0;
//		for(int j=0;j<width;j++) {
//			line[j]=blocks[i][j];
//			if(max<=line[j]) {
//				max=line[j];
//			}
//		}
//	}
	
//	2
//	6
//	6 2 11 0 3 5
//	6 3 0 9 0 5
	
//	20
	
//	3
//	10
//	6 12 0 2 8 4 0 7 3 6
//	6 1 3 0 2 8 0 0 13 8
//	6 3 0 10 6 5 7 0 0 3
	
//	69
	
}
}
