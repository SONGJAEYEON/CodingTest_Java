package Programmers.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class Programmers_가장먼노드_Lv3 {

	public static void main(String[] args) {
		
		//java는 딕셔너리가 아니고 이렇게 인접행렬 형태로 바꿔서 푸는사람들이 많네,,, 
		int n=6;
		int[][] edge= {{3,6},{4,3},{3,2},{1,3},{1,2},{2,4},{5,2}};
		int[] d = new int[n+1];
        boolean[][] visited = new boolean[n+1][n+1];
        for(int i = 0; i < edge.length; i++) {
            visited[edge[i][0]][edge[i][1]] = true;
            visited[edge[i][1]][edge[i][0]] = true;
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(1);//1번 노드에서 가장 멀리 떨어진 곳을 구하는거니까 이렇게!! 

        int max = 0;
        while(!q.isEmpty()) {
            int cur = q.poll();
            for(int next = 2; next <= n; next++) {
                if (d[next] == 0 && visited[cur][next]) {
                    d[next] = d[cur] + 1;
                    q.add(next);
                }
            }

            if (max <= d[cur]) {
                max = d[cur];
            }
        }

        int count = 0;
        for(int dist : d) {
            count += (dist == max) ? 1 : 0;
        }

//        return count;
        System.out.println(count);
   }
	
}
