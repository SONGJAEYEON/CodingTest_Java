package BOJ.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class BOJ_11437_LCA {
	
	/*
	 * 
https://www.acmicpc.net/problem/11437
이 문제는 LCA(Lowest Common Ancestor)문제 이다.
이 문제는 depth를 모두 구하고 부모와 자식간의 관계를 구하여 트리를 만든 다음에
구하고자 하는 정점의 depth를 맞춰 준 다음 같은 노드가 될 때 까지 부모를 타고 하나씩 올라오면 됩니다.

6과 11의 lca를 구하는 것을 예로 들겠습니다.
부모 노드가 정해져 있지 않기 때문에 모든 노드ㅢ dfs를 돌면서 depth를 구합니다.
이때  depth가 0인 것은 depth를 아직 구하지 않은 노드이기 때문에 -> dfs를 물고 들어가서 depth를 update시켜 줍니다.
루트 노드인 1부터 출발합니다. 1과 연결된 점으로 우선 2가 있습니다.
그러면 2에는 465가 있습니다. 재귀로 들어왔기 때문에  4는 depth가 증가된 상태입니다.
4와 연결된 점 29가 있는데 2는 이미 depth를 구했고 9를 from값으로 들어갑니다.

이제 더이상 9와 연결된 점이 없습니다. (4는 이미 depth가 update됨)

그러면 이제 4가 from인 context로 돌아와서 9의 부모가 4가 됨을 알 수 있습니다.
4에 대해서 끝났고 from인 context로 돌아와소 6을 탐색하고 6의 부모는 2임을 update할 수 있습니다.
이와 같은 방식으로 depth를 가지고  부모와 자식간의 관계를 구할 수 있습니다.

이제 둘 중 depth가 더 작은 것에 기준을 맞춰서 depth를 같게해줍니다.
11의 depth가 더 크기 때문에 6에 맞추어 올려줍니다. 즉 11은 5로 바뀝니다.

그리고 depth를 하나씩 감소시키면서(위로 올라가면서) 같은 값이 나올때 까지 반복합니다.
6과 11에서 paranet를 이용해 하나씩 올리면 둘다 2가 나오면서 같게되고 이기 LCA가 됩니다.
	 * 
	 * */
	static int vertexNum;
	static ArrayList<ArrayList<Integer>> tree;
	static int m;
	static int[] depth;
	static int[] parent;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//입력 받기
		vertexNum=Integer.parseInt(br.readLine());
		tree=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<vertexNum+1;i++) {
			tree.add(new ArrayList<Integer>());
		}
		
		for (int i = 0; i < vertexNum-1; i++) {
			String[] temp=br.readLine().split(" ");
			int a=Integer.parseInt(temp[0]);
			int b=Integer.parseInt(temp[1]);
			tree.get(a).add(b);
			tree.get(b).add(a);
		}
		
		depth=new int[vertexNum+1];//깊이
		parent=new int[vertexNum+1];//부모
		m=Integer.parseInt(br.readLine());
		
		// 정점들의 depth구하기
		dfs(1,1);
//		System.out.println(tree);
//		System.out.println(Arrays.toString(depth));
//		System.out.println(Arrays.toString(parent));
		
		for (int i = 0; i < m; i++) {
			String[] temp2=br.readLine().split(" ");
			int a=Integer.parseInt(temp2[0]);
			int b=Integer.parseInt(temp2[1]);
			int same=solve(a,depth[a],b,depth[b]);
			System.out.println(same);
		}
		br.close();
		
	}
	public static void dfs(int from,int cnt) {
		//뭔가 졸라 더려워보이는데,,, 
		depth[from]=cnt++;
		for(Integer next:tree.get(from)) {
			if(depth[next]==0) {
				parent[next]=from;
				dfs(next,cnt);
			}
		}
	}
	public static int solve(int a, int a_depth,int b,int b_depth) {
		//둘의 depth가 같아질 때 까지 위로 올린다.
		if(a_depth>b_depth) {
			while(a_depth!=b_depth) {
				a_depth--;
				a=parent[a];
			}
		}else if(a_depth<b_depth) {
			while(a_depth!=b_depth) {
				b_depth--;
				b=parent[b];
			}
		}
		while(a!=b) {
			a=parent[a];
			b=parent[b];
		}
		return a;
		//이거 맞아,,? 이거 너무,,, 느려보이는데,,?
	}

}
