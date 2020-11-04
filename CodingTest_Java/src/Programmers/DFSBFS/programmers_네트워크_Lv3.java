package Programmers.DFSBFS;

import java.util.HashSet;
import java.util.Stack;

public class programmers_네트워크_Lv3 {
	
	public static void main(String[] args) {
		
		int n=5;
		int[][] computers= {{1, 1, 0,1,0},{1, 1, 0,1,0},{0,0,1,0,1},{1, 1, 0,1,0},{0,0,1,0,1}};
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		int now=0;
		int answer=0;
		HashSet<Integer> visited = new HashSet<Integer>();
		while(visited.size()<n) {
			if(!stack.isEmpty()) {
				now=stack.pop();
				visited.add(now);
//				System.out.println(now+" "+visited);
				for(int i=0;i<n;i++) {
					if(!visited.contains(i)&& now!=i && computers[now][i]==1) {
						stack.push(i);//왜 1이 두번들어가지?!~ 이러면안되는데?~
//						System.out.println(" "+visited+" "+stack);
					}
				}
			}else {
				answer++;
				for(int i=0;i<n;i++) {
					if(!visited.contains(i)) {
						stack.push(i);
//						System.out.println(visited+" "+stack);
						break;
					}
				}
			}
		}
		System.out.println(answer+1);
	}
}
