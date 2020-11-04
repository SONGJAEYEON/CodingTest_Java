package BOJ.DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_SWEA_1949_등산로조정 {
	
	static int[][] search = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
    static int N, K, MAX;


	public static void main(String[] args) throws IOException {
//		https://buddev.tistory.com/12이것도 참고해보자!! (이 블로그는 아니지만,, swea문제를 많이 푸셨더라고?)
		//등산로를 만드ㅡㄴ 규칙은 다음과 같다
		// 등산로는 가장 높은 봉우리에서 시작해야한다
		// 등산로는 산으로 올라갈 수 있도록 반드시 높은지형에서 낮은지형으로 가고 가로 또는 세로 방향으로 연결도이ㅓ야한다
		//즉, 높이가 같은곳 혹은 낮은지형이나 대각선 방향은 불가능하다
		//긴 등산로를 만들기 위해서 딱 한곳을 정해서 최대 k만큼 지형을 깎는 공사르 ㄹ할 수 있다
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            MAX = Integer.MIN_VALUE;
            StringTokenizer token = new StringTokenizer(br.readLine());
            N = Integer.parseInt(token.nextToken());
            K = Integer.parseInt(token.nextToken());
            int[][] arr = new int[N][N];
            int max = 0;
            //arr 값이 뭔지 넣으면서 최대값이뭔지 찾기!! 
            for (int r = 0; r < N; r++) {
                token = new StringTokenizer(br.readLine());
                for (int c = 0; c < N; c++) {
                    arr[r][c] = Integer.parseInt(token.nextToken());
                    if (max < arr[r][c]) {
                        max = arr[r][c];
                    }
                }
            }
            List<Point> list = new ArrayList<>();
            //최대값을 가지는 좌표를 클래스로 새로 선언해서 넣어줬네?
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    if (max == arr[r][c]) {
                        list.add(new Point(r, c));
                    }
                }
            }
            //와 지린닷,,,,,
            for (int k = 0; k <= K; k++) { //최대공사가능깊이 k
                for (int r = 0; r < N; r++) {
                    for (int c = 0; c < N; c++) {
                        if (arr[r][c] - k < 0) {
                            continue;
                        } else {
                            arr[r][c] -= k;
                        }
                        for (int i = 0; i < list.size(); i++) {
                            dfs(list.get(i).r, list.get(i).c, 1, arr);
                        }
                        arr[r][c] += k;
                    }
                }
            }
            System.out.println("#" + tc + " " + MAX);
        }
	}
	 static void dfs(int r, int c, int cnt, int[][] copy) {
	        for (int s = 0; s < search.length; s++) {
	            int nr = r + search[s][0];
	            int nc = c + search[s][1];
	            if (isIn(nr, nc) && copy[r][c] > copy[nr][nc]) {
	                dfs(nr, nc, cnt + 1, copy);
	            }
	        }
	        if (MAX < cnt) {
	            MAX = cnt;
	        }
	    }
	 
	    static boolean isIn(int r, int c) {
	        return r >= 0 && c >= 0 && r < N && c < N;
	    }
	 
	    static class Point {
	        int r, c;
	 
	        public Point(int r, int c) {
	            super();
	            this.r = r;
	            this.c = c;
	        }
	    }
}
//	https://gaybee.tistory.com/35?category=846865
//  https://gaybee.tistory.com/35?category=846865
// 물론 여기도 많습ㄴ디ㅏ,,, 블로그하시는분들은 다  비슷비슷군여?! 