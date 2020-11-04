package Goorm.DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 최단거리구하기 {
//	https://www.acmicpc.net/problem/14923 이거랑 비슷할뜻!!! 
	//백준 미로탈출
//	https://www.acmicpc.net/problem/2178
//	https://velog.io/@juhyun7793/%EB%B0%B1%EC%A4%80-2178-%EB%AF%B8%EB%A1%9C%EC%B0%BE%EA%B8%B0-Java
//	2178이랑 문제 그냥 똑같네,,,ㅎ
	
	static int[][] arr;
	static int N;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static boolean[][] visited;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		arr=new int[N][N];
		visited=new boolean[N][N];
		
		for (int i = 0; i <N; i++) {
			st=new StringTokenizer(br.readLine());
//			String line= st.nextToken();
//			System.out.print(line);
			for (int j = 0; j <N; j++) {
//				arr[i][j]=line.charAt(j)-'0';
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		System.out.println(Arrays.deepToString(arr));
		bfs(0,0);
//
        System.out.println(arr[N-1][N-1]);
	}
	public static void bfs(int i, int j){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {i,j});

        while(!q.isEmpty()){
            int location[] = q.poll();
            visited[i][j] = true;

            for(int dir = 0; dir<4; dir++){
                int r = location[0] + dx[dir];
                int c = location[1] + dy[dir];

                //좌표가 -1이 되거나 N or M이 되어 map의 범위를 벗어나면 안되므로
                if(r >= 0 && c >= 0 && r < N && c < N){
                    if(arr[r][c] != 0 && !visited[r][c]){
                        q.offer(new int[] {r,c});
                        visited[r][c] = true;
                        arr[r][c] = arr[location[0]][location[1]] + 1;
//                        System.out.println("-------------------------");
//                        for(int[] a: arr) {
//                        	System.out.println(Arrays.toString(a));
//                        }
//                        System.out.println("-------------------------");
                    }
                }
                if(r==N-1 && c==N-1) {
//                    System.out.println("----------끗---------------");
//                    for(int[] a: arr) {
//                    	System.out.println(Arrays.toString(a));
//                    }
//                    System.out.println("-------------------------");
                	return;
                }
            }
        }
    }
}
