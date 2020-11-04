package Goorm.DFSBFS;

import java.util.Stack;

public class test3 {
public static void main(String[] args) {
//	2
//	B2(RG)
//	3(R2(GB))
//	BRGRG
//	RGBGBRGBGBRGBGB
	
//	3
//	3(BR2(R))
//	B(RGB(RG))
//	1B2R3G
	
//	BRRRBRRRBRRR
//	BRBGBBBRBBBG
//	BRRGGG
	
	
	
//	int numOfOrder=6;
//	String[] orderArr= {"B2(RG)","3(R2(GB))","3(BR2(R))","B(RGB(RG))","1B2R3G","2(R3G)"};
//	for (int i = 0; i < orderArr.length; i++) {
//		char[] arr = orderArr[i].toCharArray();
//		for (int j = 0; j < arr.length; j++) {
//			
//		}
//		
//	}
	String str = "3(R2(GB))";
	char[] arr=str.toCharArray();
//	char alpa = '3';
//	System.out.println(Character.isAlphabetic(alpa));
//	System.out.println(Character.isDigit(alpa));
	Stack<Character> stack = new Stack<Character>();
	Stack<Character>  alpha= new Stack<Character>();
	int i=0;
	while(i<arr.length) {
		if(Character.isDigit(arr[i])) {
			stack.push(arr[i]);
		}
		else if(arr[i]=='(') {
			while(Character.isAlphabetic(arr[i])) {
				alpha.push(arr[i]);
			}
		}
	}
	
}
}
