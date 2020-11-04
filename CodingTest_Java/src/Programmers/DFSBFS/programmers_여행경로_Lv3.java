package Programmers.DFSBFS;

import java.util.*;

public class programmers_여행경로_Lv3 {

	static boolean[] visited;
	static ArrayList<String> answers;
	
	public static void main(String[] args) {
		//오늘은 무슨일이 있어도 사전테스트 끝내는날!! 
		//오늘 식사는 이제끝! 이제 10시까지 코테 개빡시게 하고 집가서 자고 일어나서 아 오케
		String[][] tickets= {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
		int size=tickets.length;
		
		visited = new boolean[tickets.length];
		answers= new ArrayList<String>();
		int cnt=0;
		
		dfs(cnt,"ICN", "ICN", tickets);
		System.out.println(answers);
		Collections.sort(answers);
		System.out.println(answers);
		
		String[] answer= answers.get(0).split(" ");
		System.out.println(Arrays.toString(answer));
		
//		Hashtable<String,PriorityQueue<String>> hash = new Hashtable<String, PriorityQueue<String>>(); 
//		for (int i = 0; i < tickets.length; i++) {
//			if(hash.containsKey(tickets[i][0])) {
//				hash.get(tickets[i][0]).add(tickets[i][1]);
//			}else {
//				PriorityQueue<String> queue=new PriorityQueue<String>();
//				queue.add(tickets[i][1]);
//				hash.put(tickets[i][0], queue);
//			}
//		}
//		int cnt=0;
//		LinkedList<String> answer = new LinkedList<String>();
//		answer.add("ICN");
//		while(cnt<size) {
//			answer.add(hash.get(answer.peekLast()).poll());
//			cnt++;
//		}

			
	}
	public static void dfs(int cnt,String depart,String answer,String[][] tickets) {
		if(cnt==tickets.length) {
			answers.add(answer);
			return ;
		}
		
		for (int i = 0; i < tickets.length; i++) {
			if(!visited[i] && tickets[i][0].equals(depart)) {
				visited[i]=true;
				dfs(cnt+1,tickets[i][1],answer+" "+tickets[i][1],tickets);
				visited[i]=false;
			}
		}
	}
}
