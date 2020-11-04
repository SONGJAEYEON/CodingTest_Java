package Programmers.Exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class Programmers_최고의집합_Lv3 {
	
//	public static ArrayList<Integer> temp=new ArrayList<Integer>();
//	public static ArrayList<Integer> answer=new ArrayList<Integer>();
//	public static int multiMax = 0;
	
	public static void main(String[] args) {
	
		int n=2;//집합의 원소의 개수
		int s=8;//모든 원소들의 합
		
		if(n>s){
//			return new int[] {-1};
			System.out.println(-1);
		}
		int[] answer=new int[n];
		for(int i=0;i<answer.length;i++) {
			answer[i]=s/n;
		}
		for(int i=0;i<s%n;i++) {
			answer[i]++;
		}
		Arrays.sort(answer);
//		return answer;
		//그래,,, 조합 어뜨케 쓰는지 알게되어짜나,,, 그걸로 만조케,,,ㅠ
		
//		int[] arr=new int[s];
//		int[] num = new int[s-1];
//		for (int i = 1; i < num.length; i++) {
//			num[i]=i;
//		}
//		recombination(arr, s-1, n, 0, 0, num);
//		if(answer.isEmpty()) {
//			answer.add(-1);
//		}
//		System.out.println(answer);
	}
	//아,,,,,,,,,팔든,,,? 중복을 허용한 조합이었네요?
//	@SuppressWarnings("unchecked")
//	public static void combination(int[] arr,int n,int r,int idx,int target,int[] num) {
//		int total=0;
//		int multi=1;
//		if(r==0) {
//			for (int i = 0; i < idx; i++) {
//				total+=num[arr[i]];
//				multi*=num[arr[i]];
//				temp.add(num[arr[i]]);
//			}
//			System.out.println(temp);
//			if(total==(n+1) && multiMax<=multi ) {
//				multiMax=multi;
//				answer=(ArrayList<Integer>) temp.clone();
//			}else {
//				temp.clear();
//			}
//			return;
//		}else if(target==n) {
//			return;
//		}else {
//			arr[idx]=target;
//			combination(arr, n, r-1, idx+1, target+1, num);
//			combination(arr, n, r, idx, target+1, num);
//		}
//	}
	
//	@SuppressWarnings("unchecked")
//	public static void recombination(int[] arr,int n,int r,int idx,int target,int[] num) {
//		int total=0;
//		int multi=1;
//		if(r==0) {
//			for(int i=0;i<idx;i++) {
//				total+=num[arr[i]];
//				multi*=num[arr[i]];
//				temp.add(num[arr[i]]);
//			}
//			if(total==(n+1) && multiMax<=multi ) {
//				multiMax=multi;
//				answer=(ArrayList<Integer>) temp.clone();
//			}else {
//				temp.clear();
//			}
//			return;
//		}else if(target==n) {
//			return;
//		}else {
//			arr[idx]=target;
//			recombination(arr, n, r-1, idx+1, target, num);
//			recombination(arr, n, r, idx, target+1, num);
//		}
//	}
}
	
