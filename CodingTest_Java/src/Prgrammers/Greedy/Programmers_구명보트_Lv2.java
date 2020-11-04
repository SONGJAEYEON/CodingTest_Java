package Prgrammers.Greedy;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Programmers_구명보트_Lv2 {
	
	public static void main(String[] args) {
		int[] people= {70, 50, 80, 50};
		int limit=100;
		Arrays.sort(people);
		Deque<Integer> weight = new ArrayDeque<Integer>();
		for (int i = 0; i < people.length; i++) {
			weight.add(people[i]);
		}
		int answer=0;
		while(!weight.isEmpty()) {
			if(weight.size()>1 && weight.peekFirst()+weight.peekLast()<=limit) {
				weight.pollFirst();
				weight.pollLast();
				answer++;
				System.out.println(weight+" "+answer);
			}else {
				weight.pollLast();
				answer++;
				System.out.println(weight+" "+answer);
			}
		}
		System.out.println(answer);
		
	}

}
