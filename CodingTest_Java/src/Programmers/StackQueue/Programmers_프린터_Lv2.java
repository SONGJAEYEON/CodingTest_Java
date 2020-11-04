package Programmers.StackQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Programmers_프린터_Lv2 {
	public static void main(String[] args) {
		
		//내가 뭘 잘못했을까? 흠,,ㅠ
		//그 클래스만든분의 코드를 봐야쓰것네,,ㅠ
		int[] priorities= {1, 1, 9, 1, 1, 1};
		int location=0;
		LinkedList<int[]> queue= new LinkedList<int[]>();
		LinkedList<int[]> answer= new LinkedList<int[]>();
		for(int i=0;i<priorities.length;i++) {
			int[] value= {i,priorities[i]};
			queue.add(value);
		}
		Stack<int[]> temp=new Stack<int[]>();
		answer.add(queue.poll());
		while(!queue.isEmpty()) {
			if(queue.peek()[1]<=answer.peekLast()[1]) {
				answer.add(queue.poll());
			}else {
				while(!answer.isEmpty() && answer.peekLast()[1]<queue.peek()[1]) {
					temp.push(answer.pollLast());
				}
				answer.add(queue.poll());
				while(!temp.isEmpty()) {
					queue.add(temp.pop());
				}
			}
		}
		for(int i=0;i<answer.size();i++) {
			if(answer.get(i)[0]==location) {
				System.out.println(i+1);
//				return i+1;
				break;
			}
		}

		
	}
	public static void printArr(LinkedList<int[]> answer) {
		for(int[] arr:answer) {
		System.out.print(Arrays.toString(arr)+" ");
		}
		System.out.println();
	}
	public static void printStack(Stack<int[]> temp) {
		for(int[] arr:temp) {
		System.out.print(Arrays.toString(arr)+" ");
		}
		System.out.println();
	}
}
