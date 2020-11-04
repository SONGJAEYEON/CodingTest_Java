package Programmers.MonthlyTest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Pretest_1 {

    private static int dx[] = {0,0,1,-1};
    private static int dy[] = {1,-1,0,0};
    private static int[] aparts = new int[25*25];
    private static int n;
    private static int apartNum = 0; //아파트 단지 번호의 수
//    private static boolean[][] visited = new boolean[25][25]; //방문여부
    private static boolean[][] visited;
//    private static int[][] map = new int[25][25]; //지도
    private static int[][] map;

    
	public static void main(String[] args) {
//		https://dragon-h.tistory.com/40?category=789780
		//이 블로그  좋네~~ 
//		https://n1tjrgns.tistory.com/245
		//하지만 이 블로그를 보며 참고를 해찌^^
		
//		# v    answer
//		# [[0,0,1,1],[1,1,1,1],[2,2,2,1],[0,0,0,2]]    [2,1,2]
//		# [[0,0,1],[2,2,1],[0,0,0]]    [2,1,1]
//		 Scanner sc = new Scanner(System.in);
//	        n = sc.nextInt();
//
//	        map = new int[n][n];
//	        visited = new boolean[n][n];
//
//	        //전체 사각형 입력 받기
//	        for(int i=0; i<n; i++){
//	            String input = sc.next();
//	            for(int j=0; j<n; j++){
//	                map[i][j] = input.charAt(j)-'0';
//	            }
//	        }
		
//		# v    answer
//		# [[0,0,1,1],[1,1,1,1],[2,2,2,1],[0,0,0,2]]    [2,1,2]
//		# [[0,0,1],[2,2,1],[0,0,0]]    [2,1,1]
		
		int[][] v= {{0,0,1,1},{1,1,1,1},{2,2,2,1},{0,0,0,2}};
		int[] answer=new int[3];
		int n=v.length;
		map=v;
		visited=new boolean[n][n];

	        for(int i=0; i<n; i++){
	            for(int j=0; j<n; j++){
	                if(!visited[i][j]){
	                    dfs(i,j,answer);
//	                    bfs(i,j);
	                }
	            }
	        }
	        System.out.println(Arrays.toString(answer));
//	        System.out.println(Arrays.toString(aparts));
//	        Arrays.sort(aparts);
//	        System.out.println(apartNum+"--------------");
//
//	        for(int i=0; i<aparts.length; i++){
//	            if(aparts[i] == 0){
//	            }else{               
//	                System.out.println(aparts[i]);
//	            }
//	        }
	        
	}
	 private static void dfs(int x, int y,int[] answer) {
	        visited[x][y] = true;

	        for(int i=0; i<4; i++){
	            int nx = x + dx[i];
	            int ny = y + dy[i];

	            if(nx >=0 && ny >=0 && nx < n && ny < n){
	                if(map[nx][ny] == map[x][y] && !visited[nx][ny]){
	                    dfs(nx,ny,answer);
	                    System.out.println("쁘라쓰");
	                }else {
	                	answer[map[x][y]]++;
	                	System.out.println("쁘라쓰");
	                }
	            }
	        }
	    }
//	 private static void dfs(int x, int y) {
//	        visited[x][y] = true;
//	        aparts[apartNum]++;
//
//	        for(int i=0; i<4; i++){
//	            int nx = x + dx[i];
//	            int ny = y + dy[i];
//
//	            if(nx >=0 && ny >=0 && nx < n && ny < n){
//	                if(map[nx][ny] == 1 && !visited[nx][ny]){
//	                    dfs(nx,ny);
//	                }
//	            }
//	        }
//	    }
//	 private static void bfs(int x, int y) {
//	        //2차원 LinkedList를 가진 큐 선언
//	        Queue<int[]> que = new LinkedList<>();
//	        que.add(new int[]{x,y});
//	        visited[x][y] = true;
//	        aparts[apartNum]++;
//
//	        while(!que.isEmpty()){
//
//	            //x, y 값을 받아오기 위한 방법
//	            int curX = que.peek()[0];
//	            int curY = que.peek()[1];
//	            que.poll();
//
//	            for(int i=0; i<4; i++){
//	                int nx = curX + dx[i];
//	                int ny = curY + dy[i];
//
//	                if(nx >= 0 && ny >= 0 && nx < n && ny < n){
//	                    if(map[nx][ny] == 1 && !visited[nx][ny]){
//	                        que.add(new int[]{nx,ny});
//	                        visited[nx][ny] = true;
//	                        aparts[apartNum]++;
//	                    }
//	                }
//	            }
//	        }
//	    }
}
