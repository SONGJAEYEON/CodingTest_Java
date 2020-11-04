package Programmers.StackQueue;

import java.util.*;

public class Programmers_기능개발_Lv2 {
	
	public static void main(String[] args) {
		int[] progresses= {93, 30, 55};
//			{95, 90, 99, 99, 80, 99};
//			{93, 30, 55};
		int[] speeds={1,30,5};
//			{1, 1, 1, 1, 1, 1};
//			{1,30,5};
		
		Queue<Integer> left = new LinkedList<Integer>();
		for(int i=0;i<progresses.length;i++) {
			left.add((int) Math.ceil((double)(100 - progresses[i]) / speeds[i]));
		}
//		System.out.println(left);
		ArrayList<Integer> list=new ArrayList<Integer>();
		while(!left.isEmpty()) {
			int value=left.poll();
			int cnt=1;
			while(!left.isEmpty() && left.peek()<=value) {
				left.poll();
				cnt++;
			}
			list.add(cnt);
		}
		int[] answer=new int[list.size()];
		for(int i=0;i<list.size();i++) {
			answer[i]=list.get(i);
		}
//		System.out.println(Arrays.toString(answer));
		
		
	}

}
