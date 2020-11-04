package Prgrammers.Greedy;

import java.util.ArrayList;

public class Programmers_섬연결하기_Lv3 {

	public static void main(String[] args) {
		int n=4;
		int[][] costs= {{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};
		//인접행렬 프림!!!
		int answer=0;
		int[][] adj=new int[n][n];
		for(int i = 0; i < costs.length; i ++) {
			adj[costs[i][0]] [costs[i][1]] = adj[costs[i][1]][costs[i][0]] = costs[i][2];
			// 와우,,, 조댐쓰,,! 
		}
//		System.out.println(Arrays.deepToString(adj));
		ArrayList<Integer> bridge = new ArrayList<>();
//		boolean[] visited = new boolean[n];
//		visited[0] = true;
		bridge.add(0);
		 while(bridge.size() < n) {
	            int min = Integer.MAX_VALUE;
	            int minIdx = 0;
	            for(int i = 0; i < bridge.size(); i++){
	                int island = bridge.get(i);
	                for(int j = 0; j < n; j++){
	                    if(island != j && !bridge.contains(j) && adj[island][j] > 0 && min > adj[island][j]){
	                        min = adj[island][j];
	                        minIdx = j;
	                    }
	                }
	            }
//	            visited[minIdx] = true;
	            bridge.add(minIdx);
	            answer += min;
	        }
//	        return answer;
		 System.out.println(answer);

		
		
	}
}
