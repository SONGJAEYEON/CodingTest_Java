package Programmers.Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class Programmers_가장큰수_Lv2 {
//	https://developerdk.tistory.com/24
	public static void main(String[] args) {
		int[] numbers= {0,0,0,0,0};
		String[] arr=new String[numbers.length];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=String.valueOf(numbers[i]);
		}
		
		String answer="";
		Arrays.sort(arr,new Comparator<String>() {
			public int compare(String s1,String s2) {
				return (s2+s1).compareTo(s1+s2);
			}
		});
//		[Java] 객체 정렬하기 1부 - Comparable vs Comparator
//		https://www.daleseo.com/java-comparable-comparator/
		System.out.println(Arrays.deepToString(arr));
		//comparator이게뭐지,,,
		if(arr[0].equals("0")) System.out.println("0");
//			return "0"; //이게뭐지,,
		for(int i=0;i<arr.length;i++) {
			answer+=arr[i];
		}
		System.out.println(answer);
		
	}
}
