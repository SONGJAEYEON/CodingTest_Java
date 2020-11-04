package Programmers.Heap;

import java.util.PriorityQueue;

public class Programmers_더맵게_Lv2 {

	public static void main(String[] args) {
		int[] scoville= {1,2,3,9,10,12};
		int K=7;
		PriorityQueue<Integer>q=new PriorityQueue<Integer>();
		
		for(int i=0;i<scoville.length;i++) {
			q.add(scoville[i]);
		}
		int cnt=0;
		while(q.size()>1 && q.peek()<K) {
			int first=q.poll();
			int second=q.poll();
			q.add(first+(second*2));
			cnt++;
		}
		if(q.size()<=1 &&q.peek()<K) cnt=-1;
//		return cnt;
	}
}
