package Programmers.Exercise;

import java.util.Arrays;

public class Programmers_거스름돈_Lv3 {
	
	public static void main(String[] args) {
		int n =7;
		int[] money = {2,3,4};
		
		int[] dp=new int[n+1];
		dp[0]=1;//이게 무슨의미인지 도대체 모르겟어 ㅠㅜ
		for (int i = 0; i < money.length; i++) {
			for (int j = money[i]; j <=n; j++) {
				dp[j]=dp[j]+dp[j-money[i]];
			}
			System.out.println(Arrays.toString(dp));
		}
		System.out.println();
		System.out.println(Arrays.toString(dp));
	}

}
