package Programmers.BruteForce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Programmers_모의고사_Lv1 {

	public static void main(String[] args) {
		int[] answers= {1,2,3,4,5,4,3,2,1,2,3,1,1};
		int[] first= {1,2,3,4,5};
		int[] second= {2,1,2,3,2,4,2,5};
		int[] third= {3,3,1,1,2,2,4,4,5,5};
		int[] cnt= {0,0,0};
		int firstSize=first.length;
		int secondSize=second.length;
		int thirdSize=third.length;
		for(int i=0;i<answers.length;i++) {
			cnt[0]+=((first[i%firstSize]==answers[i])?1:0);
			cnt[1]+=((second[i%secondSize]==answers[i])?1:0);
			cnt[2]+=((third[i%thirdSize]==answers[i])?1:0);
		}
		int maxValue=Math.max(cnt[0], Math.max(cnt[1], cnt[2])); 
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<cnt.length;i++) {
			if(cnt[i]==maxValue) list.add(i+1);
		}
		int[] answer = new int[list.size()];
		for(int i=0;i<answer.length;i++) {
			answer[i]=list.get(i);
		}
		System.out.println(Arrays.toString(answer));
//		return list.stream().mapToInt(i->i.intValue()).toArray();
		

		
	}

}
