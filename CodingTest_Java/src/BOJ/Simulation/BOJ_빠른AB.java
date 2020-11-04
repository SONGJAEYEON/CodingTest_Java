package BOJ.Simulation;

import java.io.*;
import java.util.*;

public class BOJ_빠른AB {
//	https://velog.io/@jsw4215/Java-BufferedReader-BufferedWriter%EB%A5%BC-%ED%99%9C%EC%9A%A9%ED%95%9C-%EB%B9%A0%EB%A5%B8-%EC%9E%85%EC%B6%9C%EB%A0%A5
//	https://www.acmicpc.net/problem/15552
  public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      StringTokenizer st;
      int TC = Integer.parseInt(br.readLine());
      
      for(int i=0;i<TC;i++) {
    	  st= new StringTokenizer(br.readLine());
    	  int A = Integer.parseInt(st.nextToken());
          int B = Integer.parseInt(st.nextToken());
          int sum = A+B;
          bw.write(sum + "\n");
      }
      bw.flush();
      bw.close();
  }
}
