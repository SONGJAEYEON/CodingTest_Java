package Programmers.DFSBFS;

import java.util.LinkedList;

public class programmers_타켓넘버_Lv2 {
	
	public static void main(String[] args) {
		int[] numbers= {1,1,1,1,1};
		int target=3;
		//내가 지금 생각한 방법은 조합으로 싹따 뽑아서 그중에서 맞는애만 카운트 하는거거든? 답을 보자 다른사람들은 어떻게 했는지
		LinkedList<Integer> up = new LinkedList<Integer>();
		up.add(0);
		LinkedList<Integer> down=null;
		for(int i=0;i<numbers.length;i++) {
			down = new LinkedList<Integer>();
			for(int num : up) {
				down.add(num+numbers[i]);
				down.add(num-numbers[i]);
			}
			up=down;
		}
		int answer=0;
		System.out.println(up);
		for(int num : up) {
			if(num==target) {
				answer++;
			}
		}
		System.out.println(answer);
	}

}
//class Solution {
//    public int solution(int[] numbers, int target) {
//        int answer = 0;
//        answer = dfs(0, 0, target, numbers, answer);
//        return answer;
//    }
//
//    private int dfs(int idx, int sum_num, int target, int[] numbers, int answer){
//        if (idx == numbers.length){
//            if (sum_num == target){
//                answer += 1;
//            } 
//            return answer;
//        } else {
//            answer = dfs(idx + 1, sum_num + numbers[idx], target, numbers, answer) + dfs(idx + 1, sum_num - numbers[idx], target, numbers, answer);
//        }
//
//        return answer;
//
//    }
//}
