package Programmers.Sorting;

import java.util.Arrays;

public class programmers_H_index_Lv2 {
	
	public static void main(String[] args) {
		int[] citations= {0,1,3,5,6};
			//{3, 0, 6, 1, 5,7,8,9};
		//발표한 논문 n편중
		//h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었을때 
		//h의최대값이 이 과학자의 랄랄라 
		int answer=0;
		Arrays.sort(citations);
		for (int i = citations.length -1 ; i >= 0 ; i--) {
            if(citations.length -i >= citations[i])
                break;
            answer++;
        }
        System.out.println(answer);
		
		
	}
}
